import java.util.Scanner;

public class TemperatureConversion {
    private static final Scanner input = new Scanner(System.in);

    private static double Celsius(int a) {
        return 5.0 / 9.0 * (a - 32);
    }

    private static double Farenheit(double a) {
        return  (a * (9.0/5.0)) + 32;

    }

    public static void main(String[] args) {
        System.out.print("Enter 1 to convert Celsius to Farenheit or enter 2 if vice versa:");
        int Number = input.nextInt();

        if (Number == 1) {
            System.out.print("Enter number for conversion to Farenheit:");
            int celcius = input.nextInt();
            double Result = Farenheit(celcius);
            System.out.printf("%d degree celcius = %.2f degree farenheit", celcius, Result);
        }

        else {
            System.out.print("Enter number for conversion to Celcuis:");
            int farenheit = input.nextInt();
            double Result2 = Celsius(farenheit);
            System.out.printf("%d degree farenheit = %.2f degree celcius", farenheit, Result2);
        }
    }
}
