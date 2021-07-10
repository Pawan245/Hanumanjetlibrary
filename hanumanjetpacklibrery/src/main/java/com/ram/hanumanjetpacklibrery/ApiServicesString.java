package com.ram.hanumanjetpacklibrery;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiServicesString {


    @FormUrlEncoded
    @POST("order.php")
    Call<String> placeorder( @Field("PaasCode") String itms );





    @FormUrlEncoded
    @POST("invoice.php")
    Call<String> invoice( @Field("PaasCode") String itms );




/******************** Wishlist *************************************/


    @FormUrlEncoded
    @POST("wishlist_fetch.php")
    Call<String> getwishlist( @Field("UserId") String userid );

/*********************************************************************/









}
