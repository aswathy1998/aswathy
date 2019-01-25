package com.example.aswathy.mzcandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class viewActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        lv=(ListView)findViewById(R.id.myview);
        String[] students={"AKHILA","ASWATHY","AISWARYA","CERIYA"};
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(),R.layout.activity_list_item_view,students);
        lv.setAdapter(adapter);
    }
}
