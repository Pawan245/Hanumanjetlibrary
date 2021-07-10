package com.ram.hanumanjetpacklibrery;


public class ApiUtils {

    private ApiUtils() {
    }

   /// public static final String BASE_URL = Constant.ECOMMERCE_URL;


    /**************Plain String format *****************************/

    public static ApiServicesString getAPIService2(String ECOMMERCE_URL) {

        return RetrofitClient.getClient2(ECOMMERCE_URL).create(ApiServicesString.class);
    }

}
