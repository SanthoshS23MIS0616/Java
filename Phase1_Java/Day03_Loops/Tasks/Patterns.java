/*
Question:
How can you print an inverted pyramid and a hollow rectangle pattern using nested loops in Java?
*/

```java id="thf1m0"
import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for inverted pyramid: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.print("\nEnter rows for rectangle: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns for rectangle: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
```
