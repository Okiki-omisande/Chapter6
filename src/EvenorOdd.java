import java.util.Scanner;

public class EvenorOdd {
    private static final Scanner input = new Scanner(System.in);

    public static boolean isEven (int a){
        int Check = a % 2;
        return  Check == 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter series length:\n");
        int series = input.nextInt();

        for (int i =1; i <= series; ++i){
            System.out.print("Enter numbers:");
            int Number = input.nextInt();
            boolean Result = isEven(Number);
            System.out.println(Result);
        }
    }
}
