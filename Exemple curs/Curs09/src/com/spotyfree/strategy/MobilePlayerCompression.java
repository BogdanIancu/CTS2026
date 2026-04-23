package com.spotyfree.strategy;

public class MobilePlayerCompression implements CompressionStrategy {
    @Override
    public void compress() {
        System.out.println("Using H264 compression");
    }
}
