public class SquareOfAsterisk {
    public static int SquareOfAsterisks(int a, char b){
         for (int i = 1; i <= a; ++i){
            System.out.print("    ");
            for (int j = 1; j <= a; ++j){
                System.out.printf("%s ",b);
            }
            System.out.println();
        }

        return a;
    }

    public static void main(String[] args) {
        int Result = SquareOfAsterisks(4,'+');
        System.out.println(Result);
    }
}
