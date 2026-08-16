import java.util.Scanner;

public class MenuCalculator {
    public static void printMenu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    public static int calculate(int choice, int a, int b) {
        switch (choice) {
            case 1: return a + b;
            case 2: return a - b;
            case 3: return a * b;
            case 4: return b != 0 ? a / b : Integer.MIN_VALUE;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = sc.nextInt();
            if (choice == 0) break;
            if (choice < 0 || choice > 4) {
                System.out.println("Invalid choice");
                continue;
            }
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int result = calculate(choice, a, b);
            if (choice == 4 && result == Integer.MIN_VALUE) {
                System.out.println("Division by zero not allowed");
            } else {
                System.out.println("Result: " + result);
            }
        } while (choice != 0);
        sc.close();
    }
}
