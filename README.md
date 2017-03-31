# Trace
android 日志框架

## 使用方法

        Trace.init("zyh")                 
             .methodCount(3)                
             .hideThreadInfo()              
             .logLevel(Trace.LogLevel.ASSERT)        
             .methodOffset(0);
        Trace.d("hello");
        Trace.d("hello %s %d", "world", 5);   // String.format

        Trace.d("hello");
        Trace.i("hello");
        Trace.e("hello");
        Trace.w("hello");
        Trace.v("hello");
        Trace.wtf("你好");
        Trace.json("");
        Trace.xml("");
        Logger.log(DEBUG, "tag", "message", throwable);
        Trace.d(list);
        HashMap map = new HashMap();
        map.put("12", "12");
        map.put("qq", "asacd");
        map.put("2", "12sas");
        map.put("212", "a");
        Trace.d(map);
        String[] str = {"12", "qwqw", "dsd", ""};
        Trace.d(str);
        
## 引用方式

    allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }

    compile 'com.github.bugyun:Trace:1.0.0'
