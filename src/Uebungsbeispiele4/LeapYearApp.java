package Uebungsbeispiele4;

public class LeapYearApp {

    public static void main(String[] args) {

        isLeapYear(1992);
        isLeapYear(1998);
        isLeapYear(1996);
        isLeapYear(425);
        isLeapYear(1124);
        isLeapYear(0);
        isLeapYear(-988);

    }

    public static void isLeapYear(int year) {

        if (year % 2 == 0) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("Year " + year + " is a leap year.");
            } else if (year % 400 == 0) {
                System.out.println("Year " + year + " is a leap year.");
            } else {
                System.out.println("Year " + year + " is NOT a leap year.");
            }
        } else {
            System.out.println("Year " + year + " is NOT a leap year.");
        }
    }
}
