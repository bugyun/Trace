package com.ruoyun.trace;

/**
 * Created by ruoyun on 2017/3/31.
 * 空实现，用于release版本
 */
public class FactoryWrapper implements Factory {

    private final Settings settings = new Settings();

    @Override
    public Factory t(String tag, int methodCount) {
        return this;
    }

    @Override
    public Settings init(String tag) {
        return settings;
    }

    @Override
    public Settings getSettings() {
        return settings;
    }

    @Override
    public void d(String message, Object... args) {

    }

    @Override
    public void d(Object object) {

    }

    @Override
    public void e(String message, Object... args) {

    }

    @Override
    public void e(Throwable throwable, String message, Object... args) {

    }

    @Override
    public void w(String message, Object... args) {

    }

    @Override
    public void i(String message, Object... args) {

    }

    @Override
    public void v(String message, Object... args) {

    }

    @Override
    public void wtf(String message, Object... args) {

    }

    @Override
    public void json(String json) {

    }

    @Override
    public void xml(String xml) {

    }

    @Override
    public void log(int priority, String tag, String message, Throwable throwable) {

    }

    @Override
    public void resetSettings() {
        settings.reset();
    }
}
