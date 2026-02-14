import java.util.Scanner;

// Class Area
class Area {

    // Data members
    double length;
    double breadth;

    // Method to set dimensions
    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate and return area
    double getArea() {
        return length * breadth;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object of Area class
        Area rect = new Area();

        // Taking input from user
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        // Set dimensions
        rect.setDim(l, b);

        // Display area
        System.out.println("Area of Rectangle = " + rect.getArea());
    }
}
