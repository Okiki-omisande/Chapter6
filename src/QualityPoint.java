import java.util.Scanner;

public class QualityPoint {
    private static final Scanner input = new Scanner(System.in);
    public static double divider(double a, double b){
        return a/b;
    }

    public static int QualityPoints(double Score){
            int result = (int)divider(Score,10.0);

            switch (result){
            case 10: case 9:
            result = 4;
            break;

            case 8:
            result = 3;
            break;

            case 7:
            result = 2;
            break;

            case 6:
            result = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter student grade:");
        double grade = input.nextInt();
        int Result = QualityPoints(grade);

        System.out.printf("Quality point = %d", Result);
    }
}
