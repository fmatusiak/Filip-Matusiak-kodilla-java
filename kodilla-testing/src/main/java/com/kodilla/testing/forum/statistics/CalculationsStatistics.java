package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculationsStatistics implements Statistics {
    Statistics statistics;

    @Override
    public List<String> userNames() {
        return statistics.userNames();
    }

    @Override
    public int postsCount() {
        //postsCount++;
        return statistics.postsCount();
    }

    @Override
    public int commentsCount() {
        //commentsCount++;
        return statistics.commentsCount();
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int calculateUsers() {
        return statistics.userNames().size();
    }

    public int calculateAveragePostsOnUsers() {
        return calculateUsers() / postsCount();
    }

    public int calculateAverageCommentsOnUsers() {
        return calculateUsers() / commentsCount();
    }

    public int calculateAverageCommentsOnPosts() {
        return commentsCount() / postsCount();
    }

    public void showStatistics() {
        // System.out.println(statistics.userNames() + " " + statistics.postsCount() + " " + statistics.commentsCount());
    }


}
