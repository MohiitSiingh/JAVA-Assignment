import java.util.Scanner;

public class MatrixOperations {
    public void MatrixOperations_main(Scanner input) {
        // Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("enter values for array row or column sum at " + i + " " + j + ": ");
                arr[i][j] = input.nextInt();

            }
        }
        int[][] arr1 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
  System.out.print("enter values for array 1 sum at " + i + " " + j + ": ");
                arr1[i][j] = input.nextInt();

            }
        }
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
  System.out.print("enter values for array 2 sum at " + i + " " + j + ": ");
                arr2[i][j] = input.nextInt();

            }
        }
        rowSums(arr);
        columnSum(arr);
    }

    public int[] rowSums(int[][] matrix) {

        int[] rowsum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            rowsum[i] = sum;
            // System.out.println("Sum of rows : " + sum);

        }

        return rowsum;
    }

    public int[] columnSum(int[][] matrix) {
        int[] ColumnSum = new int[matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            ColumnSum[i] = sum;
        }
        return ColumnSum;
    }

    public int[][] add(int[][] first, int[][] second) {
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                arr3[i][j] = first[i][j] + second[i][j];
            }
        }
        return arr3;
    }
}