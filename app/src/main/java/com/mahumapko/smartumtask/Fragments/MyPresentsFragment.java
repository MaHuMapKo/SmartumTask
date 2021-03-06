package com.mahumapko.smartumtask.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.mahumapko.smartumtask.Adapters.MyPresentsAdapter;
import com.mahumapko.smartumtask.JSONConverter;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchase;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchases;
import com.mahumapko.smartumtask.POJO.Presents.Present;
import com.mahumapko.smartumtask.R;

import java.util.ArrayList;
import java.util.List;

public class MyPresentsFragment extends Fragment {
    MyPresentsAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = (View) inflater.inflate(R.layout.my_presents_fragment, container, false);

        ListView list = (ListView) root.findViewById(R.id.my_presents_list);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DevelopDialog dialog = new DevelopDialog();
                dialog.show(getFragmentManager(), "DialogFragment");
            }
        });

        Purchases purchases = JSONConverter.getDataFromMyPresents(getActivity());
        createAdapter(purchases, list);

        return root;
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

        adapter = new MyPresentsAdapter(getActivity(), R.layout.presents_item,
                images, names, scoreCount);
        listView.setAdapter(adapter);
    }

    public MyPresentsAdapter getMyPresentsAdapter() {
        return adapter;
    }
}
