package com.cimatronics.subaze.ViewHolders;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.cimatronics.subaze.R;

public class TitleChildViewHolder extends ChildViewHolder {
    public TextView option1;
    public TextView option2;
    public TitleChildViewHolder(View itemView) {
        super(itemView);
        option1 = (TextView)itemView.findViewById(R.id.option1);
        option2 = (TextView)itemView.findViewById(R.id.option2);

    }
}
