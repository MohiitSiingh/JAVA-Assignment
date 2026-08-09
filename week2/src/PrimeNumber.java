import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
    // System.out.println("Enter")
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = input.nextInt();
    boolean NumIsPrime = isPrime(num);
 System.out.println("The number is prime: " + NumIsPrime);
 input.close();
}
static boolean isPrime (int prime){
if(prime<2)
    return false;
for(int divisor =2 ; divisor * divisor <= prime; divisor++){
if(prime % divisor == 0){
    return false;
        }
    }
return true;
    }
}

