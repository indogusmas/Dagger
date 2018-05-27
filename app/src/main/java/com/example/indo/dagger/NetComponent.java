package com.example.indo.dagger;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetModule.class})
public interface NetComponent {

    void inject(MainActivityPresenter mainActivityPresenter);
}
