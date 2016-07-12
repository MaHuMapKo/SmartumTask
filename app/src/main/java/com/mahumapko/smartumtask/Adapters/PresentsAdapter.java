package com.mahumapko.smartumtask.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mahumapko.smartumtask.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PresentsAdapter extends RecyclerView.Adapter<PresentsAdapter.PresentsViewHolder> {

    Context context;
    List<String> images = new ArrayList<>();
    List<String> names = new ArrayList<>();
    List<Integer> scoreCount = new ArrayList<>();
    List<Integer> presentLeft = new ArrayList<>();

    public PresentsAdapter(Context context, List<String> images,
                           List<String> names, List<Integer> scoreCount,
                           List<Integer> presentLeft) {
        this.context = context;
        this.images = images;
        this.names = names;
        this.scoreCount = scoreCount;
        this.presentLeft = presentLeft;
    }

    @Override
    public PresentsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.presents_item, parent, false);

        PresentsViewHolder viewHolder = new PresentsViewHolder(context, view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PresentsViewHolder holder, int position) {
        String url = images.get(position);

        Picasso.with(context).load(url)
                .resize(50, 50)
                .placeholder(R.mipmap.ic_launcher)
                .centerCrop()
                .into(holder.image);

        holder.name.setText(names.get(position));
        holder.scoreCount.setText(String.format("%s %s", scoreCount.get(position),
                context.getString(R.string.scoreCount)));
        holder.scoreLeft.setText(String.format("%s %s", context.getString(R.string.presentLeft),
                presentLeft.get(position)));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class PresentsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final ImageView image;
        public final TextView name;
        public final TextView scoreCount;
        public final TextView scoreLeft;
        Context context;

        public PresentsViewHolder(Context context, View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
            scoreCount = (TextView) view.findViewById(R.id.score_count);
            scoreLeft = (TextView) view.findViewById(R.id.score_left);
            this.context = context;

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(context, "BLABLA", Toast.LENGTH_LONG).show();
//            DevelopDialog dialog = new DevelopDialog();
//            dialog.show(getFragmentManager(), "DialogFragment");
        }
    }

}
