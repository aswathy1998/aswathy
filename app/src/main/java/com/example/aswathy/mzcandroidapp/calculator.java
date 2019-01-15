package com.example.aswathy.mzcandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calculator extends AppCompatActivity {
EditText ed1,ed2;
    Button b;
    String s1,s2,s3;
    int number1,number2,number3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);
        b=(Button)findViewById(R.id.addbtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               s1=ed1.getText().toString();
                s2=ed2.getText().toString();
                number1=Integer.parseInt(s1);
                number2=Integer.parseInt(s2);
                number3=number1+number2;
                s3=String.valueOf(number3);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
            }
        });
    }
}
