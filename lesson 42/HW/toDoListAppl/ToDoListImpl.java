package ToDoListAppl;

import java.util.ArrayList;
import java.util.List;

public class ToDoListImpl implements ToDoList {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    @Override
    public void addTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    @Override
    public boolean deleteTask(int taskId) {
        boolean isRemoved = tasks.removeIf(task -> task.getId() == taskId);
        if (isRemoved) {
            renumberTasks();
        }
        return isRemoved;
    }

    private void renumberTasks() {
        int number = 1;
        for (Task task : tasks) {
            task.setTaskNumber(number++);
        }
    }
}
