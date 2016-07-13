package com.mahumapko.smartumtask.adapters.shopDescripion.viewHolders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.mahumapko.smartumtask.R;


public class MyChild extends ChildViewHolder {
    public ImageView icon;
    public TextView info;

    public MyChild(View itemView, final Context context) {
        super(itemView);

        icon = (ImageView) itemView.findViewById(R.id.icon);
        info = (TextView) itemView.findViewById(R.id.info);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "BLABLA", Toast.LENGTH_LONG).show();
            }
        });
    }
}
