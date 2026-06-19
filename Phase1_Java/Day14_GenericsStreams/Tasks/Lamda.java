import java.util.ArrayList;
import java.util.Collections;

interface BonusCalculator {
    double calculate(double salary);
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class LambdaExp {
    public static void main(String[] args) {

        BonusCalculator bonus = salary -> salary * 0.10;

        System.out.println("Bonus : " + bonus.calculate(50000));

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Santhosh", 50000));
        employees.add(new Employee(102, "Rahul", 65000));
        employees.add(new Employee(103, "Priya", 45000));
        employees.add(new Employee(104, "Arun", 70000));

        Collections.sort(
                employees,
                (e1, e2) -> Double.compare(
                        e2.getSalary(),
                        e1.getSalary()
                )
        );

        System.out.println("\nEmployees Sorted By Salary");

        employees.forEach(
                employee -> System.out.println(employee)
        );
    }
}