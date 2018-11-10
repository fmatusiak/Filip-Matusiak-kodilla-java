package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuit {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        forumUser.addPost("mrsmith", "First post");
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("First contribution", "mrsmith");
        forumUser.addComment(thePost, thePost.getAuthor(), thePost.getPostBody());
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("First contribution", "mrsmith");

        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        Assert.assertEquals(thePost, retrievedPost);

    }

    @Test
    public void testGetComment() {
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        ForumComment retrievedComment = forumUser.getComment(0);

        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }

}
