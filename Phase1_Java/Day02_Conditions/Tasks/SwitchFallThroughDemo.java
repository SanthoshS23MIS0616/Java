/*
Question:
How does switch fall-through work in Java when break statements are omitted, and how does the behavior change when break is added?
*/
import java.util.Scanner;

public class SwitchFallThroughDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 3: ");
        int choice = scanner.nextInt();

        System.out.println("Without break:");
        switch (choice) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("With break:");
        switch (choice) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
