
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);
    private static int level = 1;

    public static int generateMultiplication() {
        int a;
        int b;
        int result;

            a = 1 + random.nextInt(9);
            b = 1 + random.nextInt(9);

        System.out.printf("what is %d * %d: ", a, b);

        result = a * b;
        return result;
    }

    public static int generateAddition() {
        int a;
        int b;
        int result;

        if (level == 1) {
            a = 1 + random.nextInt(9);
            b = 1 + random.nextInt(9);
        } else if (level == 2) {
            a = 10 + random.nextInt(99);
            b = 10 + random.nextInt(99);
        } else {
            a = 100 + random.nextInt(999);
            b = 100 + random.nextInt(999);
        }

        System.out.printf("what is %d + %d: ", a, b);

        result = a + b;
        return result;
    }

    public static int generateSubtraction() {
        int a;
        int b;
        int result;

        if (level == 1) {
            a = 1 + random.nextInt(9);
            b = 1 + random.nextInt(9);
        } else if (level == 2) {
            a = 10 + random.nextInt(99);
            b = 10 + random.nextInt(99);
        } else {
            a = 100 + random.nextInt(999);
            b = 100 + random.nextInt(999);
        }

        System.out.printf("what is %d - %d: ", a, b);

        result = a - b;
        return result;
    }

    public static int generateDivision() {
        int a;
        int b;
        int result;

        if (level == 1) {
            a = 1 + random.nextInt(9);
            b = 1 + random.nextInt(9);
        } else if (level == 2) {
            a = 10 + random.nextInt(99);
            b = 10 + random.nextInt(99);
        } else {
            a = 100 + random.nextInt(999);
            b = 100 + random.nextInt(999);
        }


        if (a > b) {
            System.out.printf("what is %d / %d: ", a, b);
            result = a / b;
        } else {
            System.out.printf("what is %d / %d: ", b, a);
            result = b / a;
        }

        return result;
    }

    public static int generateRandom() {
        int Arithmetic = 1 + random.nextInt(4);
        int Yo = 0;
        switch (Arithmetic) {
            case 1:
              Yo =  generateAddition();
                break;

            case 2:
               Yo = generateSubtraction();
                break;

            case 3:
               Yo = generateMultiplication();
                break;

            case 4:
                Yo = generateDivision();
                break;
        }
        return Yo;
    }

    public static int generateQuestion(int Pick) {
        int Yo = 0;
        switch (Pick) {
            case 1:
              Yo =  generateAddition();
                break;

            case 2:
              Yo =  generateSubtraction();
                break;

            case 3:
                Yo = generateMultiplication();
                break;

            case 4:
                Yo = generateDivision();
                break;

            case 5:
               Yo = generateRandom();
        }
        return Yo;
    }

    public static String getNo() {
        int pic = 1 + random.nextInt(4);
        String Remark = " ";
        String Remark1 = "No. Please try again";
        String Remark2 = "Wrong. Try once more";
        String Remark3 = "Don't give up!";
        String Remark4 = "No.Keep trying";


        switch (pic) {
            case 1:
                Remark = Remark1;
                break;

            case 2:
                Remark = Remark2;
                break;

            case 3:
                Remark = Remark3;
                break;

            case 4:
                Remark = Remark4;
                break;
        }
        return Remark;
    }

    public static String getYes() {

        int pich = 1 + random.nextInt(4);
        String Credit = " ";
        String Credit1 = "Very good!";
        String Credit2 = "Excellent!";
        String Credit3 = "Nice work!";
        String Credit4 = "Keep the good work!";


        switch (pich) {
            case 1:
                Credit = Credit1;
                break;

            case 2:
                Credit = Credit2;
                break;

            case 3:
                Credit = Credit3;
                break;

            case 4:
                Credit = Credit4;
                break;
        }

        return Credit;
    }

    public static String getPercentage(int c) {
        String performance;
        String yes = "Congratulations! you're ready for the next round";
        String no = "Please ask your teacher for extra help";

        if (c >= 7)
            performance = yes;

        else
            performance = no;

        return performance;
    }

    public static void studentAttempt() {
        int correct = 0;
        int counter = 1;

        System.out.printf("%s%n%s%n", "Computer Assisted Instructions", "Enter yes to begin:");
        String reply = input.nextLine();
        System.out.println();

        while (reply.equals("yes")) {

            System.out.println("Choose an arithmetic problem \nEnter" + "\n1 for addition" +
                    "\n2 for subtraction" + "\n3 for multiplication" +
                    "\n4 for division" + "\n5 for random");
            int problem = input.nextInt();
            System.out.println();


            while (counter <= 10) {
                double question = generateQuestion(problem);
                double answer = input.nextDouble();

                if (answer == question) {
                    System.out.println(getYes());
                    correct++;
                }

                while (answer != question) {
                    System.out.println(getNo());
                    answer = input.nextDouble();


                    if (answer != question) {
                        System.out.println(getNo());
                        answer = input.nextDouble();
                    } else
                        System.out.println(getYes());
                }

                ++counter;
            }

            String P = getPercentage(correct);
            System.out.println(P);
            correct = 0;
            counter = 1;
        }

    }
    public static void main(String[] args) {
        studentAttempt();
    }
}