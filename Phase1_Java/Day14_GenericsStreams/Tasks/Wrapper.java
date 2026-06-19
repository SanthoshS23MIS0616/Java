import java.util.ArrayList;

public class Wrapper {

    public static void main(String[] args) {

        int number = 100;

        Integer boxedNumber = number;

        int unboxedNumber = boxedNumber;

        System.out.println("Primitive Value : " + number);
        System.out.println("Autoboxing : " + boxedNumber);
        System.out.println("Unboxing : " + unboxedNumber);

        Integer value1 = Integer.valueOf("500");

        System.out.println("\nvalueOf Result : " + value1);

        int value2 = Integer.parseInt("250");

        System.out.println("parseInt Result : " + value2);

        String salary = "75000";

        int salaryValue = Integer.parseInt(salary);

        System.out.println("\nSalary + Bonus : " + (salaryValue + 5000));

        String convertedString = String.valueOf(999);

        System.out.println("Number To String : " + convertedString);

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(95);
        marks.add(88);
        marks.add(91);
        marks.add(97);

        System.out.println("\nStudent Marks");

        for (Integer mark : marks) {
            System.out.println(mark);
        }

        Integer max = Integer.max(50, 80);
        Integer min = Integer.min(50, 80);

        System.out.println("\nMaximum : " + max);
        System.out.println("Minimum : " + min);

        Double cgpa = Double.valueOf("8.95");

        System.out.println("CGPA : " + cgpa);

        Character grade = Character.valueOf('A');

        System.out.println("Grade : " + grade);
    }
}