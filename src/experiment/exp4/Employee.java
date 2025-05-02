package experiment.exp4;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    
    // Static variable to track total number of employees
    private static int totalEmployees = 0;
    
    // Default constructor
    public Employee() {
        this.employeeID = 0;
        this.name = "Unknown";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++;
    }
    
    // Parameterized constructor
    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }
    
    // Method to calculate salary
    public double calculateSalary() {
        return this.salary;
    }
    
    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
    
    // Getter method for salary
    public double getSalary() {
        return salary;
    }
    
    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    public static void main(String[] args) {
        // Creating employees using both constructors
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Alice", "HR", 50000);
        Employee emp3 = new Employee(102, "Bob", "IT", 60000);
        
        // Displaying employee details
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();
        
        // Displaying total number of employees
        Employee.displayTotalEmployees();
    }
}


