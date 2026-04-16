package com.spotyfree.composite;

import java.util.List;

public class Song implements AbstractSongComposite {
    private String name;

    public Song(String name) {
        this.name = name;
    }

    @Override
    public void displayPlaylist() {
        System.out.println(name);
    }

    @Override
    public void addPlaylistElement(AbstractSongComposite element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deletePlaylistElement(AbstractSongComposite element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<AbstractSongComposite> getPlaylistElements() {
        throw new UnsupportedOperationException();
    }
}
