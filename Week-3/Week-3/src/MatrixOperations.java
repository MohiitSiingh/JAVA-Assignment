import java.util.Scanner;

public class MatrixOperations {
    public void MatrixOperations_main(Scanner input) {
        // Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = input.nextInt();

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
    public int[] columnSum(int[][] matrix){
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
}
