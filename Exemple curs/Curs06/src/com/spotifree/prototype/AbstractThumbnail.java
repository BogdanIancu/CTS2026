package com.spotifree.prototype;

public abstract class AbstractThumbnail implements Cloneable {
    protected int id;
    protected String songName;
    protected byte[] image;

    public AbstractThumbnail() {
    }

    public AbstractThumbnail(int id, String songName) {
        this.id = id;
        this.songName = songName;
    }

    public int getId() {
        return id;
    }

    public String getSongName() {
        return songName;
    }

    public byte[] getImage() {
        return image.clone();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        AbstractThumbnail copy = (AbstractThumbnail) super.clone();
        copy.id = id;
        copy.songName = songName;
        copy.image = this.image.clone();
        return copy;
    }

    public abstract void display();
}
