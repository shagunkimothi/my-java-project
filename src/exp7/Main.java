package exp7; // Optional: Only include if you are using a package.

abstract class Shape {
    // Abstract method to calculate area
    abstract void calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea method for Rectangle
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea method for Circle
    @Override
    void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Rectangle and Circle
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        // Call calculateArea method
        rectangle.calculateArea();
        circle.calculateArea();
    }
}

