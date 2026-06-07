import java.util.Scanner;

class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}

class AgeValidationException extends ValidationException {
    public AgeValidationException(String message) {
        super(message);
    }
}

class EmailValidationException extends ValidationException {
    public EmailValidationException(String message) {
        super(message);
    }
}

class CgpaValidationException extends ValidationException {
    public CgpaValidationException(String message) {
        super(message);
    }
}

public class ValidationFramework {
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be at least 18");
        }

        if (age > 60) {
            throw new AgeValidationException("Age must not be above 60");
        }
    }

    public static void validateEmail(String email) throws EmailValidationException {
        int atPosition = email.indexOf('@');
        int dotPosition = email.lastIndexOf('.');

        if (atPosition <= 0 || dotPosition <= atPosition + 1 || dotPosition == email.length() - 1) {
            throw new EmailValidationException("Email format is invalid");
        }
    }

    public static void validateCgpa(double cgpa) throws CgpaValidationException {
        if (cgpa < 0.0 || cgpa > 10.0) {
            throw new CgpaValidationException("CGPA must be between 0.0 and 10.0");
        }

        if (cgpa < 5.0) {
            throw new CgpaValidationException("CGPA must be at least 5.0");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();

        try {
            validateAge(age);
            validateEmail(email);
            validateCgpa(cgpa);
            System.out.println("All details are valid");
        } catch (ValidationException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
