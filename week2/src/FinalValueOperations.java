import java.util.Scanner;

public class FinalValueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String op = sc.nextLine();
            if (op.contains("+")) {
                X++;
            } else {
                X--;
            }
        }

        System.out.println("Final value: " + X);
        sc.close();
    }
}

