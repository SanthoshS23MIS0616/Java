/*
Question:
How can you demonstrate constructor chaining in Java using a Person class and an Employee class that calls super(name) first?
*/


import java.util.Scanner;


class Person{
    String name;
    int age ;
    Person(String name,int age)
    {
        this.name = name;
        this.age= age;
        System.out.println("Name:" + name);
        System.out.println(" age: " +age);
    }
    
}
 class Employee extends Person{
    int salary;
    String job;
    Employee(String name,int salary,String job,int age)
    {
        super(name,age);
        this.salary = salary;
        this.job = job;
       
    }
    void display(){
         System.out.println("the salary of" + name + "is :" + salary + " and the job is :" +job);
    }
}

public class ConstructorChainTest{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter the job: ");
        String job = sc.next();
        Employee e = new Employee(name,salary,job,age);
        e.display();
    }
}