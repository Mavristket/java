class Demo {

    // Static variable
    static String college;

    // Static block
    static {
        college = "ABC Engineering College";
        System.out.println("Static block executed");
    }

    // Instance variable
    String studentName;

    // Constructor
    Demo(String name) {
        studentName = name;
    }

    // Static method
    static void showCollege() {
        System.out.println("College Name: " + college);
    }

    // Normal method
    void showStudent() {
        System.out.println("Student Name: " + studentName);
    }
}

public class Main {
    public static void main(String[] args) {

        // Call static method without object
        Demo.showCollege();

        // Create objects
        Demo s1 = new Demo("Balaji");
        Demo s2 = new Demo("Ravi");

        s1.showStudent();
        s2.showStudent();
    }
}
