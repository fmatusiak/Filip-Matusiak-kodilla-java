package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forum {
    private final ArrayList<ForumUser> forumUsers = new ArrayList<>();

    public ArrayList<ForumUser> getUserList() {
        return forumUsers;
    }

    public Forum(){ {
            forumUsers.add(new ForumUser(1111,"edward", LocalDate.of(1995, 1, 1),0,'F'));
            forumUsers.add(new ForumUser(1112,"edward", LocalDate.of(1991, 2, 3),2,'M'));
            forumUsers.add(new ForumUser(1113,"dawid", LocalDate.of(1998, 1, 1),0,'M'));
            forumUsers.add(new ForumUser(1114,"gosia", LocalDate.of(1995, 4, 5),3,'F'));
        }



    }





}
