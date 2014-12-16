/**
 * @(#) Application.java Created on 2014-11-11
 *
 * Copyright (c) 2014 Aspire. All Rights Reserved
 */
package com.zilee.jinlinclient;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

/**
 * The class <code>Application</code>
 *
 * @author Administrator
 * @version 1.0
 */
public class JinLinApplication extends Application {
    
    private static Context context;
    
    public static Context getContext(){
        return context;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
    
}
