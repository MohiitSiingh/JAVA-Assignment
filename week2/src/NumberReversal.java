import java.util.Scanner;
public class NumberReversal {
public static void main(String[] args) {
    System.out.println("Enter the number to be reversed: ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int Rev = reverseNumber(num);
    System.out.print("the number after reversing is : " + Rev);
}
static int reverseNumber(int number){
    int reversed = 0;
    while (number != 0){
    int digit = number % 10;
     reversed = reversed * 10 + digit;
     number = number / 10;
    }
    return reversed;
}
}
