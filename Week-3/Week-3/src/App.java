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
        System.out.println("sum of rows : ");
        for(int i : result)
        {
             System.out.println(i);
        }

        // int[][] arr1 = new int[3][3];
         int [][]arr1 = {{1,2,3}, {4,5,6},{7,8,9}};
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     for (int j = 0; j < arr[0].length; j++) 
        //     {
        //         // System.out.print("enter values for array  sum of columns " + i + " " + j + ": ");
        //         // arr1[i][j] = input.nextInt();
        //         int []result_column = MO.columnSum(arr1);
        //     }
        // }
        int []result_column = MO.columnSum(arr1);
        System.out.println("sum of columns : ");
        for(int i : result_column)
        {
             System.out.println(i);
        }

        int [][]first = {{1,2,3}, {3,4,5}, {5,6,7}};
        int [][]second = {{9,8,7}, {7,6,5},{5,4,3}};
        int [][]resultsum = MO.add(first,second);
        System.out.println("Sum of two arrays: ");
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                System.out.println(resultsum[i][j]);
            }
        }
        MO.MatrixOperations_main(input);
     
    
input.close();
    }
}
