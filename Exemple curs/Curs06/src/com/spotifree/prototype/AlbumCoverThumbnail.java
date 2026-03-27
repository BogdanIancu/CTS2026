package com.spotifree.prototype;

public class AlbumCoverThumbnail extends AbstractThumbnail {
    private int compressionRate;

    public AlbumCoverThumbnail(int id, String songName) {
        super(id, songName);
        System.out.println("Loading...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        image = new byte[]{100, 122, 40};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AlbumCoverThumbnail copy = (AlbumCoverThumbnail) super.clone();
        copy.compressionRate = compressionRate;
        return copy;
    }

    @Override
    public void display() {
        System.out.println("Album cover thumbnail for " + songName);
    }
}
