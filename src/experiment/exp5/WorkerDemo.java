package experiment.exp5;

// Base Class: Worker
class Worker {
    protected String name;
    protected double salaryRate;

    // Constructor
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Method to compute pay (to be overridden in subclasses)
    public double computePay(int hours) {
        return 0; // Default implementation (Overridden in subclasses)
    }

    // Display worker details
    public void displayWorker() {
        System.out.println("Worker Name: " + name);
        System.out.println("Salary Rate: $" + salaryRate + " per hour");
    }
}

// Subclass: DailyWorker (Paid based on daily wage)
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Overriding computePay() for DailyWorker (Assumes 8 hours per day)
    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; // Assuming 8 hours per workday
        return daysWorked * salaryRate;
    }
}

// Subclass: SalariedWorker (Fixed pay for 40-hour workweek)
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Overriding computePay() for SalariedWorker (Fixed 40 hours per week)
    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; // Fixed weekly salary
    }
}

// Main Class
public class WorkerDemo {
    public static void main(String[] args) {
        // Creating Worker objects
        Worker dailyWorker = new DailyWorker("Alice", 100);   // $100 per day
        Worker salariedWorker = new SalariedWorker("Bob", 20); // $20 per hour

        // Displaying details and computing weekly pay
        System.out.println("=== Daily Worker Details ===");
        dailyWorker.displayWorker();
        System.out.println("Weekly Pay: $" + dailyWorker.computePay(48)); // 48 hours (6 days)

        System.out.println("\n=== Salaried Worker Details ===");
        salariedWorker.displayWorker();
        System.out.println("Weekly Pay: $" + salariedWorker.computePay(50)); // Even if more than 40 hours
    }
}
