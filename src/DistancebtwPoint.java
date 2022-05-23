public class DistancebtwPoint {
    public static double distance(double a, double b, double c, double d){
        return (Math.pow(b-a,2) + Math.pow(d-c,2));
    }

    public static void main(String[] args) {
        distance(7.0,11.0,15.0,20);
    }
}
