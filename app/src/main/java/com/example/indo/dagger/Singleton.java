package com.example.indo.dagger;

import android.app.Application;

import dagger.internal.DaggerCollections;


public class Singleton extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        netComponent =  DaggerNetComponent
                .builder()
                .netModule(new NetModule())
                .build();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
