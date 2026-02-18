interface Shape {
    double area();
}

class Rectangle implements Shape {
    double l;
    double w;

    // Constructor
    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double area() {
        return l * w;
    }
}

class Triangle implements Shape {
    double base;
    double height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class Result {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 6);
        Triangle t = new Triangle(6, 4);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}
