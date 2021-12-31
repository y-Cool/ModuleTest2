package com.sofunny.moduletest2;

import android.app.Application;
import android.content.Context;

import com.sofunny.funnysdk.core.EventBus;

public class MyApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        EventBus.init(getApplicationContext());
    }
}
