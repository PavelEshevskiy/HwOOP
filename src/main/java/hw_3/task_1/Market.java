package hw_3.task_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements IQueueBehaviour<String>, IMarketBehaviour, Iterable<String>{
    private Queue<String> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void enqueue(String item) {
        queue.add(item);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void addCustomer(String customerName) {
        enqueue(customerName);
        System.out.println("Added customer: " + customerName);
    }

    @Override
    public String serveCustomer() {
        if (!isEmpty()) {
            String servedCustomer = dequeue();
            System.out.println("Served customer: " + servedCustomer);
            return servedCustomer;
        }
        return null;
    }

    @Override
    public void update() {
        System.out.println("Updating market...");
        // Perform necessary operations to update the market state
    }

    @Override
    public Iterator<String> iterator() {
        return new MarketIterator(queue);
    }
}
