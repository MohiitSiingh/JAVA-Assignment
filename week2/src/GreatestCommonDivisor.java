import java.util.Scanner;
public class GreatestCommonDivisor {
public static void main(String[] args) {
    System.out.println("Enter first integer: ");
    Scanner input = new Scanner(System.in);
    int first = input.nextInt();
    System.out.println("Enter Second integer: ");
    int second = input.nextInt();

}
static int gcd(int first, int second){
   int  remainder = first % second;
    first = second;
    second = remainder;
    return remainder;

}
}
