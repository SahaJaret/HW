package student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDistribution {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("1");
        students.add("2");
        students.add("3");
        students.add("4");
        students.add("5");
        students.add("6");
        students.add("7");
        students.add("8");
        students.add("9");
        students.add("10");

        Collections.shuffle(students);

        int middleIndex = students.size() / 2;
        List<String> group1 = students.subList(0, middleIndex);
        List<String> group2 = students.subList(middleIndex, students.size());

        System.out.println("группа 1 ");
        for (String student : group1) {
            System.out.println(student);
        }

        System.out.println("\nгруппа 2 ");
        for (String student : group2) {
            System.out.println(student);
        }
    }
}
