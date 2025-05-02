package experiment.exp4;
class University {
    // Static variable (shared among all instances)
    // The line `static String universityName = "upes";` is declaring a static variable named
    // `universityName` of type `String` in the `University` class. This variable is shared among all
    // instances of the `University` class, meaning that all objects of the class will have access to
    // and share the same value of `universityName`. In this case, the value of `universityName` is set
    // to "upes".
    static String universityName = "upes";
    
    // Non-static variable (unique for each instance)
    String studentName;

    // Constructor to initialize studentName
    University(String studentName) {
        this.studentName = studentName;
    }

    // Static method to display university name
    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Method to display student details
    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName + ", University: " + universityName);
    }

    public static void main(String[] args) {
        // Displaying the university name using the static method
        University.displayUniversityName();
        
        // Creating student objects
        University student1 = new University("Alice");
        University student2 = new University("Bob");
        University student3 = new University("Charlie");

        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
    }
}

