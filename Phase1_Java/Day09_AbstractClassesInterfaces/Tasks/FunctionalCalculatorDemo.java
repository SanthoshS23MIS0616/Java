/*
Question:
How can you create @FunctionalInterface Calculator with int compute(int a, int b), use lambda add = (a,b) -> a+b, and show method reference?
*/
@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

class MathOperations {
    static int multiply(int a, int b) {
        return a * b;
    }
}

class FunctionalCalculatorDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = MathOperations::multiply;

        System.out.println("Add: " + add.compute(10, 5));
        System.out.println("Subtract: " + subtract.compute(10, 5));
        System.out.println("Multiply: " + multiply.compute(10, 5));
    }
}
