import java.util.ArrayList;

class DataStore<T> {
    private T data;

    public DataStore(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void display() {
        System.out.println("Stored Data : " + data);
    }
}

class Utility {

    public static <T> void printList(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}

public class GenericManagementSystem {

    public static void main(String[] args) {

        DataStore<Integer> rollNumber =
                new DataStore<>(101);

        DataStore<String> studentName =
                new DataStore<>("Santhosh");

        DataStore<Double> cgpa =
                new DataStore<>(8.91);

        rollNumber.display();
        studentName.display();
        cgpa.display();

        ArrayList<String> students =
                new ArrayList<>();

        students.add("Santhosh");
        students.add("Rahul");
        students.add("Priya");

        System.out.println("\nStudent List");

        Utility.printList(students);

        ArrayList<Integer> marks =
                new ArrayList<>();

        marks.add(95);
        marks.add(88);
        marks.add(91);

        System.out.println("\nMarks List");

        Utility.printList(marks);
    }
}
