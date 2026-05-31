/*
Question:
How can you create a Java program with private fields, constructor, getters/setters, toString(), and isEligibleForPlacement() where cgpa >= 7.5?
*/
import java.util.Scanner;

class Student {
    private String name;
    private String rollNo;
    private double cgpa;
    private String branch;

    Student(String name, String rollNo, double cgpa, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
        this.branch = branch;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getRollNo() {
        return rollNo;
    }

    void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    double getCgpa() {
        return cgpa;
    }

    void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    String getBranch() {
        return branch;
    }

    void setBranch(String branch) {
        this.branch = branch;
    }

    boolean isEligibleForPlacement() {
        return cgpa >= 7.5;
    }

    public String toString() {
        return "Student{name='" + name + "', rollNo='" + rollNo + "', cgpa=" + cgpa + ", branch='" + branch + "'}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter branch: ");
        String branch = sc.nextLine();

        Student student = new Student(name, rollNo, cgpa, branch);
        System.out.println(student);
        System.out.println(student.isEligibleForPlacement() ? "Eligible for placement" : "Not eligible for placement");

        sc.close();
    }
}
