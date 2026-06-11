/*
Question:
How can you sort a list of Employee objects in Java by name, by salary descending, and by department then salary using Comparator chaining?
*/

import java.util.*;

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " - " + salary + " - " + department;
    }
}

public class EmployeeSortDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Santhosh", 60000, "IT"),
                new Employee("Arun", 75000, "HR"),
                new Employee("Bala", 50000, "IT"),
                new Employee("Kavin", 80000, "Finance")
        );

        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sort by Name:");
        System.out.println(employees);

        employees.sort(
                Comparator.comparingDouble(Employee::getSalary).reversed()
        );
        System.out.println("Sort by Salary Descending:");
        System.out.println(employees);

        employees.sort(
                Comparator.comparing(Employee::getDepartment)
                          .thenComparing(
                                  Comparator.comparingDouble(Employee::getSalary)
                                            .reversed()
                          )
        );
        System.out.println("Sort by Department Then Salary:");
        System.out.println(employees);
    }
}