package com.example.shopgame;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView igame;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<gamenya> listgame;

    void datanya(){
        listgame = new ArrayList<>();
        listgame.add(new gamenya("Gratis Api",50000,R.drawable.logogratisapi,R.drawable.gratisapi));
        listgame.add(new gamenya("Ngepet Run 3D",100000,R.drawable.logongepet,R.drawable.ngepet));
        listgame.add(new gamenya("Valorant",60000,R.drawable.logovalo,R.drawable.valorant));
        listgame.add(new gamenya("FIFA 21",50000,R.drawable.logofifa,R.drawable.fifa));
        listgame.add(new gamenya("StoryofSeason",75000,R.drawable.logosos,R.drawable.storyofseason));
        listgame.add(new gamenya("Among Us",50000,R.drawable.logoamong,R.drawable.among));
        listgame.add(new gamenya("Angry Bird",30000,R.drawable.logoangry,R.drawable.angrybird));


    }

    void data(){
        igame = findViewById(R.id.recylerview);
        adapter = new Adapter(this,listgame);
        layoutManager = new LinearLayoutManager(this);
        igame.setLayoutManager(layoutManager);
        igame.setAdapter(adapter);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datanya();data();





    }
}