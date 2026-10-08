import java.util.Scanner;
public class threedigit {
public void main(String[] args)
{
    System.out.println("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num <= 999 && num  >= 100 )
    {
        for(int i = 0 ; i < 3 ; i++)
        { int remainder = num % 10 ;
            if ( remainder >= 0 && remainder <=9)
            {
                System.out.println("Ones " + remainder);
            }
            else if ( remainder >= 9 && remainder <=9)
            {
                System.out.println("Tens" + remainder);
            }
        }
    }
}
}
