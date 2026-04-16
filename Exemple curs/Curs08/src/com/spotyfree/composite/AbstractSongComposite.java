package com.spotyfree.composite;

import java.util.List;

public interface AbstractSongComposite {
    void displayPlaylist();

    void addPlaylistElement(AbstractSongComposite element);

    void deletePlaylistElement(AbstractSongComposite element);

    List<AbstractSongComposite> getPlaylistElements();
}
