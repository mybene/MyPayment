package com.example.mypayment;

import javax.security.auth.callback.Callback;

import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class ApiService {
    public static void findUserCountry(String countryName, Callback callback) {
        OkHttpClient client = new OkHttpClient.Builder()
                .build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.API_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.API_LOCATION_QUERY_PARAMETER, countryName);
        String url = urlBuilder.build().toString();
        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", Constants.API_TOKEN)
                .build();

        Call call = client.newCall(request);
        call.enqueue((okhttp3.Callback) callback);


    }
}
