package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int averagePostsOnUsers;
    private int averageCommentsOnUsers;
    private int averageCommentsOnPosts;
    private int usersCount;

    public int getAveragePostsOnUsers() {
        return averagePostsOnUsers;
    }

    public int getAverageCommentsOnUsers() {
        return averageCommentsOnUsers;
    }

    public int getAverageCommentsOnPosts() {
        return averageCommentsOnPosts;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.userNames().size();
        if (statistics.userNames().size() != 0) {
            averagePostsOnUsers = statistics.postsCount() / statistics.userNames().size();
        } else {
            averagePostsOnUsers = 0;
        }

        if (statistics.userNames().size() != 0) {
            averageCommentsOnUsers = statistics.commentsCount() / statistics.userNames().size();
        } else {
            averageCommentsOnUsers = 0;
        }

        if (statistics.postsCount() != 0) {
            averageCommentsOnPosts = statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsOnPosts = 0;
        }

    }


    public void showStatistics() {
        // System.out.println(statistics.userNames() + " " + statistics.postsCount() + " " + statistics.commentsCount());
    }


}
