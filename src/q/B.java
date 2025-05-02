package q; // Declaring package q

import p.A; // Importing class A from package p

public class B extends A { // Class B extends A to access protected members
    public static void main(String[] args) {
        A obj = new A(); // Creating an object of A

        // Accessing public method (Allowed)
        obj.publicMethod();

        // Accessing protected method (Not allowed through obj, but allowed via inheritance)
        B objB = new B(); 
        objB.protectedMethod(); // Accessible because B is a subclass of A

        // Accessing default method (Not allowed - only accessible within the same package)
        // obj.defaultMethod(); // ERROR!

        // Accessing private method (Not allowed - only accessible within class A)
        // obj.privateMethod(); // ERROR!

        // Accessing private method indirectly via public method
        obj.accessPrivateMethod();
    }
}

