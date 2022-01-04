package com.sofunny.moduletest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sofunny.fbserver.FBFunnyCommonCallbackImpl;
import com.sofunny.funnysdk.core.EventBus;
import com.sofunny.funnysdk.core.PlatformModules;
import com.sofunny.funnysdk.core.internal.FunnyCallback;
import com.sofunny.funnysdk.core.internal.FunnyCommonBus;
import com.sofunny.funnysdk.core.internal.FunnyCommonCallback;
import com.sofunny.funnysdk.core.internal.FunnyCommonType;
import com.sofunny.gpserver.GPFunnyCommonCallbackImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FunnyCommonCallback fbFunnyCommonCallback = new FBFunnyCommonCallbackImpl();
        FunnyCommonBus.FunnyCommonInit(fbFunnyCommonCallback);



        findViewById(R.id.btn2).setOnClickListener(view -> {
            FunnyCommonBus.startFunnyLogin(MainActivity.this, FunnyCommonType.MODULE_FB, new FunnyCallback() {
                @Override
                public void onSuccess(String code, String msg) {
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onError(String code, String msg) {

                }
            });

        });

        FunnyCommonCallback gpFunnyCommonCallback = new GPFunnyCommonCallbackImpl();
        findViewById(R.id.btn3).setOnClickListener(view -> {

            FunnyCommonBus.startFunnyLogin(MainActivity.this, FunnyCommonType.MODULE_GP, gpFunnyCommonCallback,new FunnyCallback() {
                @Override
                public void onSuccess(String code, String msg) {
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onError(String code, String msg) {

                }
            });
        });


        findViewById(R.id.btn0).setOnClickListener(view -> {
            EventBus.InitFunnySDKUtil(this, PlatformModules.MODULE_FB);

        });
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.InitFunnySDKUtil(MainActivity.this, PlatformModules.MODULE_GP);
            }
        });

    }
}