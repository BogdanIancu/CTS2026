package com.spotifree.builder;

public class Song implements AbstractSong {
    private String title;
    private int length;
    private String artist;
    private int releaseYear;
    private boolean isRemix;

    private Song() {
    }

    Song(String title, int length, String artist, int releaseYear, boolean isRemix) {
        this.title = title;
        this.length = length;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.isRemix = isRemix;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public boolean isRemix() {
        return isRemix;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Song{");
        sb.append("title='").append(title).append('\'');
        sb.append(", length=").append(length);
        sb.append(", artist='").append(artist).append('\'');
        sb.append(", releaseYear=").append(releaseYear);
        sb.append(", isRemix=").append(isRemix);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private Song song = new Song();

        public Builder addTitle(String title) {
            song.title = title;
            return this;
        }

        public Builder addLength(int length) {
            song.length = length;
            return this;
        }

        public Builder addArtist(String artist) {
            song.artist = artist;
            return this;
        }

        public Builder addReleaseYear(int releaseYear) {
            song.releaseYear = releaseYear;
            return this;
        }

        public Builder addIsRemix(boolean isRemix) {
            song.isRemix = isRemix;
            return this;
        }

        public Song build() {
            Song copy = song;
            song = new Song();
            return copy;
        }
    }
}
