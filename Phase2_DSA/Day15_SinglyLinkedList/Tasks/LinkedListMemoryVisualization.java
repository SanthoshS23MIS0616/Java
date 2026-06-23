/*
Question:
How can you explain the memory structure of a linked list such as 1 -> 2 -> 3 -> 4 -> 5 and show what changes when node 3 is deleted?
*/
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListMemoryVisualization {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Before deleting 3:");
        printList(n1);

        n2.next = n4;

        System.out.println("After deleting 3:");
        printList(n1);
    }

    static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }
}
