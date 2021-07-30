public class Fibonacci {
    public long getFibonacciValue(long n) {
        if (n <= 1) {
            return n;
        } else if (n == 2) {
            return 1;
        } else  {
            return getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
        }
    }
}
