package com.kodilla.patterns.strategy.social;

public class User {

    protected SocialPublisher socialPublisher;

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost() {
        return socialPublisher.share();
    }
}
