package tasks.services;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tasks.model.ArrayTaskList;
import tasks.model.Task;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveTaskTest {
    @Test
    void testValid(){
        ArrayTaskList taskList = new ArrayTaskList();
        Task task = new Task("Title", new Date());

        taskList.add(task);
        boolean wasRemoved = taskList.remove(task);

        assertTrue(wasRemoved);
    }

    @Test
    void testNevalid(){
        ArrayTaskList taskList = new ArrayTaskList();
        Task task = new Task("Title", new Date());

        taskList.add(task);
        boolean wasRemoved = taskList.remove(null);

        assertFalse(wasRemoved);
    }

    @Test
    void testValid2(){
        ArrayTaskList taskList = new ArrayTaskList();
        Task task = new Task("Title", new Date());

        taskList.add(task);
        boolean wasRemoved = taskList.remove(new Task("Title2", new Date()));

        assertFalse(wasRemoved);
    }
}
