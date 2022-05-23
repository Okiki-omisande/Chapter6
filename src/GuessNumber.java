import java.security.SecureRandom;
import java.util.Scanner;
public class GuessNumber {

    private static final SecureRandom Random = new SecureRandom();
    private static final Scanner Input = new Scanner(System.in);
    private enum Mode {HIGH,LOW,YES,DEFAULT}

    public static int Guess(){
        return 1 + Random.nextInt(1000);
    }

    public static void GAME(){
        int play;
        int Playerguess;

        System.out.println("Enter 1 to play or anything else to cancel:");
        play = Input.nextInt();

        while(play == 1){
            System.out.println("Enter your guess between 1 - 1000:");
            int value = Guess();
            Playerguess = Input.nextInt();

            Mode game;
            if (Playerguess < value){
                game = Mode.LOW;
                System.out.println("Too low, try again\n");
            }

            else if (Playerguess > value){
                game = Mode.HIGH;
                System.out.println("Too High, try again\n");
            }

            else{
                game = Mode.YES;
                System.out.println("Congratulations. You guessed right!\n");
            }

            while (game == Mode.YES){
                game = Mode.DEFAULT;
                System.out.println("Enter 1 to continue to playing again:");
                play = Input.nextInt();
            }
        }
        System.out.println("Good bye!");
    }

    public static void main(String[] args) {
        GAME();
    }

}
