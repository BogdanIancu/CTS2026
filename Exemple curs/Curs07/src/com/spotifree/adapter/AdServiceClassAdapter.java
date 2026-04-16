package com.spotifree.adapter;

import java.time.Duration;

public class AdServiceClassAdapter extends VideoAdService implements AbstractAdService {
    @Override
    public void displayAd(int seconds) {
        super.setSkippable(false);
        super.setMaxDuration(Duration.ofSeconds(seconds));
        super.runAd();
    }
}
