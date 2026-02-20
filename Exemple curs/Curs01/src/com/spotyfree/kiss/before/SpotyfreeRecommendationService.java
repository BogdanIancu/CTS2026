package com.spotyfree.kiss.before;

import java.util.List;

class SpotyfreeRecommendationService {
    private RecommendationStrategy strategy;

    public SpotyfreeRecommendationService(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Song> recommendMovies(List<Song> userSongs) {
        if (userSongs == null || userSongs.isEmpty()) {
            throw new IllegalArgumentException("Song list cannot be empty");
        }
        return strategy.getRecommendations(userSongs);
    }
}
