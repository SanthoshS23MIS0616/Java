/*
Question:
How can you create a Java program to determine whether a number is even or odd using the % operator?
*/
import java.lang.*;
import java.util.Scanner;

class EvenOdd{
    public static void main(String arg[])
    {
        int a;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter 1st number:");
        a = s1.nextInt();
    
        if(a%2 ==0 )
        {
            System.out.println("the given number is even number");
        }
        else{
            System.out.println("the given number is odd number");
        }
    }
}