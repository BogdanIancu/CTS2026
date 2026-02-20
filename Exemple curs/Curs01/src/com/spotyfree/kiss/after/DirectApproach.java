package com.spotyfree.kiss.after;


import java.util.Arrays;
import java.util.List;

public class DirectApproach {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
                new Song("9 AM", 8.8),
                new Song("Where are you?", 8.6),
                new Song("Like this", 7.9),
                new Song("Rise", 6.6)
        );

        List<Song> recommended = songs.stream()
                .sorted((a, b) -> Double.compare(b.recommendationScore,
                        a.recommendationScore)).limit(3).toList();

        recommended.forEach(m -> System.out.println(m.title));
    }
}
