
import java.util.Scanner;

public class Shape {
    
    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.println("Enter the length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area of the rectangle: " + calculateRectangleArea(length, width));

        System.out.println("Enter the side of the square:");
        double side = scanner.nextDouble();
        System.out.println("Area of the square: " + calculateSquareArea(side));

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        System.out.println("Area of the circle: " + calculateCircleArea(radius));

        scanner.close();
    }
}
