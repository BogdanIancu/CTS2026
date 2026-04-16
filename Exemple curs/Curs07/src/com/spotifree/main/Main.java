package com.spotifree.main;

import com.spotifree.adapter.*;
import com.spotifree.facade.HomeScreenFacade;
import com.spotifree.proxy.AbstractSearchService;
import com.spotifree.proxy.SearchCachingProxy;
import com.spotifree.proxy.SearchService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractAdService adService = new AdService();
        adService.displayAd(10);

        AbstractVideoAdService videoAdService = new VideoAdService();
        adService = new AdServiceObjectAdapter(videoAdService);
        adService.displayAd(10);

        adService = new AdServiceClassAdapter();
        adService.displayAd(10);

        System.out.println();
        HomeScreenFacade facade = new HomeScreenFacade();
        facade.search("something");
        facade.play(1);

        AbstractSearchService searchService = new SearchService();
        List<String> movies = searchService.search("an");
        System.out.println(movies);

        searchService = new SearchCachingProxy(new SearchService());
        movies = searchService.search("an");
        System.out.println(movies);
        movies = searchService.search("an");
        System.out.println(movies);
    }
}
