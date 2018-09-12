package com.example.android.muzicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);


        ArrayList<Song> words = new ArrayList<Song>();
        words.add(new Song("Rich Friend", "Stockton,CA", "8:00 PM"));
        words.add(new Song("Rich Friend", "Cleveland, OH", "7:00 PM"));
        words.add(new Song("Rich Friend", "Las Vegas, NV", "9:00 PM"));



        WordAdapter2 adapter = new WordAdapter2(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
