import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionFlowDemo {
    public static String readFirstLine(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        reader.close();
        return line;
    }

    public static void handleByCatching(String fileName) {
        try {
            String line = readFirstLine(fileName);
            System.out.println("Caught method result: " + line);
        } catch (IOException e) {
            System.out.println("Caught inside method: " + e.getMessage());
        }
    }

    public static void handleByDeclaring(String fileName) throws IOException {
        String line = readFirstLine(fileName);
        System.out.println("Declared method result: " + line);
    }

    public static void handleByWrapping(String fileName) {
        try {
            String line = readFirstLine(fileName);
            System.out.println("Wrapped method result: " + line);
        } catch (IOException e) {
            throw new RuntimeException("File reading failed in wrapped method", e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        handleByCatching(fileName);

        try {
            handleByDeclaring(fileName);
        } catch (IOException e) {
            System.out.println("Caught after throws declaration: " + e.getMessage());
        }

        try {
            handleByWrapping(fileName);
        } catch (RuntimeException e) {
            System.out.println("Caught runtime wrapper: " + e.getMessage());
            System.out.println("Wrapped cause: " + e.getCause().getMessage());
        }
    }
}
