package com.cmexpertise.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by root on 11/12/17.
 */

public class displayMessage {

    public static int addValue(int a, int b) {


        return a + b;

    }


    public static void showData(Context ctx, String value) {


        Toast.makeText(ctx, value, Toast.LENGTH_LONG).show();

    }
}
