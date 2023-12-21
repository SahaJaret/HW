public class Task implements Comparable<Task> {
    private int id;
    private String task;
    private int taskNumber;

    public Task(String task) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
    }


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
                '}';
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.taskNumber, other.taskNumber);
    }
}
