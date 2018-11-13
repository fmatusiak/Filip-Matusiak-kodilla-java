package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationsStatisticsTestSuite {

    @Test
    public void testCalculateCommentsOnPosts() {
        int averageCommentsOnPosts;

        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);

        statisticsCalculator.calculateAdvStatistics(statistics);

        //When
        averageCommentsOnPosts = statisticsCalculator.getAverageCommentsOnPosts();

        //Then
        Assert.assertEquals(1, averageCommentsOnPosts);

    }

    @Test
    public void testCalculateCommentsOnUsers() {
        int averageCommentsOnUsers;

        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        ArrayList<String> users = new ArrayList<>();

        when(statistics.userNames()).thenReturn(users);
        when(statistics.commentsCount()).thenReturn(50);

        statisticsCalculator.calculateAdvStatistics(statistics);

        //When
        averageCommentsOnUsers = statisticsCalculator.getAverageCommentsOnUsers();

        //Then
        Assert.assertEquals(0, averageCommentsOnUsers);

    }

    @Test
    public void testCalculatePostsBiggerComment() {
        int averageCommentsOnPosts;

        //Given
        Statistics statistics = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);

        statisticsCalculator.calculateAdvStatistics(statistics);

        //When
        averageCommentsOnPosts = statisticsCalculator.getAverageCommentsOnPosts();

        //Then
        Assert.assertEquals(0, averageCommentsOnPosts);

    }


}