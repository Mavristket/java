import java.util.Scanner;

// Base class
class Student {
    int roll_no;

    void getRollNo(int r) {
        roll_no = r;
    }

    void displayRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}

// Derived class from Student
class Test extends Student {
    int sub1, sub2;

    void getMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void displayMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

// Derived class from Test
class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result obj = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        obj.getRollNo(roll);

        System.out.print("Enter Subject 1 Marks: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();
        obj.getMarks(m1, m2);

        System.out.println("\n----- Student Result -----");
        obj.displayRollNo();
        obj.displayMarks();
        obj.displayResult();
    }
}
