public class Exponential {
    public static int IntegerPow(int a, int b) {
        int Total = 1;

        for (int c = 1; c <= b; ++c) {
            Total *= a;
        }
        return Total;
    }

    public static void main(String[] args) {
        int Result = IntegerPow(5,2);
        System.out.println(Result);
    }
}

