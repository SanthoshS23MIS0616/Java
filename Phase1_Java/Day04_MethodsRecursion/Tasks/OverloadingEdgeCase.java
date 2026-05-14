/*
Question:
When both add(int, int) and add(long, long) are overloaded in Java, which method is chosen for int arguments and which method is chosen for long arguments?
*/
public class OverloadingEdgeCase {
    public static int add(int a, int b) {
        System.out.println("int version called");
        return a + b;
    }

    public static long add(long a, long b) {
        System.out.println("long version called");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Result 1: " + add(5, 10));
        System.out.println("Result 2: " + add(5L, 10L));
    }
}
