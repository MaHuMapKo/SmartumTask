package com.mahumapko.smartumtask.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.mahumapko.smartumtask.adapters.PresentsAdapter;
import com.mahumapko.smartumtask.JSONConverter;
import com.mahumapko.smartumtask.POJO.Presents.Present;
import com.mahumapko.smartumtask.R;

import java.util.ArrayList;
import java.util.List;

public class Presents extends Fragment {
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

        createAdapter(list);

        return root;
    }

    private void createAdapter(ListView listView) {
        List<Present> list = new JSONConverter().getPresents(getActivity());
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

}
