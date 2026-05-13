/*
Question:
How can you create a Java program to print the first N Fibonacci numbers using only a while loop?
*/

import java.util.Scanner;
class FibonacciSeries{
    public static void main(String arg[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter tht enumber:");
        int n = s1.nextInt();
        int a=0;
        int b=1;
        int count =2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            System.out.println(b);
            count++;
        
        }
        
        System.out.println(b);
    
    }
}