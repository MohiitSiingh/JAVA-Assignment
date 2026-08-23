public class ArrayStatistics {

    static int sum(int[] values) {
        int total = 0;
        for (int v : values) total += v;
        return total;
    }

    static double average(int[] values) {
        if (values.length == 0) return 0.0;
        return (double) sum(values) / values.length;
    }

    static int minimum(int[] values) {
        if (values.length == 0) return 0;
        int min = values[0];
        for (int v : values) if (v < min) min = v;
        return min;
    }

    static int maximum(int[] values) {
        if (values.length == 0) return 0;
        int max = values[0];
        for (int v : values) if (v > max) max = v;
        return max;
    }

    static int countEven(int[] values) {
        int count = 0;
        for (int v : values) if (v % 2 == 0) count++;
        return count;
    }

    static void printSignCounts(int[] values) {
        int positives = 0, negatives = 0, zeros = 0;
        for (int v : values) {
            if (v > 0) positives++;
            else if (v < 0) negatives++;
            else zeros++;
        }
        System.out.println("Positive count: " + positives);
        System.out.println("Negative count: " + negatives);
        System.out.println("Zero count: " + zeros);
    }
}
