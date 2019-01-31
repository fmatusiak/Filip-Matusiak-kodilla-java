package com.kodilla.hibernate.task.dao.com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}
