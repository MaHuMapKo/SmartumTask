package com.mahumapko.smartumtask;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mahumapko.smartumtask.POJO.ClientCard.Card;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchase;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchases;
import com.mahumapko.smartumtask.POJO.Presents.Present;
import com.mahumapko.smartumtask.POJO.Presents.Presents;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

public class JSONConverter {

    public static Card convertCardJson(Context context) {
        AssetManager am = context.getResources().getAssets();
        String json;
        try {
            InputStream is = am.open("clientCard.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, Charset.forName("UTF-8"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().create();
        Card card = gson.fromJson(json, Card.class);
        return card;
    }

    public static List<String> getImagesFromPresents(Context context, List<String> images) {
        AssetManager am = context.getResources().getAssets();
        String json;
        try {
            InputStream is = am.open("presents.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, Charset.forName("UTF-8"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().create();
        Presents presents = gson.fromJson(json, Presents.class);
        List<Present> list = presents.getPresents();
        for (int i = 0; i < list.size(); i++) {
            String imagePath = list.get(i).getImagePath();
            if (!images.contains(imagePath))
                images.add(imagePath);
        }
        return images;
    }

    public static List<String> getImagesFromMyPresents(Context context, List<String> images) {
        AssetManager am = context.getResources().getAssets();
        String json;
        try {
            InputStream is = am.open("myPresents.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, Charset.forName("UTF-8"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().create();
        Purchases purchases = gson.fromJson(json, Purchases.class);
        List<Purchase> list = purchases.getPurchases();
        for (int i = 0; i < list.size(); i++) {
            String imagePath = list.get(i).getPresent().getImagePath();
            if (!images.contains(imagePath))
                images.add(imagePath);
        }
        return images;
    }

    public static Purchases getDataFromMyPresents(Context context) {
        AssetManager am = context.getResources().getAssets();
        String json;
        try {
            InputStream is = am.open("myPresents.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, Charset.forName("UTF-8"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json, Purchases.class);
    }

    public static Presents getDataFromPresents(Context context) {
        AssetManager am = context.getResources().getAssets();
        String json;
        try {
            InputStream is = am.open("presents.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, Charset.forName("UTF-8"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json, Presents.class);
    }
}
