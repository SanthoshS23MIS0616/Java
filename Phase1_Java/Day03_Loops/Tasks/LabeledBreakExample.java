/*
Question:
How can you print numbers from 100 down to 1 and stop early at the first number divisible by both 7 and 11 using a labeled break in Java?
*/


public class LabeledBreakExample {

    public static void main(String[] args) {

        outer:

        for (int i = 100; i >= 1; i--) {

            System.out.println(i);

            // Check divisible by both 7 and 11
            if (i % 7 == 0 && i % 11 == 0) {

                System.out.println("First number divisible by both 7 and 11 is: " + i);

                break outer;
            }
        }
    }
}