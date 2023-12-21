package Fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int current = 1;
    private int previous = 0;
    private int count = 0;

    @Override
    public boolean hasNext() {
        return count < Integer.MAX_VALUE;
    }

    @Override
    public Integer next() {
        int nextFib = current + previous;
        previous = current;
        current = nextFib;
        count++;
        return nextFib;
    }
}