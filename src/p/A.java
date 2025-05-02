package p; // Declaring package p

public class A {
    public void publicMethod() {
        System.out.println("Public Method - Accessible everywhere.");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method - Accessible in the same package and subclasses.");
    }

    void defaultMethod() {
        System.out.println("Default Method - Accessible within the same package.");
    }

    private void privateMethod() {
        System.out.println("Private Method - Accessible only within the class.");
    }

    // Public method to access privateMethod within the class
    public void accessPrivateMethod() {
        privateMethod();
    }
}

