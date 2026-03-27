package com.spotifree.prototype;

public class PlaylistThumbnail extends AbstractThumbnail {
    public PlaylistThumbnail(int id, String songName) {
        super(id, songName);
        System.out.println("Loading...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        image = new byte[]{10, 12, 41};
    }

    @Override
    public void display() {
        System.out.println("Playlist thumbnail for " + songName);
    }
}
