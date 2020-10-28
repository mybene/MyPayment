package com.example.mypayment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SavingActivity extends AppCompatActivity {
    private TextView heading;
    private EditText names;
    private EditText amount;
    private Button ok;
    private  Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving);
        heading=(TextView)findViewById(R.id.textView2);
        names=(EditText)findViewById(R.id.username1);
        amount=(EditText)findViewById(R.id.cash);
        ok=(Button)findViewById(R.id.saving);
        cancel=(Button)findViewById(R.id.notsaved);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClientModel clientdetail;
                try{
                    clientdetail  = new ClientModel(-1,names.getText().toString(),Integer.parseInt(amount.getText().toString()));
                    Toast.makeText(SavingActivity.this, clientdetail.toString(), Toast.LENGTH_LONG).show();

                }
                catch (Exception e){
                    Toast.makeText(SavingActivity.this, "Error creating customer", Toast.LENGTH_LONG).show();
                    clientdetail= new ClientModel(-1,"error",0);
                }
                UserDatabase dataBaseUser = new UserDatabase(SavingActivity.this);
                boolean saving = dataBaseUser.addOne(clientdetail);
                Toast.makeText(SavingActivity.this, "success :"+saving, Toast.LENGTH_LONG).show();



//                String name=names.getText().toString();
//                String money= amount.getText().toString();
//                Intent list= new Intent(MainActivity.this,DisplayActivity.class);
//                list.putExtra("name",name);
//                list.putExtra("money",money);
//
//                startActivity(list);


            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }}

