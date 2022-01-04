package com.sofunny.funnysdk.core.internal;

import android.content.Context;
import android.widget.Toast;

public class FunnyCommonBus {
    static FunnyCommonCallback mFunnyCommonCallback;

    public static void FunnyCommonInit0(FunnyCommonCallback funnyCommonCallback) {

        if (funnyCommonCallback != null) {
            mFunnyCommonCallback = funnyCommonCallback;
        }
    }

    public static void FunnyCommonInit(FunnyCommonCallback funnyCommonCallback) {
        if (funnyCommonCallback != null) {
            mFunnyCommonCallback = funnyCommonCallback;
        }
    }

    public static void startFunnyLogin(Context context, String flag,FunnyCommonCallback funnyCommonCallback, FunnyCallback funnyCallback) {
        if (flag == FunnyCommonType.MODULE_GP) {
            funnyCommonCallback.isCoreInit(context, funnyCallback, flag);
        } else if (flag == FunnyCommonType.MODULE_FB) {
            funnyCommonCallback.isCoreInit(context, funnyCallback, flag);
        } else if (flag == FunnyCommonType.MODULE_LOGIN) {
            funnyCommonCallback.isCoreInit(context, funnyCallback, flag);
        } else {
            Toast.makeText(context, "未引用 "+flag+  " SDK", Toast.LENGTH_SHORT).show();

        }
    }
    public static void startFunnyLogin(Context context, String flag, FunnyCallback funnyCallback) {
        if (flag == FunnyCommonType.MODULE_GP) {
            mFunnyCommonCallback.isCoreInit(context, funnyCallback, flag);
        } else if (flag == FunnyCommonType.MODULE_FB) {
            mFunnyCommonCallback.isCoreInit(context, funnyCallback, flag);
        } else if (flag == FunnyCommonType.MODULE_LOGIN) {
            mFunnyCommonCallback.isCoreInit(context, funnyCallback, flag);
        } else {
            Toast.makeText(context, "未引用 "+flag+  " SDK", Toast.LENGTH_SHORT).show();

        }
    }

}
