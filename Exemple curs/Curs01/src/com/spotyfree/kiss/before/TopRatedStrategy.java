package com.spotyfree.kiss.before;

import java.util.Comparator;
import java.util.List;

class TopThreeRecommendedStrategy implements RecommendationStrategy {

    @Override
    public List<Song> getRecommendations(List<Song> songs) {
        songs.sort(Comparator.comparingDouble((Song m) -> m.recommendationScore).reversed());
        return songs.subList(0, Math.min(3, songs.size()));
    }
}
