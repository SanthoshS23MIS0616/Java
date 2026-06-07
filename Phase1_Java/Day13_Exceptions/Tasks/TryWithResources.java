import java.util.Scanner;

class TrainingResource implements AutoCloseable {
    private final String name;

    public TrainingResource(String name) {
        this.name = name;
        System.out.println(name + " opened");
    }

    public void use(boolean throwError) throws Exception {
        System.out.println(name + " is being used");

        if (throwError) {
            throw new Exception("Problem happened while using " + name);
        }

        System.out.println(name + " completed without error");
    }

    @Override
    public void close() {
        System.out.println(name + " closed automatically");
    }
}

public class TryWithResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter resource name: ");
        String resourceName = scanner.nextLine();

        System.out.print("Throw exception? true/false: ");
        boolean throwError = scanner.nextBoolean();

        try (TrainingResource resource = new TrainingResource(resourceName)) {
            resource.use(throwError);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
