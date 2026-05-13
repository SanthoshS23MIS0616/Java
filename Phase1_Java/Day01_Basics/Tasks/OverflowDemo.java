/*
Question:
What happens when you add 1 to Integer.MAX_VALUE in Java, and how does the result differ when you use long instead of int?
*/
class OverFlowDemo {

    public static void main(String[] args) {

        int intValue = Integer.MAX_VALUE;

        System.out.println("Integer MAX VALUE: " + intValue);

        intValue = intValue + 1;

        System.out.println("After adding 1 to int: " + intValue);


        long longValue = Integer.MAX_VALUE;

        System.out.println("Long value before adding 1: " + longValue);

        longValue = longValue + 1;

        System.out.println("After adding 1 to long: " + longValue);
    }
}