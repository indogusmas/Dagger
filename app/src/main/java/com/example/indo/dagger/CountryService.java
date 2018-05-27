package com.example.indo.dagger;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface CountryService {

    @GET("all")
    Call<List<Country>> countrylist();

}
