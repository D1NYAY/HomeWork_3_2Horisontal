package com.example.homework_3_2horisontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<String> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        animalList.add("Wolf");
        animalList.add("dog");
        animalList.add("cat");
        animalList.add("penguin");
        animalList.add("shark");
        animalList.add("Bullfrog");
        animalList.add("rat");
        animalList.add("frog");
        animalList.add("bison");
        animalList.add("crocodile");
        animalList.add("dolphin");
        animalList.add("fox");
        animalList.add("baboon");
        animalList.add("antelope");
        animalList.add("whale");
        animalList.add("hippo");
        animalList.add("deer");
        animalList.add("bear");
        animalList.add("turtle");
        animalList.add("crab");


        AnimalAdapter adapter = new AnimalAdapter(animalList);
        recyclerView.setAdapter(adapter);



    }
}