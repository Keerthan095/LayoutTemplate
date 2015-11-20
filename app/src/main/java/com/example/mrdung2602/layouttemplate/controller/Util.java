package com.example.mrdung2602.layouttemplate.controller;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by 20124899 on 19/11/2015.
 */
public class Util {

    static public class Operations {

        /**
         * Checks to see if the device is online before carrying out any operations.
         */
        public static boolean isOnline(Context context) {
            ConnectivityManager cm = (ConnectivityManager)
                    context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInFo = cm.getActiveNetworkInfo();
            if (netInFo != null && netInFo.isConnectedOrConnecting()) {
                return true;
            }
            return false;

        }
    }
}
