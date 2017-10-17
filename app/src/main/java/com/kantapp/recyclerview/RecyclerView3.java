package com.kantapp.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.kantapp.recyclerview.adapter.RecyclerView3Adapter;

public class RecyclerView3 extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view3);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview3);
        recyclerView.setHasFixedSize(true);

        RecyclerView.Adapter adapter=new RecyclerView3Adapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

    }
}
