package com.spotyfree.kiss.before;

import java.util.List;

interface RecommendationStrategy {
    List<Song> getRecommendations(List<Song> songs);
}
