package com.mahumapko.smartumtask.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mahumapko.smartumtask.Adapters.MyPresentsAdapter;
import com.mahumapko.smartumtask.R;

public class MyPresentsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = (View) inflater.inflate(R.layout.my_presents_fragment, container, false);

        ListView list = (ListView) root.findViewById(R.id.my_presents_list);

        return root;
    }
}
