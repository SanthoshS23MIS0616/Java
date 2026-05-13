/*
Question:
How can you demonstrate short-circuit evaluation in Java using a condition like x != 0 && 10 / x > 1 without causing an ArithmeticException?
*/
public class ShortCircuitDemo {
    public static void main(String[] args) {
        int x = 0;

        if (x != 0 && 10 / x > 1) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Short-circuit worked and no exception occurred");
        }
    }
}
