import java.util.Scanner;

public class Multiple {
    private static final Scanner input = new Scanner(System.in);
    public static boolean isMultiple(int a, int b) {
        int check = a % b;

        return check == 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter series total:");
        int series = input.nextInt();

        for (int c = 1; c <= series; ++c){
            System.out.print("Enter numbers with space:");
            int y = input.nextInt();
            int z = input.nextInt();

            boolean Result = isMultiple(y,z);
            System.out.println(Result);
        }
    }

}