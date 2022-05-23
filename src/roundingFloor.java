import java.util.Scanner;

public class roundingFloor {
    private static final Scanner input = new Scanner(System.in);

    public static double Roundint(double x){
        return Math.floor(x);
    }

    public static  double RoundTenth(double x){
     return Math.floor(10 * x) / 10;
    }

    public static  double RoundHundredth(double x){
        return Math.floor(100 * x) / 100;
    }

    public static  double RoundThousand(double x){
        return Math.floor(1000 * x) / 1000;
    }


    public static void main(String[] args){
        System.out.print("Enter total of numbers to round:");
        int Total = input.nextInt();
        System.out.println();

        for (int a = 1; a <= Total; ++a)
        {
            System.out.print("Input number to round off:");
            double Number = input.nextDouble();
            double Round = Roundint(Number);
            double tenth = RoundTenth(Number);
            double hundredth = RoundHundredth(Number);
            double thousandth = RoundThousand(Number);

            System.out.printf("original number = %f" + "\nnearest int:%.0f" + "\nnearest tenth:%.1f" +
                    "\nnearest hundredth:%.2f" + "\nnearest thousandth:%.3f\n", Number, Round,tenth,hundredth,thousandth);
            System.out.println();
        }
    }
}
