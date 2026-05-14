/*
Question:
How can you create a Java program to overload add(int,int), add(double,double), and add(int,int,int) and show Java choosing the correct method?
*/
public class OverloadDemo {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(5, 7));
        System.out.println("add(double, double): " + add(5.5, 7.2));
        System.out.println("add(int, int, int): " + add(5, 7, 9));
    }
}
