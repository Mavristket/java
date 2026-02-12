import java.util.Scanner;

class MatrixOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] result = new int[2][2];

        // Input Matrix A
        System.out.println("Enter elements of Matrix A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter elements of Matrix B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Menu
        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                // Addition
                System.out.println("Addition Result:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = A[i][j] + B[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Multiplication
                System.out.println("Multiplication Result:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += A[i][k] * B[k][j];
                        }
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                // Transpose of Matrix A
                System.out.println("Transpose of Matrix A:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(A[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
