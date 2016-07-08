package com.mahumapko.smartumtask;

import android.content.Context;
import android.net.ConnectivityManager;

public class Util {

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

    public static String getFileName(String imagePath) {
        if (imagePath!=null) {
            String[] splittedPath = imagePath.split("/");
            String fileName = splittedPath[splittedPath.length - 1];
            return fileName;
        } else {
            return null;
        }
    }
}
