/*
Question:
How can you create a Java program to sort a List<Student> in multiple ways: by name, by cgpa descending, by cgpa then name, using Comparable and Comparator?
*/

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " - " + cgpa;
    }
}

public class SortingDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Santhosh", 8.5));
        students.add(new Student("Arun", 9.1));
        students.add(new Student("Bala", 8.5));
        students.add(new Student("Kavin", 7.9));

        Collections.sort(students);
        System.out.println("Sort by Name:");
        System.out.println(students);

        students.sort(Comparator.comparingDouble(Student::getCgpa).reversed());
        System.out.println("Sort by CGPA Descending:");
        System.out.println(students);

        students.sort(
                Comparator.comparingDouble(Student::getCgpa)
                          .reversed()
                          .thenComparing(Student::getName)
        );
        System.out.println("Sort by CGPA Then Name:");
        System.out.println(students);
    }
}