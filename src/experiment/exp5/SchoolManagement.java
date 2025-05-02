package experiment.exp5;

// Abstract Superclass: Person
abstract class Person {
    protected String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    abstract void performDuty();
}

// Subclass: Student
class Student extends Person {
    public Student(String name) {
        super(name);
    }

    // Overriding performDuty() for Student
    @Override
    void performDuty() {
        System.out.println(name + " is studying for exams.");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    // Overriding performDuty() for Teacher
    @Override
    void performDuty() {
        System.out.println(name + " is teaching a Java class.");
    }
}

// Main Class
public class SchoolManagement {
    public static void main(String[] args) {
        // Creating an array of Person references
        Person[] people = new Person[4];

        // Storing Student and Teacher objects in the array
        people[0] = new Student("Alice");
        people[1] = new Teacher("Mr. Smith");
        people[2] = new Student("Bob");
        people[3] = new Teacher("Ms. Johnson");

        // Iterating and calling performDuty() on each object
        System.out.println("=== School Activities ===");
        for (Person person : people) {
            person.performDuty(); // Runtime polymorphism in action
        }
    }
}

