package temp;

public class AverageTemperature {
    public static void main(String[] args) {
        double[] temperaturesOctober = {15.2, 16.5, 14.8, 17.3, 18.7, 19.2, 20.1};
        double[] temperaturesNovember = {21.3, 22.8, 20.7, 18.5, 17.9, 16.4, 15.7};

        int totalDays = temperaturesOctober.length + temperaturesNovember.length;

        double sum = 0.0;
        for (double temp : temperaturesOctober) {
            sum += temp;
        }
        for (double temp : temperaturesNovember) {
            sum += temp;
        }

        double averageTemperature = sum / totalDays;
        double roundedAverage = Math.round(averageTemperature * 10.0) / 10.0;

        System.out.println("Средняя температура за две недели: " + roundedAverage);
    }
}
