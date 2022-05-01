import java.security.SecureRandom;
public class CrapGame {
    private static final SecureRandom random = new SecureRandom();

    private enum Determinant {CONTINUE, WON, LOST}

    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int TWELVE = 12;

    public static void main(String[] args) {
        int Point = 0;
        Determinant GameStatus;
        int SumOfDice = rolldice();

        switch (SumOfDice) {

            case SEVEN:
            case ELEVEN:
                GameStatus = Determinant.WON;
                break;

            case TWO:
            case THREE:
            case TWELVE:
                GameStatus = Determinant.LOST;
                break;

            default:
                Point = SumOfDice;
                GameStatus = Determinant.CONTINUE;
        }

        while (GameStatus == Determinant.CONTINUE) {
            SumOfDice = rolldice();

            if(SumOfDice == Point)
                GameStatus = Determinant.WON;

            else if (SumOfDice == SEVEN)
                GameStatus = Determinant.LOST;
        }

        if (GameStatus == Determinant.WON)
            System.out.println("You win!");

        else
            System.out.println("You lose");
    }

    public static int rolldice(){
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("You rolled %d + %d = %d%n", die1,die2,sum);

        return sum;
    }
}