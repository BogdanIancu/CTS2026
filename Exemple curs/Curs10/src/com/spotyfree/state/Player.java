package com.spotyfree.state;

public class Player {
    private String videoName;
    private PlayerState state;
    private boolean isPlaying;

    public Player() {
        setState(new PlayingState());
        state.action();
        isPlaying = true;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void click() {
        if (isPlaying) {
            setState(new PausingState());
            state.action();
        } else {
            setState(new PlayingState());
            state.action();
        }
        isPlaying = !isPlaying;
    }
}
