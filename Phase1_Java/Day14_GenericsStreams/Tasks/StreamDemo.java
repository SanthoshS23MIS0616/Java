/*
Question:
How can you create a Java program to from a List<Employee>, filter salary > 50000, map to names, sort, collect, compute average salary, and group by department?
*/

import java.util.*;
import java.util.stream.Collectors;

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

public class StreamDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Santhosh", 60000, "IT"),
                new Employee("Arun", 45000, "HR"),
                new Employee("Kavin", 70000, "IT"),
                new Employee("Bala", 55000, "Finance"),
                new Employee("Vijay", 80000, "Finance")
        );

        List<String> names = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(names);

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println(averageSalary);

        Map<String, List<Employee>> groupedEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(groupedEmployees);
    }
}