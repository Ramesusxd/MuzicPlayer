


package com.example.android.muzicplayer;


public class Word {

    /**
     * song list by title
     */
    private String mSongTitle;


    /**
     * song list by artist
     */
    private String mSongArtist;

    /**
     * song list by genre
     */

    private String mSongGenre;


    public Word(String Title, String artist, String genre) {
        mSongTitle = Title;
        mSongArtist = artist;
        mSongGenre = genre;
    }

    /**
     * Get the song by title.
     */
    public String getTitle() {
        return mSongTitle;
    }

    /**
     * Get the song by artist.
     */

    public String getArtist() {
        return mSongArtist;
    }

    /**
     * Get the song by genre.
     */

    public String getGenre() {
        return mSongGenre;
    }


}




