package com.kantapp.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kantapp.recyclerview.adapter.RecyclerView1Adapter;

import java.util.ArrayList;

public class RecyclerView1 extends AppCompatActivity {
    private RecyclerView recyclerView1;
    private ArrayList num;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view1);

        recyclerView1=(RecyclerView)findViewById(R.id.recyclerview1);
        recyclerView1.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        RecyclerView.Adapter adapter= new RecyclerView1Adapter();
        recyclerView1.setAdapter(adapter);
        recyclerView1.setLayoutManager(layoutManager);

    }
}
