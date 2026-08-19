import java.util.Scanner;
public class GreatestCommonDivisor {
public static void main(String[] args) {
    System.out.println("Enter first integer: ");
    Scanner input = new Scanner(System.in);
    
    int first = input.nextInt();
    first = Math.abs(first);
    System.out.println("Enter Second integer: ");
    int second = input.nextInt();
    second = Math.abs(second);
    int GCD = gcd(first,second);
    System.out.println("Greatest Common Divisor : " + GCD);
     input.close();
}
static int gcd(int first, int second){
   while(second!=0){
   int  remainder = first % second;
    first = second;
    second = remainder;

   }

    return first;
   
}
}
