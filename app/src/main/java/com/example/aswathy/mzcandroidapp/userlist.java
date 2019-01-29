package com.example.aswathy.mzcandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class userlist extends AppCompatActivity {
     TextView textView;
    String getname,getusername,getemail,getStreet,getcity,finalData="";
     String url="http://jsonplaceholder.typicode.com/users";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        textView=(TextView)findViewById(R.id.tv);

      FetchData();

    }

    private void FetchData() {
        Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();

        StringRequest stringRequest= new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d("response", response);
                    try {
                        JSONArray jsonArray = new JSONArray(response);
                        for (int i=0; i < jsonArray.length(); i++) {

                            JSONObject jsonObject=jsonArray.getJSONObject(i);
                          getname=jsonObject.getString("name");       //names
                            Log.d("name",getname);
                            getusername=jsonObject.getString("username");     //usernames
                            Log.d("usernames",getusername);
                           getemail=jsonObject.getString("email");            //email
                            Log.d("email",getemail);

                            JSONObject obj=new JSONObject(jsonObject.getString("address"));     //address
                            getStreet=obj.getString("street");
                            getcity=obj.getString("city");
                            Log.d("address",getStreet);

                            finalData += "Name: " + getname + "\n";
                            finalData += "Email id: " +getemail + "\n";
                            finalData += "Username: " +getusername + "\n";
                            finalData += "Address    :  \n"+
                             "   Street: " +getStreet + "\n" +
                                    "    City: " +getcity + "\n";
                            finalData += "\n";

                        }
                        textView.setText(finalData);
                    }
                   catch (JSONException ob) {
                       Log.d("Exception",ob.toString());

                   }

                    }
                    },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );


        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);


    }
}
