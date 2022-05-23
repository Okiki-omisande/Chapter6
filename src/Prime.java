public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        else if (n == 2 || n == 3)
            return true;

        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int h = 10000;
        int counter = 0;

        for (int i = 2; i < h; ++i) {
            if (isPrime(i))
                ++counter;
                System.out.printf("%d is a prime number%n", i);
        }
        System.out.println("the number of prime numbers greater than 10000 is " +counter);
    }
}