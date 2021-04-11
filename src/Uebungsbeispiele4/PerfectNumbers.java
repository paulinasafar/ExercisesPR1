package Uebungsbeispiele4;

public class PerfectNumbers {

    public static void main(String[] args) {

        isPerfectNumber();

    }

    public static void isPerfectNumber() {

        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.println("Perfect Number: " + i);
            }
        }
    }
}