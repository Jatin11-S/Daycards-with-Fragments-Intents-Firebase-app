package com.enjoy.interntask;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    TextView day;
    RelativeLayout relativeLayout;
    public MyHolder(@NonNull View itemView) {
        super(itemView);
        relativeLayout=itemView.findViewById(R.id.relative_layout);
        this.day = itemView.findViewById(R.id.text_day);
    }
}
