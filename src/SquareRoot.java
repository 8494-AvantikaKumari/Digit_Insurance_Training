public class SquareRoot {
    public static double squareRoot(int n, double precision) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }

        if (n == 0) {
            return 0;
        }

        double low = 0;
        double high = n;
        double mid;

        while ((high - low) > precision) {
            mid = (low + high) / 2;
            if (mid * mid > n) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return (low + high) / 2;
    }

    public static void main(String[] args) {
        int number = 25;
        double precision = 1e-7;
        System.out.println("The square root of " + number + " is approximately: " + squareRoot(number, precision));
    }
}
