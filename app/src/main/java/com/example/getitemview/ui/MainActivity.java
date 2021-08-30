package com.example.getitemview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.getitemview.R;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

//    private final int TYPE_WITH_TXT = 0;
//    private final int TYPE_WITH_IMG = 1;
//    private final int TYPE_WITH_BTN = 2;

    private MainAdapter adapter = new MainAdapter();
    private RecyclerView recyclerView;
    private ArrayList<Item> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        initRecycler();
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.mainRv);
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }

    private void createList() {
        list.add(new Item(1,null,R.drawable.ic_launcher_background));
        list.add(new Item(0,"Title1"));
        list.add(new Item(2,"Btn1"));
        list.add(new Item(1,null,R.drawable.ic_launcher_background));
        list.add(new Item(0,"Title1"));
        list.add(new Item(2,"Btn1"));
        list.add(new Item(1,null,R.drawable.ic_launcher_background));
        list.add(new Item(0,"Title1"));
        list.add(new Item(2,"Btn1"));
        list.add(new Item(1,null,R.drawable.ic_launcher_background));
        list.add(new Item(0,"Title1"));
        list.add(new Item(2,"Btn1"));
        list.add(new Item(1,null,R.drawable.ic_launcher_background));
        list.add(new Item(0,"Title1"));
        list.add(new Item(2,"Btn1"));
        list.add(new Item(1,null,R.drawable.ic_launcher_background));
        list.add(new Item(0,"Title1"));
        list.add(new Item(2,"Btn1"));
        Collections.shuffle(list);
    }
}