import java.security.SecureRandom;
public class Rolling {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int result = 1 + random.nextInt(6);

        for (int Counter = 1; Counter <= 20; ++Counter){
            System.out.printf("%d ", result);
            result = 1 + random.nextInt(6);

            if(Counter == 10)
                System.out.println();
        }
    }
}
