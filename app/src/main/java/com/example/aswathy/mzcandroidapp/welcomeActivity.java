package com.example.aswathy.mzcandroidapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class welcomeActivity extends AppCompatActivity {
    String usr,pass;
    String getuser,getpass,checkuser;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);



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
