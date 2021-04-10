package Uebungsbeispiele3;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        System.out.println();
        int[] numbers = {20, 15, 48, 5, 89, 90, 36, 122, -95, 85, 47, -5, 2};

        arrangeOrder(numbers);
    }

    public static void arrangeOrder(int[] numbers) {
        int save = numbers[0];

        for (int j = 0; j < numbers.length; j++) {
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[j] > numbers[i]) {
                    save = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = save;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));}
}
