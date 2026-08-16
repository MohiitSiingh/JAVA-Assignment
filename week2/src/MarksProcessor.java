import java.util.Scanner;

public class MarksProcessor {
    static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    static double calculateAverage(int sum, int count) {
        if (count == 0) return 0;
        return (double) sum / count;
    }

    static void printReport(int count, int sum, double average,
                            int highest, int passes, int failures) {
        System.out.println("Number of valid marks: " + count);
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of failures: " + failures);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, sum = 0, highest = Integer.MIN_VALUE;
        int passes = 0, failures = 0;
        int mark;

        do {
            System.out.print("Enter mark (-1 to stop): ");
            mark = sc.nextInt();
            if (mark == -1) break;
            if (!isValidMark(mark)) {
                System.out.println("Invalid mark, ignored.");
                continue;
            }
            count++;
            sum += mark;
            if (mark > highest) highest = mark;
            if (mark >= 50) passes++;
            else failures++;
        } while (true);

        double average = calculateAverage(sum, count);
        if (count == 0) {
            System.out.println("No valid marks entered.");
        } else {
            printReport(count, sum, average, highest, passes, failures);
        }
        sc.close();
    }
}
