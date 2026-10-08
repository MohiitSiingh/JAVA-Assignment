import java.util.Scanner;
public class SimpleInterest {

public static void main(String[] args)
{
    double Principal , intRate , time;
    System.out.print("Enter amount : ");
    Scanner sc = new Scanner(System.in);
    Principal = sc.nextDouble();

    System.out.print("Enter Interest Rate : ");
    intRate = sc.nextDouble();

    System.out.print("Enter time in years : ");
    time= sc.nextDouble();

    double  simpleInterest = Principal * intRate * time / 100;
	double finalAmount = Principal + simpleInterest;

    System.out.println("The Interese amount is "+simpleInterest + "\nThe final amount is " + finalAmount);

}
}
