# 

### cmd
```shell
java -jar rhea-trace-shell.jar -a ${your app package name} -t 10 -o output.pb -r rhea.all sched -fullClassName

./gradlew clean

#重启，录制3s
java -jar rhea-trace-shell.jar -a rhea.sample.android -t 3 -o output.pb -r rhea.all sched -fullClassName

#自定义
java -jar rhea-trace-shell.jar -a rhea.sample.android -t 3 -o testLockWait.pb -r rhea.all sched -fullClassName




```

### 要插桩的类
com.bytedance.rheatrace.plugin.internal.RheaConstants
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