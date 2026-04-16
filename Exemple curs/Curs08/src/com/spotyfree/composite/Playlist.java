package com.spotyfree.composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements AbstractSongComposite {
    private List<AbstractSongComposite> elements = new ArrayList<>();

    @Override
    public void displayPlaylist() {
        for (AbstractSongComposite e : elements) {
            e.displayPlaylist();
        }
    }

    @Override
    public void addPlaylistElement(AbstractSongComposite element) {
        elements.add(element);
    }

    @Override
    public void deletePlaylistElement(AbstractSongComposite element) {
        elements.remove(element);
    }

    @Override
    public List<AbstractSongComposite> getPlaylistElements() {
        return List.copyOf(elements);
    }
}
