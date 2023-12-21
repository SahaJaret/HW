package ToDoListAppl;

import java.time.LocalDateTime;

public class Task implements Comparable<Task> {
    private int id;
    private String task;
    private int taskNumber;
    private LocalDateTime creationDateTime;

    public Task(String task) {
        this.task = task;
        this.creationDateTime = LocalDateTime.now();
    }

    public LocalDateTime getCreationDateTime() { return creationDateTime; }
    public void setCreationDateTime(LocalDateTime creationDateTime) { this.creationDateTime = creationDateTime; }
    public int getId() { return id; }
    public String getTask() { return task; }
    public int getTaskNumber() { return taskNumber; }
    public void setId(int id) { this.id = id; }
    public void setTask(String task) { this.task = task; }
    public void setTaskNumber(int taskNumber) { this.taskNumber = taskNumber; }

    @Override
    public String toString() {
        return "ToDoListAppl.Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                ", creationDateTime=" + creationDateTime +
                '}';
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.taskNumber, other.taskNumber);
    }
}
