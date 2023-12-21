package ToDoListAppl;

import java.util.List;

public interface ToDoList {
    void addTask(Task task);
    List<Task> getAllTasks();
    boolean deleteTask(int taskId);
}