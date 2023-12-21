package athlete;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private List<Athlete> athletes = new ArrayList<>();

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public void printResults() {
        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }
    }

    public static void main(String[] args) {
        Competition competition = new Competition();
        competition.addAthlete(new Athlete("Иванов", "Иван", "101", "Спартак", 10.2));
        competition.addAthlete(new Athlete("Петров", "Петр", "102", "Динамо", 10.3));
        competition.addAthlete(new Athlete("Сидоров", "Алексей", "103", "ЦСКА", 10.1));
        competition.addAthlete(new Athlete("Николаев", "Николай", "104", "Локомотив", 10.4));
        competition.addAthlete(new Athlete("Васильев", "Василий", "105", "Зенит", 10.3));
        competition.addAthlete(new Athlete("Александров", "Александр", "106", "Крылья Советов", 10.2));
        competition.addAthlete(new Athlete("Дмитриев", "Дмитрий", "107", "Амкар", 10.5));
        competition.addAthlete(new Athlete("Егоров", "Егор", "108", "Рубин", 10.4));
        competition.addAthlete(new Athlete("Павлов", "Павел", "109", "Спартак", 10.3));
        competition.addAthlete(new Athlete("Максимов", "Максим", "110", "Динамо", 10.2));

        competition.printResults();
    }
}
