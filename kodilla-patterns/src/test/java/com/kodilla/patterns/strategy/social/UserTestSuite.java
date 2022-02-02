package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User kate = new Millennials("Kate");
        User adam = new YGeneration("Adam");
        User tom = new ZGeneration("Tom");

        //When
        String kateSocialMedia = kate.sharePosts();
        System.out.println("Kate uses " + kateSocialMedia);
        String adamSocialMedia = adam.sharePosts();
        System.out.println("Adam uses " + adamSocialMedia);
        String tomSocialMedia = tom.sharePosts();
        System.out.println("Tom uses " + tomSocialMedia);

        //Then
        assertEquals("Twitter", kateSocialMedia);
        assertEquals("Facebook", adamSocialMedia);
        assertEquals("Snapchat", tomSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User kate = new Millennials("Kate");

        //When
        String kateSocialMedia = kate.sharePosts();
        System.out.println("Kate uses " + kateSocialMedia);
        kate.setSocialMedia(new FacebookPublisher());
        kateSocialMedia = kate.sharePosts();
        System.out.println("Kate now prefers " + kateSocialMedia);

        //Then
        assertEquals("Facebook", kateSocialMedia);
    }
}
