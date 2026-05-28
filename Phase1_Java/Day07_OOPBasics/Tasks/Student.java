/*
Question:
How can you create a Java program to Create private fields name, rollNo, cgpa, and branch, add constructor, getters, setters, toString(), and isEligibleForPlacement() where cgpa >= 7.5?
*/

import java.util.Scanner;
class Info{
    private String roll;
    private String name;
    private float cgpa;
    private String branch;
    private int m1,m2,m3;

    Info(String roll,String name,String branch,float cgpa,int m1, int m2, int m3)
    {
        this.roll = roll;
        this.name= name;
        this.branch = branch;
        this.cgpa = cgpa;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public int total()
    {
        int total1 = m1+m2+m3;
        System.out.println("the total of the 3 sub is : " +total1);
        return total1;
        
    }
    public float avg()
    {
        int totalmark = total();
        float avg1 = totalmark/3;
        System.out.println("the avrg of 3 sub is:" + avg1);
        return avg1;
    }
    public void grades()
    {
        float grade = avg();
        if(grade > 80){
            System.out.println("A grade");
        }
        else if (grade >50 && grade<79){
            System.out.println("B grade ");

        }
        else {
            System.out.println("C grade");
        }
    }
    public  void details()
    {

        System.out.println( "Rollno:" + roll +"\n" +"Name:" +name+ "\n" + "course" + branch +"\n");
    }
    }
  


class Student{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rollno:");
        String roll = sc.next();
        System.out.println ("ente the name: ");
        String name = sc.next();

        System.out.println("branch : ");
        String branch = sc.next();

        System.out.println("enter cgpa: ");
        float cgpa = sc.nextFloat();
        System.out.println("enter the marks m1,m2,m3:");
        
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        Info data = new Info(roll,name,branch,cgpa,m1,m2,m3);
        
        
        data.details();
        data.grades();
        


    }
}