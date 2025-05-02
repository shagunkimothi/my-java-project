package experiment.exp6;

import Balance.Account; // Importing the Account class from Balance package

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(8500.75); // Creating an object of Account class with balance
        acc.Display_Balance(); // Calling the method to display balance
    }
}