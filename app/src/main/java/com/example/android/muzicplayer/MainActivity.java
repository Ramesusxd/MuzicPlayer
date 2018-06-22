package com.example.android.muzicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView title = (TextView) findViewById(R.id.title);

        // Set a click listener on that View
        title.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent titleIntent = new Intent(MainActivity.this, TitleActivity.class);

                // Start the new activity
                startActivity(titleIntent);
            }
        });


        // Find the View that shows the family category
        TextView type = (TextView) findViewById(R.id.type);

        // Set a click listener on that View
        type.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);

                // Start the new activity
                startActivity(genreIntent);
            }
        });


        // Find the View that shows the family category
        TextView artist = (TextView) findViewById(R.id.artist);

        // Set a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });

    }

}