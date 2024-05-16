# 

### cmd
```shell
java -jar rhea-trace-shell.jar -a ${your app package name} -t 10 -o output.pb -r rhea.all sched -fullClassName

./gradlew clean

#重启，录制3s
java -jar rhea-trace-shell.jar -a rhea.sample.android -t 3 -o output.pb -r rhea.all sched -fullClassName

#开启debug
 -debug

#自定义
java -jar rhea-trace-shell.jar -a rhea.sample.android -t 3 -o testLockWait2.pb -r rhea.all sched -fullClassName -debug	




```

### 要插桩的类
com.bytedance.rheatrace.plugin.internal.RheaConstants
com.bytedance.rheatrace.core.TraceStub#i(int)
com.bytedance.rheatrace.core.TraceStub#o(int, long)
### asm插桩
入口：  
com.bytedance.rheatrace.plugin.compiling.TraceMethodAdapter.onMethodEnter  
出口：  
com.bytedance.rheatrace.plugin.compiling.TraceMethodAdapter.onMethodExit


## pb
### perfetto.protos.TraceOuterClass.Trace

### 4. 线程创建监控
atrace::pthread_create_proxy

### native trace
ATRACE_FORMAT

### 测试锁 lock wait notify
rhea.sample.android.app.test.TestLock.testWait

### jni hook
[原理](https://blog.csdn.net/c6E5UlI1N/article/details/132419157)  


block_jni.cpp

```C++
//获取ArtMethod指针
static void **GetArtMethod(JNIEnv *env, jobject foo) {
    void **fooArtMethod;
    if (android_get_device_api_level() >= 30) {
        jclass Executable = env->FindClass("java/lang/reflect/Executable");
        jfieldID artMethodField = env->GetFieldID(Executable, "artMethod", "J");
        fooArtMethod = (void **) env->GetLongField(foo, artMethodField);
    } else {
        fooArtMethod = (void **) env->FromReflectedMethod(foo);
    }
    return fooArtMethod;
}
```
```C++
//确定jni函数地址在ArtMethod中的偏移
static void InitJNIHook(JNIEnv *env, jobject foo, void *fooJNI) {
    void **fooArtMethod = GetArtMethod(env, foo);
    for (int i = 0; i < 50; ++i) {
        if (fooArtMethod[i] == fooJNI) {//这里每次+8字节查找，能ok吗？
            jniEntranceIndex_ = i;
            break;
        }
    }
}

```

- art::ArtMethod定义
  /Volumes/light/aosp/aosp_20240506/art/runtime/art_method.h


### debug
HookJNI
```shell
#debug btrace需要执行如下脚本
# 修改btrace标记，启动时开启btrace
adb shell setprop debug.rhea.startWhenAppLaunch 1
# wait debugger attach
startWaitDebug
```
