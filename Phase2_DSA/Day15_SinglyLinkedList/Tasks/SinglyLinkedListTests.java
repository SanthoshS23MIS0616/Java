/*
Question:
How can you test a singly linked list implementation in Java using edge cases such as an empty list, a one-node list, insert at the beginning, and delete at different positions?
*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class SinglyLinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    void deleteAtPosition(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node curr = head;

        for (int i = 0; curr != null && i < pos - 1; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null) {
            return;
        }

        curr.next = curr.next.next;
    }

    void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}

public class SinglyLinkedListTest {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Empty List:");
        list.display();

        System.out.println("\nInsert one node:");
        list.insertAtBeginning(10);
        list.display();

        System.out.println("\nInsert at beginning:");
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();

        System.out.println("\nDelete first node:");
        list.deleteAtBeginning();
        list.display();

        System.out.println("\nDelete middle node (position 1):");
        list.deleteAtPosition(1);
        list.display();

        System.out.println("\nDelete last remaining node:");
        list.deleteAtPosition(0);
        list.display();

        System.out.println("\nDelete from empty list:");
        list.deleteAtPosition(0);
        list.display();
    }
}
