package Uebungsbeispiele3;

import java.util.Arrays;

public class FlatArray {

    public static void main(String[] args) {

        int[][] numbers1 = {{5, 1, 9, 18}, {6, 5, 1, 12, 8}};
        System.out.println(numbers1.length);
        System.out.println(Arrays.toString(getFlatArray(numbers1)));

    }

    //Methode A
    public static int[] getFlatArray(int[][] int_array) {
        int counter = 0;
        for (int k = 0; k < int_array.length; k++) {
            for (int l = 0; l < int_array[k].length; l++) {
                int_array[k][l] = int_array[k][l];
                counter++;
            }
        }

        int[] numbers2 = new int[counter];
        int x = 0;
        for (int i = 0; i < int_array.length; i++) {
            for (int j = 0; j < int_array[i].length; j++) {
                numbers2[x] = int_array[i][j];
                x++;
            }
        }
        //Methode B
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = i + 1; j < numbers2.length; j++) {
                if (numbers2[i] == numbers2[j]) {
                    numbers2[j] = -1;
                }
            }
        }
        return numbers2;
    }
}

