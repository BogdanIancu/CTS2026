package com.spotyfree.yagni.before;

public class SpotyfreeSong {
    private String title;
    private int length;
    private String artist;
    //TODO delete this filed, not necessary, no bonus
    private double bonus;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    //TODO delete this method, there is no binging bonus
    public double calculateBingingBonus(float numberOfPlays) {
        bonus = 0;
        if (numberOfPlays < 10) {
            bonus += length * 0.01;
        } else if (numberOfPlays >= 10 && numberOfPlays < 20) {
            bonus += length * 0.05;
        }
        //...
        return bonus;
    }
}
