public class EmployeeTest {
    public static void main(String[] args) {

        // Create two Employee objects
        Employee emp1 = new Employee("Balaji", "Gaikwad", 20000);
        Employee emp2 = new Employee("Ravi", "Patil", 25000);

        // Display yearly salary before raise
        System.out.println("Yearly Salary Before Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                ": " + emp1.getYearlySalary());

        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                ": " + emp2.getYearlySalary());

        // Give 10% raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        // Display yearly salary after raise
        System.out.println("\nYearly Salary After 10% Raise:");

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                ": " + emp1.getYearlySalary());

        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                ": " + emp2.getYearlySalary());
    }
}
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        // If salary is not positive, set to 0.0
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}
