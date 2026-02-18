// Student class
class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

// Test class (inherits Student)
class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

// Sports interface
interface Sports {
    int sMarks = 20;   // constant variable

    void set();        // abstract method
}

// Result class (inherits Test + implements Sports)
class Result extends Test implements Sports {

    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void display() {
        int total = sub1 + sub2 + sMarks;

        System.out.println("Roll Number: " + getRollNo());
        getMarks();
        set();
        System.out.println("Total Marks: " + total);
    }

    // Main method
    public static void main(String[] args) {

        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(80, 75);

        r.display();
    }
}
