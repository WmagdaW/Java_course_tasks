package com.kodilla.patterns.strategy.social;

public class Millennials extends User {

    public Millennials(String username) {
        super(username);
        this.socialPublisher = new TwitterPublisher();
    }
}
