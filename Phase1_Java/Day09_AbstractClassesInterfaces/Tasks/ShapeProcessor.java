/*
Question:
How can you create a Shape interface with area() and perimeter(), implement Circle, Rectangle, Triangle using Heron's formula, and make ShapeProcessor take List<Shape>?
*/
import java.util.ArrayList;
import java.util.List;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}

class ShapeProcessor {
    static void printShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.printf("Area: %.2f, Perimeter: %.2f%n", shape.area(), shape.perimeter());
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 4, 5));

        printShapes(shapes);
    }
}
