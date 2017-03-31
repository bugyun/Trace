package com.ruoyun.tracelib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ruoyun.trace.Trace;

import java.util.HashMap;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        Trace
                .init("zyh")                 // default PRETTYLOGGER or use just init()
                .methodCount(3)                 // default 2
                .hideThreadInfo()               // default shown
                .logLevel(Trace.LogLevel.ASSERT)        // default LogLevel.FULL
                .methodOffset(0) ;          // default 0
//                .logAdapter(new AndroidLogAdapter()); //default AndroidLogAdapter
        Trace.d("hello");
        Trace.d("hello %s %d", "world", 5);   // String.format
//
        Trace.d("hello");
        Trace.i("hello");
        Trace.e("hello");
        Trace.w("hello");
        Trace.v("hello");
        Trace.wtf("你好");
        Trace.json("");
        Trace.xml("");
//        Logger.log(DEBUG, "tag", "message", throwable);
        Trace.d(list);

        HashMap map = new HashMap();
        map.put("12", "12");
        map.put("qq", "asacd");
        map.put("2", "12sas");
        map.put("212", "a");
        Trace.d(map);
        String[] str = {"12", "qwqw", "dsd", ""};
        Trace.d(str);
    }
}
