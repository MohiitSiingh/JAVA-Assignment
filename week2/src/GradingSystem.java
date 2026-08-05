import java.util.Scanner;
public class GradingSystem {
public static void main(String[] args) {
    System.out.println("Enter Marks: ");
    Scanner input = new Scanner(System.in);
    int marks = input.nextInt();
    System.out.println("marks between 80 - 100 = distinction");
    System.out.println("marks between 70-79 : merit");
    System.out.println("Marks between 50 to 69 = pass");
    System.out.println("Marks between 0 to 49 = fail");
  String Grade =   classifyMark(marks);
  System.out.println(" Grade is " + Grade);
    input.close();
}
    static String classifyMark(int marks) {
        String Classification = "";
if (marks < 0 || marks >100){
    Classification = "Invalid";
}
else if(marks >= 80 && marks <= 100){
    Classification = "Distinction";
}
else if(marks >= 70 && marks <= 79){
 Classification =  "Merit";
}
else if(marks >= 50 && marks <= 69){
    Classification =  "Pass";
}
else if(marks>=0 && marks <=49){
   Classification =   "Fail";
}

return Classification;

}
}
