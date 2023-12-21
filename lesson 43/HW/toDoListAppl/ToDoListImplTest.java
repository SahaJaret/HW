package ToDoListAppl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest {
    private ToDoList toDoList;

    @BeforeEach
    void setup() {
        toDoList = new ToDoListImpl();
    }

    @Test
    void addTask() {
        Task task = new Task("Test ToDoListAppl.Task");
        toDoList.addTask(task);

        assertEquals(1, toDoList.getAllTasks().size());
    }

    @Test
    void getAllTasks() {
        toDoList.addTask(new Task("ToDoListAppl.Task 1"));
        toDoList.addTask(new Task("ToDoListAppl.Task 2"));

        assertEquals(2, toDoList.getAllTasks().size());
    }

    @Test
    void deleteExistingTask() {
        Task task = new Task("ToDoListAppl.Task");
        toDoList.addTask(task);
        toDoList.deleteTask(task.getId());

        assertTrue(toDoList.getAllTasks().isEmpty());
    }

    @Test
    void deleteNonExistingTask() {
        toDoList.addTask(new Task("ToDoListAppl.Task 1"));
        assertFalse(toDoList.deleteTask(999));
    }
}
