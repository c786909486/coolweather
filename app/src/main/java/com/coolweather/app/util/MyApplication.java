package com.coolweather.app.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by ASUS on 2016/11/7.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
