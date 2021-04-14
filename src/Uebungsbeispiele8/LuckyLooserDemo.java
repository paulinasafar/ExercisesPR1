package Uebungsbeispiele8;

import java.util.Arrays;

public class LuckyLooserDemo {
    public static void main(String[] args) {

        String[] array1 = {"Rosa", "Vicky", "John", "Matilda", "Peter", "Franz"};
        String[] array2 = {"Matilda", "Leni", "Ibrahim", "Dominic", "Franz", "Marco", "Anna"};

        System.out.println(Arrays.toString(getLoosers(array1, array2)));

    }

    public static int counter(String[] array1, String[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static String[] getLoosers(String[] array1, String[] array2) {
        String[] loosers = new String[counter(array1, array2)];
        int x = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    loosers[x] = array2[j];
                x++;}
            }
        }
        return loosers;
    }
}

