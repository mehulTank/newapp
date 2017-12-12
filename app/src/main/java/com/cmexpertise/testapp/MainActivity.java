package com.cmexpertise.testapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.cmexpertise.mylibrary.displayMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*String abc = String.valueOf(displayMessage.addValue(5, 10));
        Toast.makeText(MainActivity.this, abc, Toast.LENGTH_LONG).show();*/

        displayTostMain("call from main", this);
    }

    public static void displayTostMain(String hello, Context ctx) {

        Toast.makeText(ctx, hello, Toast.LENGTH_LONG).show();
    }
}
