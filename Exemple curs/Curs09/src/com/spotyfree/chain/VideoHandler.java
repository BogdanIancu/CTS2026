package com.spotyfree.chain;

public abstract class VideoHandler {
    protected VideoHandler nextHandler;

    public void setNextHandler(VideoHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean canBePlayed(Video video);
}
