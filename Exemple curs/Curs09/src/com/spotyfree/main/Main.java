package com.spotyfree.main;

import com.spotyfree.chain.ParentalControlHandler;
import com.spotyfree.chain.RegionAvailabilityHandler;
import com.spotyfree.chain.SubscriptionHandler;
import com.spotyfree.chain.Video;
import com.spotyfree.command.*;
import com.spotyfree.strategy.MobilePlayerCompression;
import com.spotyfree.strategy.Player;

public class Main {
    public static void main(String[] args) {
        ParentalControlHandler parentalControlHandler = new ParentalControlHandler();
        RegionAvailabilityHandler regionAvailabilityHandler = new RegionAvailabilityHandler();
        SubscriptionHandler subscriptionHandler = new SubscriptionHandler();

        Video video = new Video();
        video.isAgeRestricted = true;

        parentalControlHandler.setParentalControlOn(true);
        parentalControlHandler.setNextHandler(regionAvailabilityHandler);
        regionAvailabilityHandler.setNextHandler(subscriptionHandler);
        boolean result = parentalControlHandler.canBePlayed(video);
        System.out.println(result);

        video.isAgeRestricted = false;
        regionAvailabilityHandler.setRegion("Romania");
        result = parentalControlHandler.canBePlayed(video);
        System.out.println(result);

        regionAvailabilityHandler.setRegion("Germany");
        video.typeOfSubscription = "UHD";
        subscriptionHandler.setSubscription("UHD");
        result = parentalControlHandler.canBePlayed(video);
        System.out.println(result);

        AbstractPlayer player = new SpotyfreePlayer();
        RemoteControl remoteControl = new RemoteControl();
        Command playCommand = new PlayCommand(player);
        Command pauseCommand = new PauseCommand(player);
        Command stopCommand = new StopCommand(player);

        remoteControl.setFirstCommand(playCommand);
        remoteControl.setSecondCommand(pauseCommand);
        remoteControl.setThirdCommand(stopCommand);

        remoteControl.pressButton(1);
        remoteControl.pressButton(3);

        player = new YoutubePlayer();
        playCommand = new PlayCommand(player);
        pauseCommand = new PauseCommand(player);
        remoteControl.setFirstCommand(playCommand);
        remoteControl.setSecondCommand(pauseCommand);
        remoteControl.setThirdCommand(null);

        remoteControl.pressButton(1);
        remoteControl.pressButton(3);
        remoteControl.pressButton(2);

        Player spotyfreePlayer = new Player();
        spotyfreePlayer.setStrategy(new MobilePlayerCompression());
        spotyfreePlayer.play();

        spotyfreePlayer.setStrategy(() -> System.out.println("Using custom compression"));
        spotyfreePlayer.play();
    }
}
