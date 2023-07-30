package hw_3.task_1;

public interface IQueueBehaviour<T> {
    void enqueue(T item);
    T dequeue();
    boolean isEmpty();
    int size();
}
