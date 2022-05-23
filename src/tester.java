public class tester {
    public static int test(int a, int b, int c, int d){
        return a * b + Math.max(c,d);
    }

    public static void main(String[] args){
        int Result = test(6,9, 3, 8);
        System.out.println("Result is " +Result);
    }
}
