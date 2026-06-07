import java.util.Scanner;

class CalculationFailedException extends Exception {
    public CalculationFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChaining {
    public static int divideHundredBy(int number) throws CalculationFailedException {
        try {
            return 100 / number;
        } catch (ArithmeticException e) {
            System.out.println("Logging exception: " + e);
            throw new CalculationFailedException("Calculation failed while dividing 100", e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to divide 100 by: ");
        int number = scanner.nextInt();

        try {
            int result = divideHundredBy(number);
            System.out.println("Result: " + result);
        } catch (CalculationFailedException e) {
            System.out.println("Wrapped exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
