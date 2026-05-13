/*
Question:
How can you create a Java program to calculate the area of a circle using Math.PI, a rectangle, and a triangle using Scanner input?
*/

import java.util.Scanner;

class AreaCalculator {
    public static void main(String arg[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the circle radius:");
        double radius = s1.nextDouble();
        double area = Math.PI * radius *radius;
        System.out.println("area of a circle is:" + area);
        System.out.println("Enter the length for rectangle:");
        double length = s1.nextDouble();
        System.out.println("Enter the breadth for rectangle:");
        double breadth = s1.nextDouble();
        double rect = length * breadth;
        System.out.println("area of a Rectangle is:" + rect);
        System.out.println("Enter trianle base:");
        double base = s1.nextDouble();
        System.out.println("Enter trianle height:");
        double height = s1.nextDouble();
        float triangle = (float) (0.5 * base * height);
        System.out.println("area of a triangle is:" + triangle);

    }
}