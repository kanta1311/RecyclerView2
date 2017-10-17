package com.kantapp.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button recyclerview1=(Button)findViewById(R.id.recyclerview1);
        Button recyclerview2=(Button)findViewById(R.id.recyclerview2);
        Button recyclerview3=(Button)findViewById(R.id.recyclerview3);
        recyclerview1.setOnClickListener(this);
        recyclerview2.setOnClickListener(this);
        recyclerview3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.recyclerview1)
        {
            startActivity(new Intent(getApplicationContext(),RecyclerView1.class));
        }
        else if(v.getId()==R.id.recyclerview2)
        {
            startActivity(new Intent(getApplicationContext(),RecyclerView2.class));
        }
        else if(v.getId()==R.id.recyclerview3)
        {
            startActivity(new Intent(getApplicationContext(),RecyclerView3.class));
        }
    }
}
