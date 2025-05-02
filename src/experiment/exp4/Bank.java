package experiment.exp4;

public class Bank {
    private double balance;

    // Constructor to initialize the account with a zero balance.
    // The `public Bank() { balance = 0.0; }` is a constructor in the `Bank` class. It is used to
    // initialize a new instance of the `Bank` class with a zero balance. When a new `Bank` object is
    // created using `Bank account = new Bank();`, this constructor is automatically called and sets
    // the initial balance of the account to 0.0.
    public Bank() {
        balance = 0.0;
    }

    // Public method: accessible from anywhere.
   /**
    * The deposit method in Java increases the balance by the specified amount if it is greater than
    * zero, otherwise it prints an error message.
    * @param {double} amount - The `amount` parameter in the `deposit` method represents the money that
    * is being deposited into an account. It is a `double` type, which means it can hold decimal
    * values. The method checks if the `amount` is greater than 0 before adding it to the account
    * balance. If
    */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }

    // Public method to check the balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank account = new Bank();
        account.deposit(100);
        account.withdraw(50);
        System.out.println("Current balance: " + account.getBalance());
    }

}
