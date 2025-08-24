import java.util.ArrayList;
import java.util.Scanner;

// Employee class
class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Employee Management System
class EmployeeManagement {
    private ArrayList<Employee> employees = new ArrayList<>();

    // Add new employee
    public void addEmployee(int id, String name, double salary) {
        employees.add(new Employee(id, name, salary));
        System.out.println("✅ Employee added successfully!");
    }

    // Update employee details
    public void updateEmployee(int id, String newName, double newSalary) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                emp.name = newName;
                emp.salary = newSalary;
                System.out.println("✅ Employee updated successfully!");
                return;
            }
        }
        System.out.println("❌ Employee with ID " + id + " not found.");
    }

    // Delete employee
    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == id) {
                employees.remove(i);
                System.out.println("✅ Employee deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Employee with ID " + id + " not found.");
    }

    // Print all employees who had sex
    public void printEmployees() {
        if (employees.isEmpty()) {
            System.out.println("⚠ No employees found.");
        } else {
            System.out.println("\n--- Employee List ---");
            for (Employee emp : employees) {
                emp.display();
            }
        }
    }
}

// Main program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement em = new EmployeeManagement();

        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Show All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    em.addEmployee(id, name, salary);
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int upId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();
                    em.updateEmployee(upId, newName, newSalary);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    em.deleteEmployee(delId);
                    break;

                case 4:
                    em.printEmployees();
                    break;

                case 5:
                    System.out.println("🚪 Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
