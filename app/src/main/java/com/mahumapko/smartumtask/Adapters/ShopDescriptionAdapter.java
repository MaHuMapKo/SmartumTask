package com.mahumapko.smartumtask.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.mahumapko.smartumtask.R;
import com.mahumapko.smartumtask.adapters.shopDescripion.model.Child;
import com.mahumapko.smartumtask.adapters.shopDescripion.model.Parent;
import com.mahumapko.smartumtask.adapters.shopDescripion.viewHolders.MyChild;
import com.mahumapko.smartumtask.adapters.shopDescripion.viewHolders.MyParent;

import java.util.List;

public class ShopDescriptionAdapter extends ExpandableRecyclerAdapter<MyParent, MyChild>{

    LayoutInflater inflater;
    Context context;

    public ShopDescriptionAdapter(Context context, List<? extends ParentListItem> parentItemList) {
        super(parentItemList);
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyParent onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View view = inflater.inflate(R.layout.expand_parent, parentViewGroup, false);

        return new MyParent(view, context);
    }

    @Override
    public MyChild onCreateChildViewHolder(ViewGroup childViewGroup) {
        View view = inflater.inflate(R.layout.expand_child, childViewGroup, false);

        return new MyChild(view, context);
    }

    @Override
    public void onBindParentViewHolder(MyParent parentViewHolder, int position,
                                       ParentListItem parentListItem) {
        Parent parent = (Parent) parentListItem;
        parentViewHolder.address.setText(parent.getTitle());
    }

    @Override
    public void onBindChildViewHolder(MyChild childViewHolder, int position, Object childListItem) {
        Child child = (Child) childListItem;
        childViewHolder.info.setText(child.getInfo());
        int imageResource = context.getResources().getIdentifier(child.getImage(), "mipmap",
                context.getPackageName());
        childViewHolder.icon.setImageResource(imageResource);
    }
}
