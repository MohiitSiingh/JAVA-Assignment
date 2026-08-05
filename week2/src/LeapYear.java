import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
boolean LeapYear = isLeapYear(year);
System.out.println( year + " is leap year : "+ LeapYear);
input.close();
    }
    static boolean isLeapYear(int year){
        if(year%4==0 && year%100!= 0 || year % 400 == 0)
            return true;
        else 
            return false;
    }
}
