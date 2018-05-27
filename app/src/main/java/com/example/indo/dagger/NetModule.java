package com.example.indo.dagger;


import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetModule {
    public static final String COUNTR_BASE_URL = "https://restcountries.eu/rest/v1/";

    @Provides
    @Singleton
    Retrofit providesRetrofit(){

        return  new Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(COUNTR_BASE_URL)
                .build();
    }
    @Provides
    Call<List<Country>>provideCountryList(Retrofit retrofit){
        return retrofit
                .create(CountryService.class)
                .countrylist();
    }


}
























