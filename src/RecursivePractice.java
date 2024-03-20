public class RecursivePractice {
    public static void main(String[] args) {
        int n = 11;
        System.out.println("Sum of odd integers from 1 to " + n + ": " + oddSum(n));

        int m = 1;
        int n1 = 2;
        System.out.println("A(" + m + ", " + n1 + ") = " + ack(m, n1));

        double x = 2.0;
        int j = 6;
        System.out.println(x + " raised to the power of " + j + " is: " + power(x, j));

        int[] arr = {2, 5, 8, 3, 9, 1, 4};
        int lowIndex = 1;
        int highIndex = 5;
        System.out.println("Maximum value in the range: " + maxInRange(arr, lowIndex, highIndex));
    }

    public static int oddSum(int n) {
        System.out.println("n: " + n);

        if (n == 1) {
            return 1;
        }

        if (n % 2 != 0) {
            return n + oddSum(n - 2);
        } else {
            return oddSum(n - 1);
        }
    }

    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        }

        return ack(m - 1, ack(m, n - 1));
    }

    public static double power(double x, int j) {
        if (j == 0) {
            return 1;
        }

        if (j % 2 == 0) {
            double temp = power(x, j / 2);
            return temp * temp;
        } else {
            return x * power(x, j - 1);
        }
    }

    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        }

        int midIndex = (lowIndex + highIndex) / 2;
        int maxLeft = maxInRange(arr, lowIndex, midIndex);
        int maxRight = maxInRange(arr, midIndex + 1, highIndex);

        return Math.max(maxLeft, maxRight);
    }
}