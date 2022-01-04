package com.sofunny.gpserver;

import android.content.Context;
import android.widget.Toast;

import com.sofunny.funnysdk.core.internal.FunnyCallback;
import com.sofunny.funnysdk.core.internal.FunnyCommonCallback;
import com.sofunny.funnysdk.core.internal.FunnyCommonType;

public class GPFunnyCommonCallbackImpl implements FunnyCommonCallback {
    @Override
    public void isCoreInit(Context context, FunnyCallback funnyCallback,Object... objects) {
        String type = (String) objects[0];
        if (type == FunnyCommonType.MODULE_GP) {
            Toast.makeText(context, "GPS init success", Toast.LENGTH_SHORT).show();
        }
    }
}
