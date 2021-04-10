package Uebungsbeispiele2;

public class TurmRechnen {

    public static void main(String[] args) {

                turmRechnen(9,5);
                turmRechnen(5,8);
                turmRechnen(2,10);
    }

    public static void turmRechnen(long x, long y) {
        long z = 2;
        long a = y;
        System.out.println("Starting with number " + x + ", and going for " + y + " times.");
        while (a > 1) {
            x = x * z;
            System.out.println(x + " * " + z + " = " + (x * z));
            x = x * z;
            z++;
        a--;}
        z = (z - y) + 1;
        while (y > 1) {
            System.out.println(x + " / " + z + " = " + (x / z));
            x = x / z;
            z++;
        y--;}
    }
}
