import java.util.Scanner;
public class threedigit {
public static void main(String[] args)
{
    System.out.println("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num <= 999 && num  >= 100 )
    {
        for(int i = 2 ; i < 0 ; i--)
        { int remainder ;

            if (i == 0)
            {remainder = num % 10 ;
                System.out.println("Ones :" + remainder);
            
            }
            else if ( i == 1)
            {remainder = num % 10 ;
                System.out.println("Tens :" + remainder);
            }
            else if ( i == 2)
            {remainder = num % 10 ;
                System.out.println("Hundred :" + remainder);
            }
            num = num/10;
        }
    }
}
}
