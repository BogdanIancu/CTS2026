package com.spotyfree.main;

import com.spotyfree.composite.AbstractSongComposite;
import com.spotyfree.composite.Song;
import com.spotyfree.composite.Playlist;
import com.spotyfree.decorator.LiveVideo;
import com.spotyfree.decorator.Playable;
import com.spotyfree.decorator.TemporaryVideo;
import com.spotyfree.decorator.Video;
import com.spotyfree.flyweight.AbstractWebsiteLogo;
import com.spotyfree.flyweight.LogoProperties;
import com.spotyfree.flyweight.WebsiteLogo;
import com.spotyfree.flyweight.WebsiteLogoFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AbstractSongComposite mainPlaylist = new Playlist();
        AbstractSongComposite friends = new Song("Friends");
        AbstractSongComposite italiano = new Song("L'italiano");
        AbstractSongComposite firstPlaylist = new Playlist();
        firstPlaylist.addPlaylistElement(friends);
        firstPlaylist.addPlaylistElement(italiano);
        AbstractSongComposite antman = new Song("Antman");
        AbstractSongComposite secondPlaylist = new Playlist();
        secondPlaylist.addPlaylistElement(antman);
        secondPlaylist.addPlaylistElement(firstPlaylist);
        AbstractSongComposite titanic = new Song("My heart will go on");
        mainPlaylist.addPlaylistElement(secondPlaylist);
        mainPlaylist.addPlaylistElement(titanic);
        mainPlaylist.displayPlaylist();

        System.out.println();
        Playlist newPlaylist = new Playlist();
        newPlaylist.addPlaylistElement(antman);
        newPlaylist.addPlaylistElement(new Song("Spiderman"));
        secondPlaylist.deletePlaylistElement(antman);
        mainPlaylist.addPlaylistElement(newPlaylist);
        mainPlaylist.displayPlaylist();

        WebsiteLogoFactory factory = new WebsiteLogoFactory();
        WebsiteLogo spotyfreeLogo = factory.getLogo("spotyfree");
        LogoProperties properties = new LogoProperties();
        properties.height = 50;
        properties.width = 50;
        properties.x = 100;
        properties.y = 10;
        spotyfreeLogo.display(properties);

        AbstractWebsiteLogo otherSpotyfreeLogo =
                factory.getLogo("spotyfree");

        LogoProperties otherProperties = new LogoProperties();
        otherProperties.height = 100;
        otherProperties.width = 100;
        otherProperties.x = 200;
        otherProperties.y = 200;
        otherSpotyfreeLogo.display(otherProperties);

        System.out.println(spotyfreeLogo);
        System.out.println(otherSpotyfreeLogo);

        Playable playable = new Video("Wednesday");
        playable.play();
        playable.stop();

        TemporaryVideo temporaryVideo = new TemporaryVideo(playable);
        temporaryVideo.setAvailableUntil(LocalDate.now().plusDays(5));
        System.out.println(temporaryVideo.getAvailableUntil());

        LiveVideo liveVideo = new LiveVideo(temporaryVideo);
        var countries = liveVideo.getCountriesWhereAvailable();
        System.out.println(countries);
    }
}
