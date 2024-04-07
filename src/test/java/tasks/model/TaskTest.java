package tasks.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.text.ParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    void testGetTitle()
    {
        Task task = new Task("Title", new Date());

        String title = task.getTitle();

        assertEquals(title, "Title");
    }

    @Test
    void testGetTime()
    {
        Date time = new Date();
        Task task = new Task("Title", time);

        Date getDate = task.getTime();

        assertEquals(time, getDate);
    }
}