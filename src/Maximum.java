import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number for comparison:");
        double FirstNumber = input.nextDouble();
        double SecondNumber = input.nextDouble();
        double ThirdNumber = input.nextDouble();

        double Result = Largest(FirstNumber,SecondNumber,ThirdNumber);
        System.out.println("Maximum = " +Result);
    }

    public static double Largest(double a, double b, double c){
        return Math.max(c, Math.max(a,b));
    }
}
