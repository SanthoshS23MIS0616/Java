/*
Question:
How can you create a Java program to Create List<Student>, add five students, sort by CGPA using a Comparator lambda, remove cgpa < 7, and print using an iterator?
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return name + " - " + cgpa;
    }
}

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Santhosh", 8.5));
        students.add(new Student("Arun", 6.8));
        students.add(new Student("Kavin", 9.1));
        students.add(new Student("Bala", 7.4));
        students.add(new Student("Vijay", 6.5));

        students.sort((s1, s2) -> Double.compare(s2.getCgpa(), s1.getCgpa()));

        students.removeIf(student -> student.getCgpa() < 7);

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}