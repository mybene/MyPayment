package com.example.mypayment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

 private EditText emailID;
 private  EditText setUsername;
 private EditText setPassword;
 private EditText confirmedPas;
 private Button mCreate;
 private Button mCreated ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mCreate= (Button) findViewById(R.id.register);
        mCreated=(Button)findViewById(R.id.registered);
        confirmedPas=(EditText)findViewById(R.id.confirmPassword);
        setPassword=(EditText)findViewById(R.id.password);
       setUsername= (EditText)findViewById(R.id.username);
        emailID=(EditText)findViewById(R.id.usingEmail);


        mCreate.setOnClickListener(this);
        mCreated.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view == mCreated) {
            Intent old = new Intent(RegisterActivity.this, AuthenticationActivity.class);
            old.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(old);
            finish();
        }
        if (view == mCreate) {
            createNewUser();
            Intent account = new Intent(RegisterActivity.this, SavingActivity.class);
            account.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(account);

        }
    }

    private void createNewUser() {
        final String name = setUsername.getText().toString().trim();
        final String email = emailID.getText().toString().trim();
        String password = setPassword.getText().toString().trim();
        String confirmPassword = confirmedPas.getText().toString().trim();

    }
}


