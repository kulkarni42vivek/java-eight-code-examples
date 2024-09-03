package DSA.basics;

public class Power {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        // If n is negative
        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        // If n is even
        if (n % 2 == 0) {
            double half = myPow(x, n / 2);
            return half * half;
        } else { // If n is odd
            return x * myPow(x, n/2) * myPow(x, n /2);
        }
    }
    public static void main(String[] args) {
        double x = myPow(2,-2);
        System.out.println(x);
    }
}
