package com.example.animation_transition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView r_music;
    Adapter adapter;
    LinkedList<Singer> singers = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_music = findViewById(R.id.recycleview_listmusic);

        singers.add(new Singer("Taylor Swift", "Love Story", R.drawable.eclipse));
        singers.add(new Singer("Taylor Swift", "Love Story", R.drawable.eclipse));
        singers.add(new Singer("Taylor Swift", "Love Story", R.drawable.eclipse));
        singers.add(new Singer("Taylor Swift", "Love Story", R.drawable.eclipse));
        singers.add(new Singer("Taylor Swift", "Love Story", R.drawable.eclipse));

        adapter = new Adapter(singers, this, this);
        r_music.setAdapter(adapter);
        r_music.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}