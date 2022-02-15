package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final int ID = 1;
    private static final String LISTNAME = "List 1";
    private static final String DESCRIPTION = "List 1 description";


    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(ID, LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> theList = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, theList.size());

        //CleanUp
        int id = theList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
