package com.sergio.testmovie.Api;

import com.sergio.testmovie.Util.Constants;

public class ApiManager {

    private ApiManager() {
    }

    public static MovieApi getAPIService() {

        return RetrofitClient.getClient(Constants.URL).create(MovieApi.class);
    }
}
