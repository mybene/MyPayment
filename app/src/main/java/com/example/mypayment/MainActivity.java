package com.example.mypayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button newAccount;
    private Button oldAccount;
    private TextView mOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newAccount = (Button) findViewById(R.id.registration);
        newAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent create = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(create);
            }
        });

        oldAccount = (Button) findViewById(R.id.authentication);
        oldAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this, AuthenticationActivity.class);
                startActivity(login);
            }
        });
    }
}