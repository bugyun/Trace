package com.ruoyun.trace;

/**
 * Created by ruoyun on 2017/3/30.
 * 跟踪，追踪； 追溯，探索； 探索； 查找.
 */
public final class Trace {

    private static final String DEFAULT_TAG = "TraceLogger";

    public interface LogLevel {//日志的等级
        int NONE = 1;
        int VERBOSE = 2;
        int DEBUG = 3;
        int INFO = 4;
        int WARN = 5;
        int ERROR = 6;
        int ASSERT = 7;
        int FULL = 8;
    }

    private static Factory factory = new FactoryWrapper();

    private Trace() {
    }

    /**
     * It is used to get the settings object in order to change settings
     *
     * @return the settings object
     */
    public static Settings init() {
        return init(DEFAULT_TAG);
    }

    /**
     * It is used to change the tag
     *
     * @param tag is the given string which will be used in Logger as TAG
     */
    public static Settings init(String tag) {
        factory = new LoggerFactory();
        return factory.init(tag);
    }

    public static void resetSettings() {
        factory.resetSettings();
    }

    public static Factory t(String tag) {
        return factory.t(tag, factory.getSettings().getMethodCount());
    }

    public static Factory t(int methodCount) {
        return factory.t(null, methodCount);
    }

    public static Factory t(String tag, int methodCount) {
        return factory.t(tag, methodCount);
    }

    public static void log(int priority, String tag, String message, Throwable throwable) {
        factory.log(priority, tag, message, throwable);
    }

    public static void d(String message, Object... args) {
        factory.d(message, args);
    }

    public static void d(Object object) {
        factory.d(object);
    }

    public static void e(String message, Object... args) {
        factory.e(null, message, args);
    }

    public static void e(Throwable throwable, String message, Object... args) {
        factory.e(throwable, message, args);
    }

    public static void i(String message, Object... args) {
        factory.i(message, args);
    }

    public static void v(String message, Object... args) {
        factory.v(message, args);
    }

    public static void w(String message, Object... args) {
        factory.w(message, args);
    }

    public static void wtf(String message, Object... args) {
        factory.wtf(message, args);
    }

    /**
     * Formats the json content and print it
     *
     * @param json the json content
     */
    public static void json(String json) {
        factory.json(json);
    }

    /**
     * Formats the json content and print it
     *
     * @param xml the xml content
     */
    public static void xml(String xml) {
        factory.xml(xml);
    }

}
