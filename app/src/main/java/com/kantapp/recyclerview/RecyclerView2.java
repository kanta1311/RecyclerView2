package com.kantapp.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.kantapp.recyclerview.adapter.RecyclerView2Adapter;

public class RecyclerView2 extends AppCompatActivity {

    private RecyclerView recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view2);
        recyclerView2=(RecyclerView)findViewById(R.id.recyclerview2);
        recyclerView2.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),3);
        RecyclerView.Adapter adapter= new RecyclerView2Adapter();

        recyclerView2.setLayoutManager(layoutManager);
        recyclerView2.setAdapter(adapter);
    }
}
