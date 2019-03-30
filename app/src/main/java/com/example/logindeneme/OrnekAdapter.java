package com.example.logindeneme;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class OrnekAdapter extends RecyclerView.Adapter<OrnekViewHolder> {

    LayoutInflater layoutInflater;

    public OrnekAdapter(LayoutInflater layoutInflater){
        this.layoutInflater=layoutInflater;
    }


    public OrnekData[] data = {
            new OrnekData("","bir",",iki"),
            new OrnekData("","ikinci view","ikinci view")

    };

    @NonNull
    @Override
    public OrnekViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = layoutInflater.inflate(R.layout.recycler_data,viewGroup,false);

        OrnekViewHolder ornekViewHolder = new OrnekViewHolder(view);

        return ornekViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrnekViewHolder ornekViewHolder, int i) {

        ornekViewHolder.textViewBir.setText(data[i].textBir);
        ornekViewHolder.TextViewIkı.setText(data[i].textIkı);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
