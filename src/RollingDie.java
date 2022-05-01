import java.security.SecureRandom;
public class RollingDie {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int Rolling = 1 + random.nextInt(6);
        int Counter1 = 0, Counter2 = 0, Counter3 = 0, Counter4 = 0, Counter5 = 0, Counter6 = 0;

        for (int Counter = 1; Counter <= 6000000; ++Counter) {

            switch (Rolling) {
                case 1:
                    ++Counter1;
                    break;

                 case 2:
                     ++Counter2;
                     break;

                case 3:
                    ++Counter3;
                    break;

                case 4:
                    ++Counter4;
                    break;

                case 5:
                    ++Counter5;
                    break;

                case 6:
                    ++Counter6;
                    break;

            }

            Rolling = 1 + random.nextInt(6);
        }
        System.out.println("die \t played");
        System.out.printf("1        %d%n2        %d%n3        %d%n4        %d%n5        %d%n6        %d%n",
                Counter1, Counter2,Counter3,Counter4,Counter5,Counter6);
    }
}
