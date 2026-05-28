/*
Question:
How can you create a Java program to Create width and height fields, area(), perimeter(), and a static totalRectangles counter shared by all objects?
*/

import java.util.Scanner;
class Rectangle{
    private int length;
    private int breadth;
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;

    }
    public void area(){
        int area_rect = length*breadth;
        System.out.println("the are of rectanle is :" + area_rect);
    }
    public void perimeter(){
        int peri_rect = (2*length)+(2*breadth);
        System.out.println("the are of rectanle is :" + peri_rect);
    }
}
class ArrayBasics{
    public static void main (String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the length: ");
        int length=sc.nextInt();
        System.out.println("enter the breadth: ");
        int breadth=sc.nextInt();
        Rectangle r = new Rectangle(length, breadth);
        r.area();
        r.perimeter();
       

    }
}