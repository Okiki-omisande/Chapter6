public class knowHypotenuse {
    public static double Hypotenuse(double a, double b){
        double Hypo = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return Math.pow(Hypo,2);
    }

    public static void main(String[] args) {
        double Result2 = Hypotenuse(3,4);
        System.out.println("Hypotenuse = " +Result2);
    }
}
