package com.moon.skywatch;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DirectViewHolder extends RecyclerView.ViewHolder {

     TextView tv_title;
     TextView tv_address;
     Button btn_go;
     Button btn_add;



    public DirectViewHolder(@NonNull View itemView) {
        super(itemView);

        tv_title = itemView.findViewById(R.id.tv_title);
        tv_address = itemView.findViewById(R.id.tv_address);
        btn_go = itemView.findViewById(R.id.btn_go);
        btn_add = itemView.findViewById(R.id.btn_add);

    }





}
