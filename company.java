// Base Class
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    // Constructor
    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus (default 5%)
    public double calculateBonus() {
        return salary * 0.05;
    }

    // Method to generate performance report
    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + " (" + jobTitle + ")");
        System.out.println("Salary: " + salary);
    }

    // Method to manage project
    public void manageProject() {
        System.out.println(name + " is managing a general project.");
    }
}

// Manager Class
class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    // Manager gets 20% bonus
    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is managing multiple teams and projects.");
    }
}

// Developer Class
class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    // Developer gets 10% bonus
    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is developing software modules.");
    }
}

// Programmer Class
class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    // Programmer gets 8% bonus
    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is writing and testing code.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Manager m = new Manager("Rahul", "Mumbai", 80000);
        Developer d = new Developer("Anita", "Pune", 60000);
        Programmer p = new Programmer("Vikram", "Delhi", 50000);

        // Manager
        m.generatePerformanceReport();
        System.out.println("Bonus: " + m.calculateBonus());
        m.manageProject();

        System.out.println("---------------------");

        // Developer
        d.generatePerformanceReport();
        System.out.println("Bonus: " + d.calculateBonus());
        d.manageProject();

        System.out.println("---------------------");

        // Programmer
        p.generatePerformanceReport();
        System.out.println("Bonus: " + p.calculateBonus());
        p.manageProject();
    }
}
