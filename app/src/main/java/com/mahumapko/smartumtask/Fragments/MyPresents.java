package com.mahumapko.smartumtask.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mahumapko.smartumtask.adapters.MyPresentsAdapter;
import com.mahumapko.smartumtask.JSONConverter;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchase;
import com.mahumapko.smartumtask.POJO.Presents.Present;
import com.mahumapko.smartumtask.R;

import java.util.ArrayList;
import java.util.List;

public class MyPresents extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = (View) inflater.inflate(R.layout.presents_fragment, container, false);

        RecyclerView recycler = (RecyclerView) root.findViewById(R.id.recycler);

        createAdapter(recycler);

        return root;
    }

    private void createAdapter(RecyclerView recycler) {
        List<Purchase> list = new JSONConverter().getMyPresents(getActivity());

        List<String> images = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<Integer> scoreCount = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Present present = list.get(i).getPresent();
            images.add(present.getImagePath());
            names.add(present.getName());
            scoreCount.add(present.getScore());
        }

        MyPresentsAdapter adapter = new MyPresentsAdapter(getActivity(), images, names, scoreCount);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
