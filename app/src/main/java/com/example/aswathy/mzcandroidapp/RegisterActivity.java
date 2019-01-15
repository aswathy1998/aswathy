package com.example.aswathy.mzcandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1,b2;
    String getname,getadmno,getmob,getemail,getuname,getpwd,getcpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.admno);
        ed3=(EditText)findViewById(R.id.mob);
        ed4=(EditText)findViewById(R.id.email);
        ed5=(EditText)findViewById(R.id.uname);
        ed6=(EditText)findViewById(R.id.pwd);
        ed7=(EditText)findViewById(R.id.cpwd);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.areg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getname = ed1.getText().toString();
                getadmno = ed2.getText().toString();
                getmob = ed3.getText().toString();
                getemail = ed4.getText().toString();
                getuname = ed5.getText().toString();
                getpwd = ed6.getText().toString();
                getcpwd = ed7.getText().toString();

                if (getpwd.equals(getcpwd)) {
                    Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getadmno, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getmob, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getemail, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getuname, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getpwd, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getcpwd, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Password and confirm password are not equal", Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
