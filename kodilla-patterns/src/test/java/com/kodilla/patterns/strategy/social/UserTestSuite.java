package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User edward = new Millenials();
        User filip = new YGeneration();
        User dawid = new ZGeneration();

        System.out.println(edward.sharePost());
        System.out.println(filip.sharePost());
        System.out.println(dawid.sharePost());

        //When
        String edwardShareStrategy = edward.sharePost();
        String filipShareStrategy = filip.sharePost();
        String dawidShareStrategy = dawid.sharePost();

        //Then
        Assert.assertEquals("facebook", edwardShareStrategy);
        Assert.assertEquals("twitter", filipShareStrategy);
        Assert.assertEquals("snapchat", dawidShareStrategy);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User edward = new Millenials();

        //When
        String edwardShareFacebook = edward.sharePost();
        edward.setSocialPublisher(new TwitterPublisher());

        String edwardShareTwitter = edward.sharePost();

        System.out.println(edwardShareFacebook);
        System.out.println(edwardShareTwitter);

        //Then
        Assert.assertEquals("facebook", edwardShareFacebook);
        Assert.assertEquals("twitter", edwardShareTwitter);
    }
}

