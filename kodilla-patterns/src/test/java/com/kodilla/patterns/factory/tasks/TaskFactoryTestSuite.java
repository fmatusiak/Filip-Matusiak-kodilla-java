package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testMakeShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);

        //When
        String taskname = task.getTaskName();
        String executeTask = task.executeTask();
        Boolean isExecuted = task.isTaskExecuted();

        //Then
        Assert.assertEquals("shopping", taskname);
        Assert.assertEquals("execute shopping", executeTask);
        Assert.assertEquals(true, isExecuted);
    }

    @Test
    public void testMakePaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(TaskFactory.PAINTING_TASK);

        //When
        String taskname = task.getTaskName();
        String executeTask = task.executeTask();
        Boolean isExecuted = task.isTaskExecuted();

        //Then
        Assert.assertEquals("painting", taskname);
        Assert.assertEquals("execute painting", executeTask);
        Assert.assertEquals(true, isExecuted);
    }

    @Test
    public void testMakeDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.makeTask(TaskFactory.DRIVING_TASK);

        //When
        String taskname = task.getTaskName();
        String executeTask = task.executeTask();
        Boolean isExecuted = task.isTaskExecuted();

        //Then
        Assert.assertEquals("driving", taskname);
        Assert.assertEquals("execute driving", executeTask);
        Assert.assertEquals(true, isExecuted);

    }
}
