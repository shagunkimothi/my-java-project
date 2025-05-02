package experiment.exp5;
  // Superclass
class SuperClass {
    private int privateVar = 10; // Private member

    // Public method to access privateVar
    public int getPrivateVar() {
        return privateVar;
    }
}

// Subclass
class SubClass extends SuperClass {
    public void display() {
        // System.out.println("Private Variable: " + privateVar); // ❌ Compilation Error
        System.out.println("Accessing privateVar using getter: " + getPrivateVar()); // ✅ Correct way
    }
}

// Main class
// The `public class PrivateMemberDemo` is the main class in the Java program. It contains the `main`
// method which serves as the entry point for the program execution. In this class, an object of the
// `SubClass` is created and its `display` method is called to demonstrate accessing a private member
// of the superclass using a public method.
public class PrivateMemberDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
