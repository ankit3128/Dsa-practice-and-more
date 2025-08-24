// Abstract class
abstract class Employee {
    String name;
    int baseSalary;
    Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

   
    abstract int calculateSalary();
}


class Manager extends Employee {

    Manager(String name, int baseSalary) {
        super(name, baseSalary);
    }

   
    @Override
    int calculateSalary() {
      
        return baseSalary + 5000;
    }
}


class Programmer extends Employee {

    Programmer(String name, int baseSalary) {
        super(name, baseSalary);
    }

   
    @Override
    int calculateSalary() {
    
        return baseSalary + 3000;
    }
}

// Main class to test
public class lab3 {
    public static void main(String[] args) {
        Manager m1 = new Manager("Ankit (Manager)", 40000);
        Programmer p1 = new Programmer("Ankit (Programmer)", 30000);

        System.out.println(m1.name + "'s Salary: " + m1.calculateSalary());
        System.out.println(p1.name + "'s Salary: " + p1.calculateSalary());
    }
}
