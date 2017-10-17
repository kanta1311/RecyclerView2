package com.kantapp.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kantapp.recyclerview.R;

import java.util.ArrayList;

/**
 * Created by Android-1 on 10/16/2017.
 */

public class RecyclerView1Adapter extends RecyclerView.Adapter<RecyclerView1Adapter.ViewHolder> {
    private ArrayList num;

    public RecyclerView1Adapter() {
        num=new ArrayList();
        for(int i=0;i<20;i++)
        {
            num.add(String.valueOf(i));
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview1_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.recyclerview_row_text.setText(String.valueOf(num.get(position)));

    }

    @Override
    public int getItemCount() {
        return num.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView recyclerview_row_text;
        public ViewHolder(View itemView) {
            super(itemView);
            recyclerview_row_text=itemView.findViewById(R.id.recyclerview_row_text);
        }
    }
}
