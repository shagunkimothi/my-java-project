package experiment.exp6;
// Parent class with final variable and final method
class MathConstants {
    // Final variable (constant value)
    final double PI = 3.14159;

    // Final method (cannot be overridden)
    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

// Subclass extending MathConstants
class Circle extends MathConstants {
    // Method to calculate the area of a circle
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }

    // Uncommenting the below method will cause a compilation error
    /*
    void displayPI() {
        System.out.println("Attempting to override final method.");
    }
    */
}
public class Finalkeyword {





    public static void main(String[] args) {
        Circle circle = new Circle();
        
        // Display PI value using final method
        circle.displayPI();
        
        // Calculate and display area
        circle.calculateArea(5.0);

        // Uncommenting the below line will cause a compilation error
        // circle.PI = 3.14;  // Cannot assign a value to final variable 'PI

}
}