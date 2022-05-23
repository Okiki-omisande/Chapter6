import java.util.Scanner;

public class ParkingCharge {
    private static final Scanner input = new Scanner(System.in);

    public static double calculateCharge(int hours) {
        double charge = 0.0;
        if (hours >= 1 && hours <= 3)
            charge = 2.0;

        if (hours > 3 && hours <= 19)
            charge = 2.0 + ((hours - 3) * 0.50);

        if (hours >= 24)
            charge = 10.0;

        return charge;
    }

    public static double calculateReceipt(){
        double Totalreceipt = 0.0;

        System.out.print("Enter total number of receipt:");
        int Counter = input.nextInt();

        for (int x = 1; x <= Counter; ++x)
        {
            System.out.print("Enter hour:");
            int hour = input.nextInt();
            double Total = calculateCharge(hour);
            System.out.printf("Your charge is $%.2f%n", Total);

            Totalreceipt += Total;
        }

        return  Totalreceipt;
    }

    public static void main(String[] args) {
        System.out.printf("Total receipt is $%.2f", calculateReceipt());
    }
    }

