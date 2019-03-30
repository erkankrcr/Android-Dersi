package com.example.logindeneme;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OrnekViewHolder  extends RecyclerView.ViewHolder {
    public ImageView image;
    public TextView textViewBir;
    public TextView TextViewIkı;

    public OrnekViewHolder(View view){
        super(view);
        this.image = view.findViewById(R.id.image);
        this.textViewBir =view.findViewById(R.id.textViewBir);
        this.TextViewIkı = view.findViewById(R.id.textViewIkı);
    }
}
