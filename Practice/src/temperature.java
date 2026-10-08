import java.util.Scanner;
public class temperature {
public static void main(String[] args) {
        double fahrenheit , celsius;
        System.out.print("Input the temperature in celsius: ");
        Scanner input = new Scanner(System.in);
        celsius = input.nextDouble();
        fahrenheit = celsius * 9.0 / 5.0 + 32.0 ;
        System.out.println("the temperature in fahrenheit is " + fahrenheit);
    }
}
