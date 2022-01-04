package com.sofunny.funnysdk.core.internal;

public interface FunnyCallback {
    void onSuccess(String code,String msg);
    void onError(String code,String msg);
}
