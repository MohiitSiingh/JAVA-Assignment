import java.util.Scanner;
public class GradingSystem {
public static void main(String[] args) {
    System.out.println("Enter Marks: ");
    Scanner input = new Scanner(System.in);
    int marks = input.nextInt();
    System.out.println("marks between 80 - 100 = distinction");
    System.out.println("marks between 70-79 : merit");
    System.out.println("Marks between 50 to 69 = pass");
    System.out.println("Marks between 0 to 49 = fail");
    
}
}
