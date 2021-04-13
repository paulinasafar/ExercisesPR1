package Uebungsbeispiele8;

import java.util.Arrays;

public class AverageApp {

    public static void main(String[] args) {

        int[][] array1 = {  {3, -5, 85, 75},
                            {6, 65, 76, 98},
                            {-5, 0, 34, 8},
                            {-5, 0, 34, 65},
                            {71, 45, 66, 9}  };

        System.out.println(Arrays.toString(averagesArray(array1)));

    }
    public static double[] averagesArray(int[][] int_array) {
        double[] array2 = new double[int_array.length];
        double sum = 0;

        for (int i = 0; i < int_array.length; i++) {
            for (int j = 0; j < int_array[i].length; j++) {
                sum = sum + int_array[i][j];
            }

        array2[i] = sum / int_array[i].length;}
    return array2;}
}
