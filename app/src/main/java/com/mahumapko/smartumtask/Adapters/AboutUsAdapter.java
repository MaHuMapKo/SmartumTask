package com.mahumapko.smartumtask.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.mahumapko.smartumtask.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AboutUsAdapter extends BaseExpandableListAdapter {
    ArrayList<String> list = new ArrayList<>();
    HashMap<String, List<String>> childs = new HashMap<>();
    HashMap<String, String> images = new HashMap<>();
    Context context;

    public AboutUsAdapter(Context context, ArrayList<String> list,
                          HashMap<String, List<String>> childs,
                          HashMap<String, String> images) {
        this.context = context;
        this.list = list;
        this.childs = childs;
        this.images = images;
    }

    @Override
    public int getGroupCount() {
        return list.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childs.get(list.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return list.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childs.get(list.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean b, View view, ViewGroup viewGroup) {
        String groupTitle = (String) getGroup(groupPosition);
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.expand_parent, null);
        }

        TextView title = (TextView) view.findViewById(R.id.address);
        title.setText(groupTitle);

        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View view, ViewGroup viewGroup) {
        final String childText = (String) getChild(groupPosition, childPosition);

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.expand_child, null);
        }

        TextView text = (TextView) view.findViewById(R.id.info);
        text.setText(childText);

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
