# 

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