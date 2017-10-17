package com.kantapp.recyclerview.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kantapp.recyclerview.R;

import java.util.Random;



/**
 * Created by Android-1 on 10/17/2017.
 */

public class RecyclerView3Adapter extends RecyclerView.Adapter<RecyclerView3Adapter.ViewHolder> {
    private Random mRandom;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview3_sgrid,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.recyclerview3_sgrid_text.getLayoutParams().height=randomNumber(450,200);
            holder.recyclerview3_sgrid_text.getLayoutParams().width=randomNumber(350,300);
            holder.recyclerview3_sgrid_text.setText(String.valueOf(position+9999));
            holder.recyclerview3_sgrid_text.setBackgroundColor(getRandomColor());
            holder.recyclerview3_sgrid_text.setTextColor(getRandomColor());
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView recyclerview3_sgrid_text;
        public ViewHolder(View itemView) {
            super(itemView);
            recyclerview3_sgrid_text=itemView.findViewById(R.id.recyclerview3_sgrid_text);
        }
    }

    private int randomNumber(int max,int min)
    {
        Random random=new Random();
        return random.nextInt(max + 1 - min) + min;
    }

    private int getRandomColor()
    {
        Random random=new Random();
        int red=random.nextInt(255);
        int green=random.nextInt(255);
        int blue=random.nextInt(255);

        return Color.rgb(red,green,blue);
    }
}
