package com.mahumapko.smartumtask.Fragments;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mahumapko.smartumtask.Adapters.MyPresentsAdapter;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchase;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchases;
import com.mahumapko.smartumtask.POJO.Presents.Present;
import com.mahumapko.smartumtask.R;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MyPresentsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = (View) inflater.inflate(R.layout.my_presents_fragment, container, false);

        ListView list = (ListView) root.findViewById(R.id.my_presents_list);

        Purchases purchases = getDataFromJson();
        createAdapter(purchases, list);

        return root;
    }

    private Purchases getDataFromJson() {
        AssetManager am = getResources().getAssets();
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

    private void createAdapter(Purchases purchases, ListView listView) {
        List<Purchase> list = purchases.getPurchases();

        List<String> images = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<Integer> scoreCount = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Present present = list.get(i).getPresent();
            images.add(present.getImagePath());
            names.add(present.getName());
            scoreCount.add(present.getScore());
        }

        MyPresentsAdapter adapter = new MyPresentsAdapter(getActivity(), R.layout.presents_item,
                images, names, scoreCount);
        listView.setAdapter(adapter);
    }
}
