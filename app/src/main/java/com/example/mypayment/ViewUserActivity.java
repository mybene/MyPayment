package com.example.mypayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ViewUserActivity extends AppCompatActivity {
    private ListView listUser;
    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);

        listUser=(ListView)findViewById(R.id.userList);
        display=(TextView)findViewById(R.id.titleDisplay);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String cash=intent.getStringExtra( "money");

        display.setText(name+" save "+cash+" rwf");
    }
}