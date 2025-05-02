package exp9;

import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManager {

    public static void main(String[] args) {
        // Step 1: Create ArrayList of Employee
        ArrayList<Employee> employees = new ArrayList<>();

        // Step 2: Add 3 employees
        employees.add(new Employee("Aman", 101, 50000));
        employees.add(new Employee("Parul", 102, 55000));
        employees.add(new Employee("Ravi", 103, 60000));

        // Step 3: Update salary of employee with id 102
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 58000;  // updated salary
                System.out.println("\nUpdated salary for ID 102.");
            }
        }

        // Step 4: Remove employee with id 101
        employees.removeIf(emp -> emp.id == 101);
        System.out.println("\nEmployee with ID 101 removed.");

        // Step 5: Print remaining employees
        System.out.println("\nRemaining Employees:");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
