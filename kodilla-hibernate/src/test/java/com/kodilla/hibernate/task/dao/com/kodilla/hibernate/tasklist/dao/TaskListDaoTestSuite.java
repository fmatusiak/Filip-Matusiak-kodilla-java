package com.kodilla.hibernate.task.dao.com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String LISTNAME = "Done";

    @Autowired
    TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Done", "Done TaskList");
        taskListDao.save(taskList);

        //When
        List<TaskList> readTaskListDao = taskListDao.findByListName(LISTNAME);

        //Then
        Assert.assertEquals(1, readTaskListDao.size());

        //CleanUp
        taskListDao.delete(taskList);

    }

    @Test
    public void testTaskListDaoSaveWithTasks(){
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);

        task.setTaskFinancialDetails(tfd);
        task.setTaskFinancialDetails(tfd2);

        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);

        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertEquals(0,id);

        //CleanUp
         taskListDao.delete(taskList);
    }

}
