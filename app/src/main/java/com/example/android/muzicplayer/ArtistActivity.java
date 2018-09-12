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
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));
        words.add(new Song("Song here", "Rich Friend", "Rap"));



        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
