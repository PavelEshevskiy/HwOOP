package algorithms.hwforsem3;

public class LinkedList<T> {
    protected LinkedListNode<T> head;

    public void reverse() {
        LinkedListNode<T> previous = null;
        LinkedListNode<T> current = head;
        LinkedListNode<T> next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }
}
