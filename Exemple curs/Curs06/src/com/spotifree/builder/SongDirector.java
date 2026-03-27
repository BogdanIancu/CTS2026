package com.spotifree.builder;

public class SongDirector {
    private final AbstractSongBuilder builder;

    public SongDirector(AbstractSongBuilder builder) {
        this.builder = builder;
    }

    public AbstractSong create(String title, int length) {
        builder.addTitle(title).addLength(length);
        return builder.build();
    }

    public AbstractSong create(String artist, String title, int length) {
        return builder.addArtist(artist).addTitle(title).addLength(length).build();
    }
}
