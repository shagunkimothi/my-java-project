package experiment.exp4;

public class Course {
    String courseName;
    String courseCode;

    // Parameterized constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to display
    void display() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        // Creating an object
        Course course1 = new Course("Java", "CSE101");
        course1.display();
    }
}