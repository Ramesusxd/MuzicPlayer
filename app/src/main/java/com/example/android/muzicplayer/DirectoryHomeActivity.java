package com.example.android.muzicplayer;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class DirectoryHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_directoryhome);
        TextView title = (TextView) findViewById(R.id.viewDirectory);
        title.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent titleIntent = new Intent(DirectoryHomeActivity.this, DirectoryActivity.class);
                startActivity(titleIntent);
            }
        });

    }



    public void signUp (View view) {
        EditText nameField = (EditText) findViewById(R.id.name);
        String name = nameField.getText().toString();

        EditText businessField = (EditText) findViewById(R.id.nameOfBusiness);
        String business = businessField.getText().toString();

        EditText numberField = (EditText) findViewById(R.id.number);
        String number = numberField.getText().toString();

        EditText emailField = (EditText) findViewById(R.id.email);
        String email = emailField.getText().toString();

        EditText websiteField = (EditText) findViewById(R.id.webSite);
        String website = websiteField.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this

        intent.putExtra(Intent.EXTRA_SUBJECT, "Directory sign up for " + name);
        intent.putExtra(Intent.EXTRA_TEXT, business);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }}
