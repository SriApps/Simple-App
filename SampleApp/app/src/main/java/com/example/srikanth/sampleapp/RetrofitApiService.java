package com.example.srikanth.sampleapp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Srikanth on 19/08/2017.
 */

public interface RetrofitApiService {
           /*
        Retrofit get annotation with our URL
       */
        @GET("/sample.json")
        Call<ArrayList<jsonData>> getMyJSON();
    }

