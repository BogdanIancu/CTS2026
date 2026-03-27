package com.spotifree.builder;

public interface AbstractSong {
    String getTitle();

    int getLength();

    String getArtist();

    int getReleaseYear();

    boolean isRemix();
}
