package exp7;
abstract class Employee {
    protected String name;
    protected String role;
    
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    
    abstract double calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    private double fixedSalary;

    public Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculateSalary() {
        return fixedSalary;
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + calculateSalary());
    }
}

class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + calculateSalary());
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 7000);
        Developer developer = new Developer("Bob", 50, 160);
        
        System.out.println("Manager Details:");
        manager.displayDetails();
        
        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
    }
}

