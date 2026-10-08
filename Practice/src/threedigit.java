import java.util.Scanner;
public class threedigit {
public static void main(String[] args)
{
    System.out.println("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num <= 999 && num  >= 100 )
    {
        for(int i = 0 ; i < 3 ; i++)
        { int remainder = num % 10 ;
          int copy = num/10;
            if (i == 0)
            {
                System.out.println("Ones " + remainder);
            }
            else if ( i == 1)
            {
                System.out.println("Tens" + remainder);
            }
            else if ( i == 2)
            {
                System.out.println("Hundred" + remainder);
            }

        }
    }
}
}
