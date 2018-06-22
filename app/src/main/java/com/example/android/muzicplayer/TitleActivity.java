package com.example.android.muzicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("At the party", "Mike", "Rap"));
        words.add(new Word("Dance with me", "Jason", "R&B"));
        words.add(new Word("Down the system", "Shelly", "Rock"));
        words.add(new Word("Happy tech", "Robert", "EDM"));
        words.add(new Word("Layed back", "Steve", "Jazz"));
        words.add(new Word("Lifes good", "Mike", "Rap"));
        words.add(new Word("My love", "Jason", "R&B"));
        words.add(new Word("Sound mix", "Robert", "EDM"));
        words.add(new Word("Summer cool", "Steve", "Jazz"));
        words.add(new Word("The world in 4D", "Robert", "EDM"));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
