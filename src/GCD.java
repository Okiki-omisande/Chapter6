public class GCD {

    public static int Gdc(int a, int b){
        if(a == 0 || b == 0)
            return 0;

        else if(a == b)
            return a;

        else if(a > b)
            return Gdc(a - b, b);

        else
            return Gdc(b - a,a);
    }

    public static void main(String[] args) {
        Gdc(576,342);
        System.out.println("The greatest common divisor is " +Gdc(576,342));
    }
}
