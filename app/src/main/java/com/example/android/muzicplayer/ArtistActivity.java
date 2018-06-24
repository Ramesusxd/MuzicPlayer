package com.example.android.muzicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);


        ArrayList<Song> words = new ArrayList<Song>();
        words.add(new Song("My love", "Jason", "R&B"));
        words.add(new Song("Dance with me", "Jason", "R&B"));
        words.add(new Song("Lifes good", "Mike", "Rap"));
        words.add(new Song("At the party", "Mike", "Rap"));
        words.add(new Song("Sound mix", "Robert", "EDM"));
        words.add(new Song("Happy tech", "Robert", "EDM"));
        words.add(new Song("The world in 4D", "Robert", "EDM"));
        words.add(new Song("Down the system", "Shelly", "Rock"));
        words.add(new Song("Summer cool", "Steve", "Jazz"));
        words.add(new Song("Layed back", "Steve", "Jazz"));



        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
