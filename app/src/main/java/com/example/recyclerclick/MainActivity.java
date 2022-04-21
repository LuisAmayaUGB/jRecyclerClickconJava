package com.example.recyclerclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    // initialize variable
    RecyclerView recyclerView;
    ArrayList<String> arrayList=new ArrayList<>();
    MainAdapter adapter;
    ItemClickListener itemClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // assign variable
        recyclerView=findViewById(R.id.recycler_view);

        // use for loop
        for(int i=0;i<15;i++)
        {
            // add values in array list
            arrayList.add("Address "+i);
        }

        // Initialize listener
        itemClickListener=new ItemClickListener() {
            @Override
            public void onClick(int position, String value) {
                // Display toast
                Toast.makeText(getApplicationContext(),"Position : "
                        +position +" || Value : "+value, Toast.LENGTH_SHORT).show();
            }
        };

        // set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Initialize adapter
        adapter=new MainAdapter(arrayList,itemClickListener);
        // set adapter
        recyclerView.setAdapter(adapter);

    }
}