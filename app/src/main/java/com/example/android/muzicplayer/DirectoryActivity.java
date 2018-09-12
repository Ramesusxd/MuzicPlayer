package com.example.android.muzicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class DirectoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);


        ArrayList<Song> words = new ArrayList<Song>();
        words.add(new Song("Adam", "Plumming", "222-222-2222"));
        words.add(new Song("Paul", "Landscape", "222-222-2222"));
        words.add(new Song("Steve", "Producer", "222-222-2222"));
        words.add(new Song("Mark", "Producer", "222-222-2222"));
        words.add(new Song("rich", "Clothes", "222-222-2222"));
        words.add(new Song("John", "Mechanic", "222-222-2222"));
        words.add(new Song("Burg", "Handyman", "222-222-2222"));



        WordAdapter2 adapter = new WordAdapter2(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}

