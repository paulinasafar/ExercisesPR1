package Uebungsbeispiele4;

public class NarcissisticNumbersApp {

    public static void main(String[] args) {

        for (int number = 1; number < 1000; number++) {
            isNarcissisticNumber1(number);
            isNarcissisticNumber2(number);

        }
    }

    public static int isNarcissisticNumber1(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + ((number % 10) * (number % 10) * (number % 10));
            number = number / 10;
        }
    return sum;}

    public static boolean isNarcissisticNumber2(int number) {

        if (number == isNarcissisticNumber1(number)) {
            System.out.println("Narcissistic number is: " + number);}
    return true; }
}
