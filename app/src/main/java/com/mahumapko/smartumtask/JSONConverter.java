package com.mahumapko.smartumtask;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mahumapko.smartumtask.abs.DataService;
import com.mahumapko.smartumtask.POJO.ClientCard.Card;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchase;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchases;
import com.mahumapko.smartumtask.POJO.Presents.Present;
import com.mahumapko.smartumtask.POJO.Presents.Presents;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

public class JSONConverter implements DataService{

    public JSONConverter() {}
    @Override
    public Card getCard(Context context) {
        String json = getJsonString(context, "clientCard.json");
        Gson gson = new GsonBuilder().create();
        Card card = gson.fromJson(json, Card.class);
        return card;
    }

    @Override
    public List<Present> getPresents(Context context) {
        String json = getJsonString(context, "presents.json");
        Gson gson = new GsonBuilder().create();
        Presents presents = gson.fromJson(json, Presents.class);

        return presents.getPresents();
    }

    @Override
    public List<Purchase> getMyPresents(Context context) {
        String json = getJsonString(context, "myPresents.json");
        Gson gson = new GsonBuilder().create();
        Purchases purchases = gson.fromJson(json, Purchases.class);

        return purchases.getPurchases();
    }

    private static String getJsonString(Context context, String jsonFileName) {
        AssetManager am = context.getResources().getAssets();
        String json;
        try {
            InputStream is = am.open(jsonFileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, Charset.forName("UTF-8"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return json;
    }

}
