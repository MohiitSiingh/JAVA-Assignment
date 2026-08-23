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
    





    public static void main(String[] args) {

   
      //  //  1 - ARRAY STATISTICS
    

        // int[] numbers = {10, -5, 20, 0, -5, 8, 10};

        // System.out.println("Result for array stats:");

        // System.out.println("Sum: " + ArrayStatistics.sum(numbers));

        // System.out.println("Average: " + ArrayStatistics.average(numbers));

        // System.out.println("Minimum: " + ArrayStatistics.minimum(numbers));

        // System.out.println("Maximum: " + ArrayStatistics.maximum(numbers));

        // int even = ArrayStatistics.countEven(numbers);

        // System.out.println("Even count: " + even);

        // System.out.println("Odd count: " + (numbers.length - even));

        // ArrayStatistics.printSignCounts(numbers);


   
    //     //  2 - LINEAR SEARCH
      

    //     int[] searchArray = {10, 20, 30, 20, 40, 20};

    //     int target = 20;

    //     System.out.println("\nLinear Search Toolkit");

    //     System.out.println(
    //         "Contains: " +
    //         LinearSearchToolkit.contains(searchArray, target)
    //     );

    //     System.out.println(
    //         "First index: " +
    //         LinearSearchToolkit.firstIndexOf(searchArray, target)
    //     );

    //     System.out.println(
    //         "Last index: " +
    //         LinearSearchToolkit.lastIndexOf(searchArray, target)
    //     );

    //     System.out.println(
    //         "Occurrences: " +
    //         LinearSearchToolkit.countOccurrences(searchArray, target)
    //     );
    // }
 // 65. TASK 3 - ARRAY TRANSFORMATIONS
   // reverseInPlace()

        int[] reverseArray = {1, 2, 3, 4, 5};

        System.out.println("Before reverse:");

        printArray(reverseArray);

        ArrayTransformations.reverseInPlace(reverseArray);

        System.out.println("After reverseInPlace:");

        printArray(reverseArray);


        // reversedCopy()

        int[] original = {10, 20, 30, 40, 50};

        int[] copy = ArrayTransformations.reversedCopy(original);

        System.out.println("\nOriginal array:");

        printArray(original);

        System.out.println("Reversed copy:");

        printArray(copy);


        // removeValue()

        int[] removeArray = {10, 20, 30, 20, 40, 20};

        int logicalLength =
                ArrayTransformations.removeValue(removeArray, 20);

        System.out.println("\nAfter removing 20:");

        for (int i = 0; i < logicalLength; i++) {
            System.out.print(removeArray[i] + " ");
        }

        System.out.println();

        System.out.println("Logical length: " + logicalLength);

        System.out.println("Original array length: " + removeArray.length);


        // runningSum()

        int[] sumArray = {1, 2, 3, 4, 5};

        int[] running = ArrayTransformations.runningSum(sumArray);

        System.out.println("\nOriginal array:");

        printArray(sumArray);

        System.out.println("Running sum:");

        printArray(running);
    }


    // Helper function for displaying arrays
    public static void printArray(int[] values) {

        for (int value : values) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}
