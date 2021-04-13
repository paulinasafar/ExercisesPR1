package Uebungsbeispiele8;

public class DiagonalSumApp {

    public static void main(String[] args) {

        int[][] array1 = {  {3, 5, -85, 75},
                            {6, 65, 76, 98},
                            {-5, 0, 34, 8},
                            {-5, 0, 34, 65}, };

        System.out.println(diagonalSum(array1));
    }

    public static int diagonalSum(int[][] int_array) {
        int sum = 0;
        int i = 0;

            for (int j = int_array[i].length - 1; j >= 0; j--) {
                sum = sum + int_array[i][j];
                i++;
            }
        return sum;}
}

