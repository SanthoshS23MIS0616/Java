/*
Question:
How do arrays and linked lists compare in time complexity for insertion, deletion, indexed access, and search?
*/
import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysVsLinkedListComplexity {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("ArrayList index 1: " + array.get(1));
        System.out.println("LinkedList index 1: " + list.get(1));

        System.out.println("ArrayList contains 20: " + array.contains(20));
        System.out.println("LinkedList contains 20: " + list.contains(20));

        array.add(0, 5);
        list.addFirst(5);

        array.add(40);
        list.addLast(40);

        array.remove(0);
        list.removeFirst();

        array.remove(array.size() - 1);
        list.removeLast();

        System.out.println("Final ArrayList: " + array);
        System.out.println("Final LinkedList: " + list);
    }
}
