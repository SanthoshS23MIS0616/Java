import java.util.Scanner;

public class ExceptionHierarchy {
    public static void createException(int choice) throws Exception {
        if (choice == 1) {
            String value = null;
            System.out.println(value.length());
        } else if (choice == 2) {
            int number = Integer.parseInt("abc");
            System.out.println(number);
        } else if (choice == 3) {
            throw new Exception("General exception selected");
        } else {
            System.out.println("No exception selected");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. NullPointerException");
        System.out.println("2. RuntimeException");
        System.out.println("3. Exception");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        try {
            createException(choice);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException first");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException next: " + e.getClass().getSimpleName());
        } catch (Exception e) {
            System.out.println("Caught Exception last: " + e.getMessage());
        }
    }
}
