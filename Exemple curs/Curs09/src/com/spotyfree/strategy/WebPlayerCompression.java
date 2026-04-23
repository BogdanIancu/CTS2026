package com.spotyfree.strategy;

public class WebPlayerCompression implements CompressionStrategy {
    @Override
    public void compress() {
        System.out.println("Using MPEG compression");
    }
}
