/*
Question:
How can you create a Java program to use LinkedList as a queue with addLast/removeFirst and as a stack with push/pop?
*/

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();

        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);

        System.out.println("Queue Remove: " + queue.removeFirst());
        System.out.println("Queue: " + queue);

        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Stack Pop: " + stack.pop());
        System.out.println("Stack: " + stack);
    }
}