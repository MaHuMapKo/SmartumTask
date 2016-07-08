package com.mahumapko.smartumtask.Adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mahumapko.smartumtask.R;
import com.mahumapko.smartumtask.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyPresentsAdapter extends ArrayAdapter {
    Context context;
    List<String> images = new ArrayList<>();
    List<String> names = new ArrayList<>();
    List<Integer> scoreCount = new ArrayList<>();

    public MyPresentsAdapter(Context context, int resource, List<String> images,
                           List<String> names, List<Integer> scoreCount) {
        super(context, resource, names);
        this.context = context;
        this.images = images;
        this.names = names;
        this.scoreCount = scoreCount;
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View root = inflater.inflate(R.layout.my_presents_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(root);

        if (images.get(position)!=null) {
            File file = new File(context.getFilesDir(), Util.getFileName(images.get(position)));
            if (file.exists()) {
                Uri uri = Uri.fromFile(file);
                viewHolder.image.setImageURI(uri);
            } else {
                viewHolder.image.setImageDrawable(context.getDrawable(R.mipmap.ic_launcher));
            }
        } else {
            viewHolder.image.setImageDrawable(context.getDrawable(R.mipmap.ic_launcher));
        }

        viewHolder.name.setText(names.get(position));
        viewHolder.scoreCount.setText(String.format("%s %s", scoreCount.get(position),
                context.getString(R.string.scoreCount)));

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

        public ViewHolder(View view) {
            image = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
            scoreCount = (TextView) view.findViewById(R.id.score_count);
        }
    }
}

