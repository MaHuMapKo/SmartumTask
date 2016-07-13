package com.mahumapko.smartumtask.adapters.shopDescripion.model;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

public class Parent implements ParentListItem {
    private List childrenList;
    private String title;

    public Parent(String title, List childenList) {
        this.title = title;
        this.childrenList = childenList;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }

    @Override
    public List<?> getChildItemList() {
        return childrenList;
    }
}
