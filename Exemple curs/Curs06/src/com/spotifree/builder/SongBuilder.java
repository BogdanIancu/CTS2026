package com.spotifree.builder;

public class SongBuilder implements AbstractSongBuilder {
    private String title;
    private int length;
    private String artist;
    private int releaseYear;
    private boolean isRemix;

    @Override
    public SongBuilder addTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public SongBuilder addLength(int length) {
        this.length = length;
        return this;
    }

    @Override
    public SongBuilder addArtist(String artist) {
        this.artist = artist;
        return this;
    }

    @Override
    public SongBuilder addReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    @Override
    public SongBuilder addIsRemix(boolean isRemix) {
        this.isRemix = isRemix;
        return this;
    }

    @Override
    public AbstractSong build() {
        AbstractSong song = new Song(title, length, artist, releaseYear, isRemix);
        this.title = null;
        this.length = 0;
        this.artist = null;
        this.releaseYear = 0;
        this.isRemix = false;
        return song;
    }
}
