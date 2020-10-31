package com.example.mypayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ViewUserActivity extends AppCompatActivity {
    private ListView listUser;
    private TextView display;
    private String countryName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);

        getUserCountry(countryName);

        listUser=(ListView)findViewById(R.id.userList);
        display=(TextView)findViewById(R.id.titleDisplay);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String cash=intent.getStringExtra( "money");

        display.setText(name+" save "+cash+" rwf");
    }
    private  void getUserCountry(String countryName){
        final ApiService yelpService = new ApiService();
            yelpService.findUserCountry(countryName, new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }
                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        String jsonData = response.body().string();
                        Log.v(TAG, jsonData);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
    }
}
