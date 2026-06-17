import java.util.Scanner;

class OverFlowException extends Exception {
    public String toString() {
        return "already full";
    }
}

class UnderFlowException extends Exception {
    public String toString() {
        return "already empty";
    }
}

class Stack {
    private int size;
    private int S[];
    private int top = -1;

    public Stack(int sz) {
        size = sz;
        S = new int[sz];
    }

    public int push(int x) throws OverFlowException {
        if (top == size - 1)
            throw new OverFlowException();

        top++;
        S[top] = x;
        return x;
    }

    public int pop() throws UnderFlowException {
        int x;

        if (top == -1)
            throw new UnderFlowException();

        x = S[top];
        top--;
        return x;
    }
}

public class Sta {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of stack:");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        try {
            System.out.println("Enter the values:");
            for (int i = 1; i <= size; i++) {
                int st = sc.nextInt();
                stack.push(st);
            }

            while (true) {

                System.out.println("Enter what to do (push/pop/exit):");
                String sk = sc.next();

                if (sk.equals("push")) {
                    System.out.println("Enter value to push:");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println(val + " pushed");
                }

                else if (sk.equals("pop")) {
                    int x = stack.pop();
                    System.out.println("Popped element: " + x);
                }

                else if (sk.equals("exit")) {
                    break;
                }

                else {
                    System.out.println("Invalid operation");
                }
            }

        } catch (OverFlowException e) {
            System.out.println(e);
        } catch (UnderFlowException e) {
            System.out.println(e);
        }

        sc.close();
    }
}