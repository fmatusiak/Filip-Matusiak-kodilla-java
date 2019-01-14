package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {

    @Test
    public void testInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList taskList = (TaskList) context.getBean("inProgressList");

        //When
        taskList.addTask("progress");

        //Then
        Assert.assertEquals("progress", taskList.getTasks().get(0));
    }

    @Test
    public void testToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList taskList = (TaskList) context.getBean("toDoList");

        //When
        taskList.addTask("toDoList");

        //Then
        Assert.assertEquals("toDoList", taskList.getTasks().get(0));
    }

    @Test
    public void testDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList taskList = (TaskList) context.getBean("doneList");

        //When
        taskList.addTask("doneList");

        //Then
        Assert.assertEquals(taskList.getTasks().get(0), "doneList");
    }


    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.doneList.addTask("testDone");
        board.inProgressList.addTask("testProgress");
        board.toDoList.addTask("testDo");

        //Then
        Assert.assertEquals(board.getDoneList().getTasks().get(0), "testDone");
        Assert.assertEquals(board.getInProgressList().getTasks().get(0), "testProgress");
        Assert.assertEquals(board.getToDoList().getTasks().get(0), "testDo");
    }
}
