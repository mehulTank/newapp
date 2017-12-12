package com.cmexpertise.testapp;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by root on 12/12/17.
 */

public class utilDemo {

    public static void displayTost(String hello, Context ctx) {

        Toast.makeText(ctx, hello, Toast.LENGTH_LONG).show();
    }
}
