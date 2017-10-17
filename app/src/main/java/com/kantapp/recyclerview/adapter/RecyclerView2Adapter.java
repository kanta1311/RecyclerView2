package com.kantapp.recyclerview.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kantapp.recyclerview.R;

/**
 * Created by Android-1 on 10/17/2017.
 */

public class RecyclerView2Adapter extends RecyclerView.Adapter<RecyclerView2Adapter.ViewHolder>{

    public RecyclerView2Adapter() {


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview2_grid,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    holder.textView.setText(String.valueOf(position));


    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private CardView recyclerview2_card;
        public ViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.recyclerview2_grid_text);
            recyclerview2_card=itemView.findViewById(R.id.recyclerview2_card);
        }
    }


}
