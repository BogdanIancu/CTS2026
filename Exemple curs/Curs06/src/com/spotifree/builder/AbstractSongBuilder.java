package com.spotifree.builder;

public interface AbstractSongBuilder {
    SongBuilder addTitle(String title);

    SongBuilder addLength(int length);

    SongBuilder addArtist(String artist);

    SongBuilder addReleaseYear(int releaseYear);

    SongBuilder addIsRemix(boolean isRemix);

    AbstractSong build();
}
