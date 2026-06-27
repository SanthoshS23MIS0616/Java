/*
Question:
How can you create a Java program to Create a generic Pair<K,V>, a generic method <T extends Comparable<T>> T findMax(T[]), and a generic Stack<T>?
*/

class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

class GenericUtils {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }
}

class Stack<T> {
    private Object[] elements;
    private int top;

    public Stack(int capacity) {
        elements = new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top < elements.length - 1) {
            elements[++top] = item;
        }
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return (T) elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Generics {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Santhosh", 101);
        System.out.println(pair);

        Integer[] numbers = {12, 45, 7, 89, 23};
        System.out.println(GenericUtils.findMax(numbers));

        Stack<String> stack = new Stack<>(5);
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
