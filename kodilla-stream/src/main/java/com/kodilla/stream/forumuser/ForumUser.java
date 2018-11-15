package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final LocalDate birthdayDate;
    private final int countPosts;
    private char sex;


    public ForumUser(final int id, final String userName, final LocalDate birthdayDate, final int countPosts, char sex) {
        this.id = id;
        this.userName = userName;
        this.birthdayDate = birthdayDate;
        this.countPosts = countPosts;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getCountPosts() {
        return countPosts;
    }

    public char getSex() {
        return sex;
    }
}
