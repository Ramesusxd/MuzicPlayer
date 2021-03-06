package com.example.android.muzicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter2 extends ArrayAdapter<Song>  {


    public WordAdapter2(Context context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item2, parent, false);
        }


        Song currentWord = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentWord.getTitle());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentWord.getArtist());

        TextView genreTextView = (TextView) listItemView.findViewById(R.id.genre_text_view);
        genreTextView.setText(currentWord.getGenre());

        return listItemView;
    }
}