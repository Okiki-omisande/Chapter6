import java.util.Scanner;

public class ReversingDigits {
    public static int reverseDigits(int number) {
       int Quotient; int reverseInt = 0;
       while (number > 0){
           Quotient = number % 10;
           reverseInt = reverseInt * 10 + Quotient;
           number = number/10;
       }
       return reverseInt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number ");
        int num = in.nextInt();

        System.out.println("reversed is: " + reverseDigits(num));

    }
}
