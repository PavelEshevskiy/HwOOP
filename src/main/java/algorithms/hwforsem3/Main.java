package algorithms.hwforsem3;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.head = new LinkedListNode<>(1);
        linkedList.head.next = new LinkedListNode<>(2);
        linkedList.head.next.next = new LinkedListNode<>(3);
        linkedList.head.next.next.next = new LinkedListNode<>(4);

        System.out.println("Original Linked List:");
        printLinkedList(linkedList.head);

        linkedList.reverse();

        System.out.println("Reversed Linked List:");
        printLinkedList(linkedList.head);
    }

    public static <T> void printLinkedList(LinkedListNode<T> head) {
        LinkedListNode<T> current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
