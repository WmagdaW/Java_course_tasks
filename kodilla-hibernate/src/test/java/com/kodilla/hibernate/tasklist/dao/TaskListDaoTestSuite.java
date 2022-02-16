package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        assertNotNull(theList.get(0).getId());
        assertEquals(LISTNAME, theList.get(0).getListName());
        assertEquals(DESCRIPTION, theList.get(0).getDescription());

        //CleanUp
        int id = theList.get(0).getId();
        taskListDao.deleteById(id);
    }

    @Test
    void testFindByListNameThatDoesntExist() {
        //Given

        //When
        List<TaskList> list2 = taskListDao.findByListName("list2");

        //Then
        assertEquals(0, list2.size());
    }

    @Test
    void testFindByListNameWhenNameIsDuplicated() {
        //Given
        TaskList taskList = new TaskList(ID, LISTNAME, DESCRIPTION);
        TaskList taskList1 = new TaskList(ID, LISTNAME, "description1");
        TaskList taskList2 = new TaskList(ID, "New list", "description2");
        taskListDao.save(taskList);
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);

        //When
        List<TaskList> list3 = taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(2, list3.size());

        //CleanUp
        taskListDao.deleteAll();
    }
}
