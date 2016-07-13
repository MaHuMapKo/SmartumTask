package com.mahumapko.smartumtask.adapters.shopDescripion.viewHolders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.mahumapko.smartumtask.R;

public class MyParent  extends ParentViewHolder {
    public TextView address;
    public ImageView indicator;
    Context context;

    public MyParent(View itemView, Context context) {
        super(itemView);
        this.context = context;
        address = (TextView) itemView.findViewById(R.id.address);
        indicator = (ImageView) itemView.findViewById(R.id.indicator);
    }

    @Override
    public void setExpanded(boolean expanded) {
        super.setExpanded(expanded);
        if (expanded) {
            indicator.setImageDrawable(context.getDrawable(R.mipmap.ic_keyboard_arrow_up_black_24dp));
        } else {
            indicator.setImageDrawable(context.getDrawable(R.mipmap.ic_keyboard_arrow_down_black_24dp));
        }
    }
}
