package com.test.retrofitdemo.rest;


import com.test.retrofitdemo.model.MoviesResponse;
import com.test.retrofitdemo.model.Post;
import com.test.retrofitdemo.model.PostResponseParent;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface ApiInterface {
    @GET("GetAllPSbyDist?District=2060")
    Call<MoviesResponse> getTopRatedMovies();

    //insecure
    @POST("rckCrimes")
    @FormUrlEncoded
    Call<PostResponseParent> savePost(@Field("Latitude") String Latitude,
                                      @Field("Longitude") String Longitude,
                                      @Field("crimetypeId") String crimetypeId,
                                      @Field("psid") String psid,
                                      @Field("subTypeId") String subTypeId,
                                      @Field("fromdate") String fromdate,
                                      @Field("todate") String todate,
                                      @Field("Radius") String Radius);


    @POST("rckCrimes")
    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    Call<PostResponseParent> savePost1(@Body Post post);
}
