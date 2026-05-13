import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the top half: ");
        int n = sc.nextInt();

        // 1. Upper Half (Pyramid)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces: n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars: 2 * i - 1
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
         // 2. Lower Half (Inverted Pyramid)
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces: n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars: 2 * i - 1
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
        sc.close();
    }
}
