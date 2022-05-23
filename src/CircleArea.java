import java.util.Scanner;
public class CircleArea {
    private static final Scanner input = new Scanner(System.in);
    public static double CalculateArea(int r){
         return Math.PI * Math.pow(r,2);
    }

    public static void main(String[] args) {
        System.out.print("Enter radius:");
        int radius = input. nextInt();
        double Area = CalculateArea(radius);
        System.out.printf("The area of circle with radius %d = %.2f", radius,Area);
    }

}
