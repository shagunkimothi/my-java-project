package Balance;

public class Account {
    private double Balance; // Private balance variable

    // Constructor to initialize balance
    public Account(double balance) {
        this.Balance = balance;
    }

    // Method to display balance
    public void Display_Balance() {
        System.out.println("Account Balance: $" + Balance);
    }
}