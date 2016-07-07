package com.mahumapko.smartumtask.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.mahumapko.smartumtask.Adapters.AboutUsAdapter;
import com.mahumapko.smartumtask.POJO.ClientCard.Shop;
import com.mahumapko.smartumtask.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AboutUsFragment extends Fragment{
    List<Shop> list = new ArrayList<>();
    ExpandableListView expandable;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = (View) inflater.inflate(R.layout.about_us_fragment, container, false);

        expandable = (ExpandableListView) root.findViewById(R.id.expandableList);

        convertDataToLists();
        return root;
    }



    public void setListAndConvert(List<Shop> list) {
        this.list = list;
    }

    private void convertDataToLists() {
        List<String> titles = new ArrayList<>();
        Map<String, List<String>> childsMap = new HashMap<>();
        Map<String, List<String>> imagesMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Shop shop = list.get(i);
            String city = shop.getCity().getName();
            String address = shop.getAddress();
            String fullAddress = String.format("%s, %s", city, address);
            titles.add(fullAddress);

            //add parametres to child list and images list
            List<String> childsList = new ArrayList<>();
            List<String> imagesList = new ArrayList<>();
            childsList.add(fullAddress);
            imagesList.add(getString(R.string.addressIcon));
            childsList.add(shop.getUrl());
            imagesList.add(getString(R.string.urlIcon));
            childsList.add(shop.getEmail());
            imagesList.add(getString(R.string.emailIcon));

            childsList = checkForMultiplePhones(shop.getPhone(), childsList, imagesList);
            childsList.add(shop.getWorkSchedule());
            childsList.add(getString(R.string.lookAtMap));
            imagesList.add(getString(R.string.mapIcon));

            childsMap.put(titles.get(i), childsList);
            imagesMap.put(titles.get(i), imagesList);
        }

        AboutUsAdapter adapter = new AboutUsAdapter(getActivity(), titles, childsMap, imagesMap);
        expandable.setAdapter(adapter);
    }

    private List<String> checkForMultiplePhones(String phone, List<String> childsList,
                                                List<String> imagesList) {
        String[] phones  = phone.split(",");
        if (phones.length>1) {
            for (int i = 0; i < phones.length; i++) {
                childsList.add(phones[i]);
                imagesList.add(getActivity().getString(R.string.phoneIcon));
            }
        }
        return childsList;
    }
}
