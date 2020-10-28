package com.example.mypayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AuthenticationActivity extends AppCompatActivity {

    private Button mLoged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        mLoged = (Button) findViewById(R.id.authenticate);
        mLoged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logging = new Intent(AuthenticationActivity.this, SavingActivity.class);
                startActivity(logging);
            }
        });
    }
}