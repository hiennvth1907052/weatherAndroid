package com.example.weatherapp.network;

import com.example.weatherapp.model.Weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL = "http://dataservice.accuweather.com";
    @GET("/forecasts/v1/hourly/12hour/2-353412_1_AL?apikey=NBTR3S7TAY9jIAvrjs9aaB5IpQJWPGCG&language=vi-vn&metric=true")
    Call<List<Weather>> getHour();

    @GET("/forecasts/v1/daily/5day/2-353412_1_AL?apikey=NBTR3S7TAY9jIAvrjs9aaB5IpQJWPGCG&language=vi-vn&metric=true")
    Call<List<Weather>> getDay();

}
