package ToDoListAppl;

public enum Menu {
    ADD_TASK(1, "Добавить заметку"),
    VIEW_ALL_TASKS(2, "Посмотреть все заметки"),
    DELETE_TASK(3, "Удалить по номеру"),
    EXIT(4, "Виход");

    private final int itemNumber;
    private final String action;

    Menu(int itemNumber, String action) {
        this.itemNumber = itemNumber;
        this.action = action;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getAction() {
        return action;
    }

    public static void printMenu() {
        for (Menu item : Menu.values()) {
            System.out.println(item.itemNumber + ". " + item.action);
        }
    }
}
