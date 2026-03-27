package com.spotifree.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    private Map<Integer, AbstractThumbnail> prototypes = new HashMap<>();

    public PrototypeCollection() {
        prototypes.put(1, new AlbumCoverThumbnail(1, "Destination Calabria"));
        prototypes.put(2, new PlaylistThumbnail(2, "Freestyler "));
    }

    public void addThumbnail(AbstractThumbnail thumbnail) {
        prototypes.put(thumbnail.getId(), thumbnail);
    }

    public AbstractThumbnail getThumbnail(int id) {
        try {
            if(prototypes.containsKey(id)) {
                return (AbstractThumbnail) prototypes.get(id).clone();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("No such thumbnail exists");
    }
}
