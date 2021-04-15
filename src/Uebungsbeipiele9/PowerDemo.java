package Uebungsbeipiele9;

public class PowerDemo {

    public static void main(String[] args) {

        System.out.println();
        System.out.println(powerSimple1(2, 5));
        System.out.println(powerSimple2(2, 5));
        System.out.println(powerSimple3(2, 5));
        System.out.println(powerSimple4(2, 5));

    }

    //Methode A
    public static int powerSimple1(int x, int n) {
        int result = 1;
        while (n > 0) {
            result = result * x;
            n--;
        }
        return result;
    }

    //Methode B
    public static double powerSimple2(int x, int n) {
        double result = 0;
        result = Math.pow(x, n);
        return result;
    }

    //Methode C
    public static int powerSimple3(int x, int n) {

        if (n > 0) {
            return x * powerSimple3(x, n - 1);
        } else {
            return 1;
        }
    }

    //Methode D
    public static int powerSimple4(int x, int n) {

        if (n > 0) {
            if (n % 2 == 0) {
                return powerSimple4(x, n / 2) * powerSimple4(x, n / 2);
            } else {
                return x * powerSimple4(x, n / 2) * powerSimple4(x, n / 2);
            }}
    return 1;}
}


