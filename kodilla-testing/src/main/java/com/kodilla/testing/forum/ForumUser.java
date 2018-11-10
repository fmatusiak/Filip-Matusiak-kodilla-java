package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }
/*
    public void addPost(String author, String postBody){
        // do nothing
    }


    public void addComment(ForumPost thePost, String author, String commentBody){
        // do nothing
    }

    public int getPostsQuantity(){
        // return 100 temporarily
        return 100;
    }


    public int getCommentsQuantity(){
        // return 100 temporarily
        return 100;
    }

    public ForumPost getPost(int postNumber){
        // returning null means that the operation was unsuccessful
        return null;
    }

    public ForumComment getComment(int commentNumber){
        // returning null means that the operation was unsuccessful
        return null;
    }

    public boolean removePost(ForumPost thePost){
        // return true temporarily
        return true;
    }

    public boolean removeComment(ForumComment theComment){
        // return true temporarily
        return true;
    }
*/

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public int getPostsQuantity() {
        return posts.size();
    }

    public void addPost(String author, String postBody) {
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }

    public ForumPost getPost(int postNumber) {
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }


}
