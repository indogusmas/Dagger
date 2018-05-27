package com.example.indo.dagger;

import android.app.Application;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityPresenter {

    private final String TAG = MainActivityPresenter.class.getSimpleName();

    @Inject
    Call<List<Country>> countryList;

    public  MainActivityPresenter(Application application){
        ((Singleton) application).getNetComponent().inject(this);
        makeAPICall();
    }

    private void makeAPICall(){
        countryList.enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                Log.e(TAG, "onResponse: " + response );
            }

            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {
                Log.e(TAG, "onFailure: "+ t.getMessage() );
            }
        });
    }

}
