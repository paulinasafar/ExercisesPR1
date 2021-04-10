package Uebungsbeispiele3;

import java.util.Arrays;

public class FizzBuzz {

    public static void main(String[] args) {

        isDivisible();
        System.out.println("\n" + Arrays.toString(isSavedInArray()));
        printOut(isSavedInArray());

    }
    //a Method
    public static int isDivisible() {
        int i = 1;
        int counter = 1;
        while (i <= 100) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " FizzBuzz");
                counter++;
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
                counter++;
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
                counter++;
            }
            i++;

        }
        return counter;}

    //b Method
    public static String[] isSavedInArray() {
            String[] array = new String[isDivisible()-1];
            int i = 1;
            int x = 0;

        while (i <= 100) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                array[x] = "FizzBuzz";
                x++;
            } else if (i % 3 == 0) {
                array[x] = "Fizz";
                x++;
            } else if (i % 5 == 0) {
                array[x] = "Buzz";
                x++;
            }
            i++;
        }
    return array;}

    //c Method
    public static void printOut(String[] string_array) {
        for (int i = 0; i < string_array.length; i++) {
            System.out.println(string_array[i]);
        }
    }

}
