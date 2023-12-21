package Fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        FibonacciIterator iterator = new FibonacciIterator();
        int n = 8;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (iterator.hasNext()) {
                int fibNumber = iterator.next();
                System.out.print(fibNumber + " ");
                sum += fibNumber;
            }
        }

        System.out.println();
        System.out.println("Сумма первых " + n + " чисел фибоначчи: " + sum);
    }
}
