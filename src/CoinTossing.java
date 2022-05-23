import java.util.Scanner;
import java.security.SecureRandom;
public class CoinTossing {
    private static final Scanner input = new Scanner(System.in);
    private static final SecureRandom random = new SecureRandom();
    private enum Coin {HEAD, TAIL}
    private static Coin gamestatus;

    public static String flip() {
        int Figure =  random.nextInt(2);

        if (Figure == 0) {
            gamestatus = Coin.HEAD;
            return "HEAD";
        }
        else {
            gamestatus = Coin.TAIL;
            return "TAIL";
        }
    }

    public static void tossCoin() {
        int Head = 0;
        int Tail = 0;
        flip();

        if (gamestatus == Coin.HEAD)
            ++Head;
        else
            ++Tail;

   System.out.print("Toss = " +flip());
   System.out.printf("%nHead Count = %d%nTail Count =%d%n%n", Tail, Head);
    }

    public static void main(String[] args) {
        System.out.print("Enter 1 to play tossing coin game:");
        int Play = input.nextInt();
        while (Play == 1) {
            System.out.print("Choose amount of round:");
            int Round = input.nextInt();

            for (int y = 1; y <= Round; ++y) {
                tossCoin();
            }

            System.out.println("Enter 1 to keep play or anything else to quit");
            Play = input.nextInt();
        }
    }
}
