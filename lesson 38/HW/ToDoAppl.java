import java.util.Scanner;

public class ToDoAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoListImpl();

        while (true) {
            Menu.printMenu();
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (Menu.values()[choice - 1]) {
                case ADD_TASK:
                    System.out.print("Введите задачу: ");
                    String task = scanner.next();
                    toDoList.addTask(new Task(0, task, toDoList.getAllTasks().size() + 1));
                    break;
                case VIEW_ALL_TASKS:
                    System.out.println("Все задачи:");
                    toDoList.getAllTasks().forEach(System.out::println);
                    break;
                case DELETE_TASK:
                    System.out.print("номер задачи для удаления: ");
                    int taskId = scanner.nextInt();
                    if (toDoList.deleteTask(taskId)) {
                        System.out.println("Задача удалена");
                    } else {
                        System.out.println("Задача не найдена");
                    }
                    break;
                case EXIT:
                    System.out.println("Выход из приложения");
                    return;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
}
