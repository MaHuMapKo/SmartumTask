package com.mahumapko.smartumtask.adapters;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mahumapko.smartumtask.MainActivity;
import com.mahumapko.smartumtask.R;
import com.mahumapko.smartumtask.fragments.DevelopDialog;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyPresentsAdapter extends RecyclerView.Adapter<MyPresentsAdapter.MyPresentsViewHolder> {
    Context context;
    List<String> images = new ArrayList<>();
    List<String> names = new ArrayList<>();
    List<Integer> scoreCount = new ArrayList<>();

    public MyPresentsAdapter(Context context, List<String> images, List<String> names,
                             List<Integer> scoreCount) {
        this.context = context;
        this.images = images;
        this.names = names;
        this.scoreCount = scoreCount;
    }

    @Override
    public MyPresentsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.my_presents_item, parent, false);

        MyPresentsViewHolder myPresentsViewHolder = new MyPresentsViewHolder(context, view);
        return myPresentsViewHolder;
    }

    @Override
    public void onBindViewHolder(MyPresentsViewHolder holder, int position) {
        String url = images.get(position);

        Picasso.with(context).load(url)
                .resize(50, 50)
                .placeholder(R.mipmap.ic_launcher)
                .centerCrop()
                .into(holder.image);

        holder.name.setText(names.get(position));
        holder.scoreCount.setText(String.format("%s %s", scoreCount.get(position),
                context.getString(R.string.scoreCount)));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class MyPresentsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final ImageView image;
        public final TextView name;
        public final TextView scoreCount;
        Context context;

        public MyPresentsViewHolder(Context context, View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
            scoreCount = (TextView) view.findViewById(R.id.score_count);
            this.context = context;

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            FragmentManager manager = ((MainActivity) context).getSupportFragmentManager();
            DevelopDialog dialog = new DevelopDialog();
            dialog.show(manager, "DialogFragment");
        }
    }
}

