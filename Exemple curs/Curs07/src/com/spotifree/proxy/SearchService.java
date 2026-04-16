package com.spotifree.proxy;

import java.util.List;

public class SearchService implements AbstractSearchService {
    private List<String> videos =
            List.of("Rein Me In", "Swim", "Iloveitiloveitiloveit", "American Girls", "Stateside", "So Easy (To Fall In Love)", "Fever Dream", "Homewrecker", "Man I Need", "Lush Life", "The Way We Touch", "Cruel World", "To Love Somebody", "Petty", "It's You", "Sabotage", "Seasons", "Most Wanted", "I Just Might", "Babydoll", "Just The Way You Are", "Opalite", "Raindance", "Dracula", "Into the Groove", "White Keys", "Where Is My Husband!", "Click Clack Symphony", "The Visitor", "The Fate of Ophelia", "Ordinary", "Beautiful Things", "Aperture", "Ready, Steady, Go!", "Pink Pony Club", "Good Luck, Babe!", "Espresso", "Birds of a Feather", "Stargazing", "Too Sweet");

    @Override
    public List<String> search(String input) {
        try {
            System.out.println("Searching...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return videos.stream().filter(v -> v.toLowerCase().contains(input.toLowerCase())).toList();
    }
}
