package com.mahumapko.smartumtask.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mahumapko.smartumtask.R;

import java.util.ArrayList;

public class PresentsAdapter extends ArrayAdapter {
    Context context;
    ArrayList<String> images = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> scoreCount = new ArrayList<>();
    ArrayList<Integer> scoreLeft = new ArrayList<>();

    public PresentsAdapter(Context context, int resource, ArrayList<String> images,
                           ArrayList<String> names, ArrayList<Integer> scoreCount,
                           ArrayList<Integer> scoreLeft) {
        super(context, resource, names);
        this.context = context;
        this.images = images;
        this.names = names;
        this.scoreCount = scoreCount;
        this.scoreLeft = scoreLeft;
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View root = inflater.inflate(R.layout.presents_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(root);
        viewHolder.image.setImageDrawable(context.getDrawable(R.mipmap.ic_launcher));
        viewHolder.name.setText(names.get(position));
        viewHolder.scoreCount.setText(String.format("%s %s", scoreCount.get(position),
                context.getString(R.string.scoreCount)));
        viewHolder.scoreLeft.setText(String.format("%s %s", context.getString(R.string.scoreLeft),
                scoreLeft.get(position)));

        return root;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public static class ViewHolder {
        public final ImageView image;
        public final TextView name;
        public final TextView scoreCount;
        public final TextView scoreLeft;

        public ViewHolder(View view) {
            image = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
            scoreCount = (TextView) view.findViewById(R.id.score_count);
            scoreLeft = (TextView) view.findViewById(R.id.score_left);
        }
    }
}
