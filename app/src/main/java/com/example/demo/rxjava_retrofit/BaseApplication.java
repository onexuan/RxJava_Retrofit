package com.example.demo.rxjava_retrofit;

import android.app.Application;

import com.example.demo.rxjava_retrofit.network.NetWorkManager;


/**
 * Created by Zaifeng on 2018/3/1.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        NetWorkManager.getInstance().init();
    }
}
