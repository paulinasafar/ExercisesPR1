package Uebungsbeispiele12;
import java.util.Arrays;

public class PropertyTaxDemo {
    public static void main(String[] args) {

        int[][] array1 = {{1, 30, 40},
                {2, 50, 20},
                {1, 25, 35},
                {3, 15, 45},
                {3, 30, 40},
                {2, 30, 10},
                {1, 35, 35},
                {1, 25, 65},
                {3, 15, 45},
                {1, 10, 70},
                {2, 30, 10},
                {3, 75, 15}};

        int[] kunden1 = {0, 4, 6, 8, 11, 4, 0, 11, 15, 7, 17, 24};

        System.out.println(array1.length);
        System.out.println(kunden1.length);

        System.out.println("Area Array: " + Arrays.deepToString(calcArea(array1)));
        System.out.println("Array with Taxes: " + Arrays.deepToString(calcTax(array1)));
        System.out.println(calcClientProperty(array1, kunden1));

    }

    public static int[][] calcArea(int[][] array1) {
        int[][] array2 = new int[array1.length][2];

        for (int i = 0; i < array1.length; i++) {
            array2[i][0] = array1[i][0];
            array2[i][1] = array1[i][1] * array1[i][1];
        }

        return array2;
    }

    public static double[][] calcTax(int[][] array1) {
        double[][] array3 = new double[array1.length][2];

        for (int i = 0; i < array3.length; i++) {
            if (calcArea(array1)[i][0] == 1) {
                array3[i][0] = calcArea(array1)[i][0];
                array3[i][1] = calcArea(array1)[i][1] * 3.20;
            } else if (calcArea(array1)[i][0] == 2) {
                array3[i][0] = calcArea(array1)[i][0];
                array3[i][1] = calcArea(array1)[i][1] * 2.10;
            } else if (calcArea(array1)[i][0] == 3) {
                array3[i][0] = calcArea(array1)[i][0];
                array3[i][1] = calcArea(array1)[i][1] * 0.90;
            }
        }
        return array3;
    }

    public static double calcClientProperty(int[][] array1, int[] kunden1) {
        double[][] kunden2 = new double[kunden1.length][2];
        int calcClientTax = 0;
        for (int i = 0; i < kunden1.length; i++) {
            kunden2[i][0] = kunden1[i];
            kunden2[i][1] = calcTax(array1)[i][1];
        }
        System.out.println("Clients with properties: " + Arrays.deepToString(kunden2));

        for (int i = 0; i < kunden2.length; i++) {
            for (int j = i + 1; j < kunden2.length; j++) {
                    if (kunden2[i][0] == kunden2[j][0]) {
                        kunden2[i][1] += kunden2[j][1];
                        calcClientTax += kunden2[i][1];
                        return calcClientTax;
                    }
                    }
                }
        return calcClientTax;}
        }




