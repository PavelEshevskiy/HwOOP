package hw_3.task_1;

import java.util.Iterator;
import java.util.Queue;

public class MarketIterator implements Iterator<String> {
    private Queue<String> queue;

    public MarketIterator(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public String next() {
        return queue.poll();
    }
}
