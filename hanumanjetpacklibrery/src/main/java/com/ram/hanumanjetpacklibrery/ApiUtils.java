package com.ram.hanumanjetpacklibrery;


public class ApiUtils {

    private ApiUtils() {
    }

   /// public static final String BASE_URL = Constant.ECOMMERCE_URL;


    /**************Plain String format *****************************/

    public static ApiServicesString getAPIService2(String URL) {

        return RetrofitClient.getClient2(URL).create(ApiServicesString.class);
    }

}
