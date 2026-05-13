/*
Question:
How can you create a Java program to reverse a number using repeated digit extraction?
*/


import java.util.Scanner;
class ReverseNumber{
    public static void main(String arg[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter tht enumber:");
        int n = s1.nextInt();
        int temp = n;
        int rev = 0;
        int r;
        while(n>0){
            r = n%10;
            rev = rev * 10 + r;
            n = n/10;

        }
        System.out.println(rev);

        if (rev == temp){
            System.out.println("it is palindrome");

        }
        else{
            System.out.println("not a palindrome");
        }
    }}