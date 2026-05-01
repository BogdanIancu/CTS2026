package com.spotyfree.main;


import com.spotyfree.memento.SpotyfreeApp;
import com.spotyfree.memento.SpotyfreeAppPage;
import com.spotyfree.observer.Song;
import com.spotyfree.observer.User;
import com.spotyfree.state.Player;

public class Main {
    public static void main(String[] args) {
        Player webPlayer = new Player();
        webPlayer.click();
        webPlayer.click();

        Song song = new Song("Trenuletul");
        User user1 = new User();
        User user2 = new User();
        song.subscribe(user1);
        song.subscribe(user2);
        String token = song.subscribe(new User());

        song.sendNotification("New remix");
        song.unsubscribe(token);
        song.sendNotification("Extended version released");

        SpotyfreeApp app = new SpotyfreeApp(new SpotyfreeAppPage("Home"));
        app.navigateTo(new SpotyfreeAppPage("This week's titles"));
        app.navigateTo(new SpotyfreeAppPage("New releases"));
        app.navigateTo(new SpotyfreeAppPage("Popular in your country"));

        app.navigateBack();
        System.out.println(app.getCurrentPage().getTitle());

        app.navigateBack();
        System.out.println(app.getCurrentPage().getTitle());
    }
}
