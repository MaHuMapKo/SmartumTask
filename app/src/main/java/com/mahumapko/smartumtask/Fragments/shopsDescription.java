package com.mahumapko.smartumtask.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mahumapko.smartumtask.POJO.ClientCard.Shop;
import com.mahumapko.smartumtask.R;
import com.mahumapko.smartumtask.adapters.ShopDescriptionAdapter;
import com.mahumapko.smartumtask.adapters.shopDescripion.model.Child;
import com.mahumapko.smartumtask.adapters.shopDescripion.model.Parent;

import java.util.ArrayList;
import java.util.List;

public class ShopsDescription extends Fragment{
    List<Shop> list = new ArrayList<>();

    RecyclerView recyclerView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = (View) inflater.inflate(R.layout.shop_description_fragment, container, false);


        recyclerView = (RecyclerView) root.findViewById(R.id.recycler);

        createAdapter();
        return root;
    }

    public void setShopsList(List<Shop> list) {
        this.list = list;
    }

    private void createAdapter() {
        List<Parent> parentList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<Object> childsList = new ArrayList<>();

            //create parent
            Shop shop = list.get(i);
            String city = shop.getCity().getName();
            String address = shop.getAddress();
            String fullAddress = String.format("%s, %s", city, address);

            //create childs
            childsList.add(new Child(fullAddress, getString(R.string.addressIcon)));
            childsList.add(new Child(shop.getUrl(), getString(R.string.urlIcon)));
            childsList.add(new Child(shop.getEmail(), getString(R.string.emailIcon)));

            childsList = checkForMultiplePhones(shop.getPhone(), childsList);

            childsList.add(new Child(shop.getWorkSchedule(), getString(R.string.workSheduleIcon)));

            parentList.add(new Parent(fullAddress, childsList));
        }

        ShopDescriptionAdapter shopDescriptionAdapter = new ShopDescriptionAdapter(getActivity(), parentList);

        recyclerView.setAdapter(shopDescriptionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private List<Object> checkForMultiplePhones(String phone, List<Object> childsList) {
        String[] phones  = phone.split(",");
        if (phones.length>1) {
            for (int i = 0; i < phones.length; i++) {
                childsList.add(new Child(phones[i], getActivity().getString(R.string.phoneIcon)));
            }
        }
        return childsList;
    }
}
