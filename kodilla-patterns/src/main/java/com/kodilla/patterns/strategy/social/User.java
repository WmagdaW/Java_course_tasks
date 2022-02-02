package com.kodilla.patterns.strategy.social;

public class User {

    private final String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String sharePosts() {
        return socialPublisher.share();
    }

    public void setSocialMedia (SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getUsername() {
        return username;
    }
}
