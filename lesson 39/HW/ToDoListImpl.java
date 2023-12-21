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
        return tasks.removeIf(task -> task.getId() == taskId);
    }
}
