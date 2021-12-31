package com.sofunny.moduletest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sofunny.funnysdk.core.EventBus;
import com.sofunny.funnysdk.core.PlatformModules;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.InitFunnySDKUtil(this, PlatformModules.MODULE_GP);
    }
}