import MathOperations.MathFunctions;
import java.util.Scanner;

public class TestMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double number = sc.nextDouble();

        // Create object
        MathFunctions obj = new MathFunctions();

        System.out.println("Floor value: " + obj.findFloor(number));
        System.out.println("Ceil value: " + obj.findCeil(number));
        System.out.println("Round value: " + obj.findRound(number));

        sc.close();
    }
}