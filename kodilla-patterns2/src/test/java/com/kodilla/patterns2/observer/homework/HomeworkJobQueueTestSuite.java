package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkJobQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        JobQueue jobQueue = new JobQueue("Alan");
        JobQueue jobQueue2 = new JobQueue("Leo");
        JobQueue jobQueue3 = new JobQueue("Dawid");
        JobQueue jobQueue4 = new JobQueue("Marian");

        Mentor mentor1 = new Mentor("Jan");
        Mentor mentor2 = new Mentor("Edward");

        jobQueue.registerMentor(mentor1);
        jobQueue2.registerMentor(mentor1);
        jobQueue2.registerMentor(mentor2);
        jobQueue3.registerMentor(mentor2);
        jobQueue3.registerMentor(mentor1);
        jobQueue4.registerMentor(mentor2);


        jobQueue.addTask("Add new Task1");
        jobQueue2.addTask("Add new Task2");
        jobQueue3.addTask("Add new Task3");
        jobQueue4.addTask("Add new Task4");


        //Then
        Assert.assertEquals(3, mentor1.getCountTask());
        Assert.assertEquals(3, mentor2.getCountTask());
    }
}
