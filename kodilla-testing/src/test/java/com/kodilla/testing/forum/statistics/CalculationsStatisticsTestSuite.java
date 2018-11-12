package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationsStatisticsTestSuite {
    @Test
    public void testCalculatePostsCount() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculationsStatistics calculationsStatistics = new CalculationsStatistics();
        calculationsStatistics.calculateAdvStatistics(statistics);

        //Test for 1000 Posts
        when(statistics.postsCount()).thenReturn(1000);

        //When
        int postsCount = statistics.postsCount();

        //Then
        Assert.assertEquals(1000, postsCount);

        //Test for 0 Posts
        when(statistics.postsCount()).thenReturn(0);

        //When
        postsCount = statistics.postsCount();

        //Then
        Assert.assertEquals(0, postsCount);

    }

    @Test
    public void testCalculateCommentsCount() {
        //Given
        Statistics statistics = mock(Statistics.class);
        CalculationsStatistics calculationsStatistics = new CalculationsStatistics();
        calculationsStatistics.calculateAdvStatistics(statistics);

        //Test for 0 Comments
        when(statistics.commentsCount()).thenReturn(0);

        //When
        int commentsCount = statistics.commentsCount();

        //Then
        Assert.assertEquals(0, commentsCount);

    }

    @Test
    public void testCalculateUsersCount() {
        //Given
        int usersCount;
        Statistics statistics = mock(Statistics.class);
        CalculationsStatistics calculationsStatistics = new CalculationsStatistics();
        calculationsStatistics.calculateAdvStatistics(statistics);

        List<String> listUsers = new ArrayList<>();

        //Test for 0 Users
        when(statistics.userNames()).thenReturn(listUsers);

        //When
        usersCount = calculationsStatistics.calculateUsers();

        //Then
        Assert.assertEquals(0, usersCount);


        //Test for 100 Users
        for (int i = 0; i < 100; i++) {
            listUsers.add("#" + i);
        }

        when(statistics.userNames()).thenReturn(listUsers);

        //When
        usersCount = calculationsStatistics.calculateUsers();

        //Then
        Assert.assertEquals(100, usersCount);
    }

    @Test
    public void testCalculateCommentsPosts() {
        //Given
        int averageCommentsAndPosts;

        Statistics statistics = mock(Statistics.class);
        CalculationsStatistics calculationsStatistics = new CalculationsStatistics();
        calculationsStatistics.calculateAdvStatistics(statistics);

        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(80);

        //When
        averageCommentsAndPosts = calculationsStatistics.calculateAverageCommentsOnPosts();

        //Then
        Assert.assertEquals(1,averageCommentsAndPosts);

        when(statistics.commentsCount()).thenReturn(80);
        when(statistics.postsCount()).thenReturn(100);

        //When
        averageCommentsAndPosts = calculationsStatistics.calculateAverageCommentsOnPosts();

        //Then
        Assert.assertEquals(0,averageCommentsAndPosts);

    }

    @Test
    public void testCalculateCommentsUsers() {
        //Given
        int averageCommentsAndUsers;

        List<String> listUsers = new ArrayList<>();

        Statistics statistics = mock(Statistics.class);
        CalculationsStatistics calculationsStatistics = new CalculationsStatistics();
        calculationsStatistics.calculateAdvStatistics(statistics);

        //Test for 100 Users
        for (int i = 0; i < 100; i++) {
            listUsers.add("#" + i);
        }

        when(statistics.userNames()).thenReturn(listUsers);
        when(statistics.commentsCount()).thenReturn(80);

        //When
        averageCommentsAndUsers = calculationsStatistics.calculateAverageCommentsOnUsers();

        //Then
        Assert.assertEquals(1,averageCommentsAndUsers);

    }

    @Test
    public void testCalculatePostsUsers() {
        //Given
        int averagePostsAndUsers;

        List<String> listUsers = new ArrayList<>();

        Statistics statistics = mock(Statistics.class);
        CalculationsStatistics calculationsStatistics = new CalculationsStatistics();
        calculationsStatistics.calculateAdvStatistics(statistics);

        //Test for 100 Users
        for (int i = 0; i < 80; i++) {
            listUsers.add("#" + i);
        }

        when(statistics.userNames()).thenReturn(listUsers);
        when(statistics.postsCount()).thenReturn(100);

        //When
        averagePostsAndUsers = calculationsStatistics.calculateAveragePostsOnUsers();

        //Then
        Assert.assertEquals(0,averagePostsAndUsers);

    }

}