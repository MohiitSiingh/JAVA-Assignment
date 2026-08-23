import java.util.Scanner;

public class App {
    // public static void main(String[] args) throws Exception {
    //     Scanner input = new Scanner(System.in);
    //     // Scanner input = new Scanner(System.in);
    //    /* int[][] arr = new int[3][3];
    //     for (int i = 0; i < arr.length; i++) 
    //     {
    //         for (int j = 0; j < arr[0].length; j++) 
    //         {
    //             System.out.print("enter values for array row or column sum at " + i + " " + j + ": ");
    //             arr[i][j] = input.nextInt();

    //         }
    //     }
    //         */

    //     MatrixOperations MO = new MatrixOperations();
    //     int [][]arr = {{1,2,3}, {4,5,6},{7,8,9}};
    //     int [] result = MO.rowSums(arr);
    //     System.out.println("sum of rows : ");
    //     for(int i : result)
    //     {
    //          System.out.println(i);
    //     }

    //     // int[][] arr1 = new int[3][3];
    //      int [][]arr1 = {{1,2,3}, {4,5,6},{7,8,9}};
    //     // for (int i = 0; i < arr.length; i++) 
    //     // {
    //     //     for (int j = 0; j < arr[0].length; j++) 
    //     //     {
    //     //         // System.out.print("enter values for array  sum of columns " + i + " " + j + ": ");
    //     //         // arr1[i][j] = input.nextInt();
    //     //         int []result_column = MO.columnSum(arr1);
    //     //     }
    //     // }
    //     int []result_column = MO.columnSum(arr1);
    //     System.out.println("sum of columns : ");
    //     for(int i : result_column)
    //     {
    //          System.out.println(i);
    //     }

    //     int [][]first = {{1,2,3}, {3,4,5}, {5,6,7}};
    //     int [][]second = {{9,8,7}, {7,6,5},{5,4,3}};
    //     int [][]resultsum = MO.add(first,second);
    //     System.out.println("Sum of two arrays: ");
    //     for(int i = 0 ; i < 3 ; i++)
    //     {
    //         for(int j = 0 ; j < 3 ; j++)
    //         {
    //             System.out.println(resultsum[i][j]);
    //         }
    //     }
        
     
    //     int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
    //     int [][]transpose = MO.transpose(matrix);
    //     System.out.println("transpose of the matrix is ");
    //     for(int i = 0 ; i < 3 ; i++)
    //     {
    //         for(int j = 0 ; j < 3 ; j++)
    //         {
    //             System.out.print( transpose[i][j] + " " );
    //         }
    //         System.out.println();
    //     }
    //     MO.MatrixOperations_main(input);
    //     input.close();
    // }
    


// ArrayStatisics code 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] values = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        // Empty array
        if (values.length == 0) {
            System.out.println("Array is empty.");
            sc.close();
            return;
        }

        

        int total = ArrayStatistics.sum(values);
        double avg = ArrayStatistics.average(values);
        int min = ArrayStatistics.minimum(values);
        int max = ArrayStatistics.maximum(values);
        int even = ArrayStatistics.countEven(values);

        int odd = values.length - even;

        System.out.println("\n Result will be");

        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);

        // Calling printSignCounts()
        ArrayStatistics.printSignCounts(values);

        sc.close();
    
}
}
