package tasks.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TasksServiceTest {
    @Test
    @Tag("ECP")
    void parseFromStringToSecondsValidTest() {
        TasksService tasksService = new TasksService(null);

        int result = tasksService.parseFromStringToSeconds("10:10");

        assertEquals(result, 3600*10+10*60);
    }

    @Test
    @Tag("ECP")
    void parseFromStringToSecondsInvalidTest() {
        TasksService tasksService = new TasksService(null);

        Boolean ok = true;
        try{
            int result = tasksService.parseFromStringToSeconds("1200");
            ok = false;
        }
        catch (Exception ex)
        {
            ok = true;
        }

        assertTrue(ok);
    }

    @Test
    @Tag("ECP")
    void parseFromStringToSecondsInvalid2Test() {
        TasksService tasksService = new TasksService(null);

        Boolean ok = true;
        try{
            int result = tasksService.parseFromStringToSeconds("-1:00");
            ok = false;
        }
        catch (Exception ex)
        {
            ok = true;
        }

        assertTrue(ok);
    }

    @Test
    @Tag("ECP")
    void parseFromStringToSecondsInvalid3Test() {
        TasksService tasksService = new TasksService(null);

        Boolean ok = true;
        try{
            int result = tasksService.parseFromStringToSeconds("-100");
            ok = false;
        }
        catch (Exception ex)
        {
            ok = true;
        }

        assertTrue(ok);
    }

    @Test
    @Tag("BVA")
    void parseFromStringToSecondsValid2Test() {
        TasksService tasksService = new TasksService(null);

        int result = tasksService.parseFromStringToSeconds("00:00");

        assertEquals(result, 0);
    }

    @Test
    @Tag("BVA")
    void parseFromStringToSecondsValid3Test() {
        TasksService tasksService = new TasksService(null);

        int result = tasksService.parseFromStringToSeconds("01:00");

        assertEquals(result, 3600);
    }

    @Test
    @Tag("BVA")
    void parseFromStringToSecondsInvalid5Test() {
        TasksService tasksService = new TasksService(null);

        int result = tasksService.parseFromStringToSeconds("23:00");

        assertEquals(result, 23*3600);
    }

    @Test
    @Tag("BVA")
    void parseFromStringToSecondsInvalid6Test() {
        TasksService tasksService = new TasksService(null);

        Boolean ok = true;
        try{
            int result = tasksService.parseFromStringToSeconds("24:00");
            ok = false;
        }
        catch (Exception ex)
        {
            ok = true;
        }

        assertTrue(ok);
    }
}