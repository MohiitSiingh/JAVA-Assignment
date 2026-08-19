import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Scanner input = new Scanner(System.in);
       /* int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                System.out.print("enter values for array row or column sum at " + i + " " + j + ": ");
                arr[i][j] = input.nextInt();

            }
        }
            */

        MatrixOperations MO = new MatrixOperations();
        int [][]arr = {{1,2,3}, {4,5,6},{7,8,9}};
        int [] result = MO.rowSums(arr);
        for(int i : result)
        {
             System.out.println(i);
        }

        int[][] arr1 = new int[3][3];
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                System.out.print("enter values for array 1 sum at " + i + " " + j + ": ");
                arr1[i][j] = input.nextInt();

            }
        }
        MO.columnSum(arr1);

        MO.MatrixOperations_main(input);
     
    
input.close();
    }
}
