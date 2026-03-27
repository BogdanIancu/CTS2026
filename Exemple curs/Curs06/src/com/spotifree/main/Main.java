package com.spotifree.main;

import com.spotifree.builder.AbstractSong;
import com.spotifree.builder.Song;
import com.spotifree.builder.SongBuilder;
import com.spotifree.builder.SongDirector;
import com.spotifree.prototype.AbstractThumbnail;
import com.spotifree.prototype.PlaylistThumbnail;
import com.spotifree.prototype.PrototypeCollection;

public class Main {
    public static void main(String[] args) {
        AbstractThumbnail thumbnail1 = new PlaylistThumbnail(1, "Rock you");
        thumbnail1.display();
        try {
            AbstractThumbnail thumbnail2 = (AbstractThumbnail) thumbnail1.clone();
            thumbnail2.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        PrototypeCollection prototypeCollection = new PrototypeCollection();
        AbstractThumbnail thumbnail3 = prototypeCollection.getThumbnail(1);
        AbstractThumbnail thumbnail4 = prototypeCollection.getThumbnail(2);
        thumbnail3.display();
        thumbnail4.display();

        StringBuilder sb = new StringBuilder();
        sb.append("abc").append(2).append(true);
        String s = sb.toString();
        System.out.println(s);

        Song.Builder builder = new Song.Builder();
        builder.addTitle("All That She Wants").addArtist("Ace of Base").addReleaseYear(1994);
        Song song = builder.build();
        System.out.println(song);

        Song song2 = new Song.Builder().addArtist("Lost Frequencies").addTitle("Freestyler").
                addReleaseYear(2025).addLength(240).addIsRemix(true).build();
        System.out.println(song2);

        SongBuilder songBuilder = new SongBuilder();
        songBuilder.addTitle("Memories").addReleaseYear(2020);
        songBuilder.addLength(189);
        AbstractSong song3 = songBuilder.build();
        System.out.println(song3);

        SongDirector director = new SongDirector(new SongBuilder());
        AbstractSong song4 = director.create("Dance Monkey", 200);
        System.out.println(song4);
    }
}
