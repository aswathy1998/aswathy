package com.example.aswathy.mzcandroidapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class welcomeActivity extends AppCompatActivity {
    String usr,pass;
    String getuser,getpass,checkuser;
    Button b,b1;
    ImageView v1,v2,v3,v4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

         v1=(ImageView)findViewById(R.id.a1);
        v2=(ImageView)findViewById(R.id.s1);
        v3=(ImageView)findViewById(R.id.m1);
        v4=(ImageView)findViewById(R.id.d1);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),addActivity.class);
                startActivity(i);
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),subActivity.class);
                startActivity(i);
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),mulActivity.class);
                startActivity(i);
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),divActivity.class);
                startActivity(i);
            }
        });
        b1=(Button)findViewById(R.id.va);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),viewActivity.class);
                startActivity(i);
            }
        });
        b=(Button)findViewById(R.id.logout);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                editor.clear();
                editor.apply();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });

        SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
        getuser=sharedPreferences.getString("user",null);
        getpass=sharedPreferences.getString("password",null);
        Toast.makeText(getApplicationContext(),getuser,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),getpass,Toast.LENGTH_LONG).show();


//        Intent i=getIntent();
//        usr=i.getExtras().getString("username");
//        pass=i.getExtras().getString("password");
//        Toast.makeText(getApplicationContext(),usr,Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();
    }
}
