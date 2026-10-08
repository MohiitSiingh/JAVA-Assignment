public class LeapYear {
    public static void main(String[] args)
    {
       int year = 2024;
       boolean leap = isLeapYear(year);
       System.out.println("is is a leap year :  " + leap);
    }

        static boolean isLeapYear(int year)
            {
                if(year % 400 == 0 || (year%4 ==0 && year%100 !=0) )
                {
                    return true ;
                }
                return false;
            }
}
