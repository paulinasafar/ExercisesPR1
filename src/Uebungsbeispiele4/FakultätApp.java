package Uebungsbeispiele4;

public class FakultätApp {

    public static void main(String[] args) {
        calcFaculty(5);
        calcFaculty(2);
        calcFaculty(0);
        calcFaculty(1);
        calcFaculty(8);

    }

    public static long calcFaculty(int value) {
        long fakultat = 1;
        if (value >= 2) {
            for (int i = 2; i <= value; i++) {
                fakultat = fakultat * i;
            }
        }
        System.out.println(fakultat);
        return fakultat;}
}
