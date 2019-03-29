package com.example.demo.rxjava_retrofit;

import android.app.Application;

import com.example.demo.rxjava_retrofit.network.NetWorkManager;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        NetWorkManager.getInstance().init();
    }
}
