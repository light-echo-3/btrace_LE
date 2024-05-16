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
HookJNI
```shell
#debug
# 修改btrace标记，启动时开启btrace
adb shell setprop debug.rhea.startWhenAppLaunch 1
# wait debugger attach
startWaitDebug
```
