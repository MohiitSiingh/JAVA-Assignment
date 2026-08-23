public class ArrayTransformations {

    // Reverse the original array

    public static void reverseInPlace(int[] values) {

        int left = 0;
        int right = values.length - 1;

        while (left < right) {

            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }


    // a new reversed array
    
    public static int[] reversedCopy(int[] values) {

        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }

        return result;
    }


    // Remove all occurrences of target
   
    public static int removeValue(int[] values, int target) {

        int writeIndex = 0;

        for (int readIndex = 0; readIndex < values.length; readIndex++) {

            if (values[readIndex] != target) {

                values[writeIndex] = values[readIndex];
                writeIndex++;
            }
        }

        return writeIndex;
    }


    // Create and return running sum array
    public static int[] runningSum(int[] values) {

        int[] result = new int[values.length];

        int sum = 0;

        for (int i = 0; i < values.length; i++) {

            sum += values[i];
            result[i] = sum;
        }

        return result;
    }
}