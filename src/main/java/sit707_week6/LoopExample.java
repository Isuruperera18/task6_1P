package sit707_week6;

public class LoopExample {

    /**
     * Sums the numbers from 1 to a given positive integer n.
     *
     * @param n the maximum number to sum
     * @return the sum of all numbers from 1 to n
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Counts how many positive integers from 1 to n are divisible by a given number divisor.
     *
     * @param n       the maximum number to check
     * @param divisor the divisor
     * @return the count of numbers from 1 to n that are divisible by the divisor
     */
    public static int countDivisibles(int n, int divisor) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        return count;
    }
}
