package com.mahumapko.smartumtask.Fragments;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mahumapko.smartumtask.Adapters.PresentsAdapter;
import com.mahumapko.smartumtask.POJO.Presents.Present;
import com.mahumapko.smartumtask.POJO.Presents.Presents;
import com.mahumapko.smartumtask.R;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class PresentsFragment extends Fragment {
    PresentsAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = (View) inflater.inflate(R.layout.presents_fragment, container, false);

        ListView list = (ListView) root.findViewById(R.id.presents_list);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DevelopDialog dialog = new DevelopDialog();
                dialog.show(getFragmentManager(), "DialogFragment");
            }
        });

        Presents presents = getDataFromJson();
        createAdapter(presents, list);

        return root;
    }

    private Presents getDataFromJson() {
        AssetManager am = getResources().getAssets();
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

    private void createAdapter(Presents presents, ListView listView) {
        List<Present> list = presents.getPresents();
        List<String> images = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<Integer> scoreCount = new ArrayList<>();
        List<Integer> presentLeft = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Present present = list.get(i);
            images.add(present.getImagePath());
            names.add(present.getName());
            scoreCount.add(present.getScore());
            int leftCount = present.getPresentCount() - present.getSoldPresentCount();
            presentLeft.add(leftCount);
        }

        adapter = new PresentsAdapter(getActivity(), R.layout.presents_item,
                images, names, scoreCount, presentLeft);
        listView.setAdapter(adapter);
    }

    public PresentsAdapter getPresentsAdapter() {
        return adapter;
    }
}
