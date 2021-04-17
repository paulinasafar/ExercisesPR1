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
                {3, 75, 15},  {1, 30, 40}, {2, 40, 55}, {2, 75, 15}, {3, 80, 40}, {1, 10, 50}, {1, 60, 30},
                {1, 30, 40}, {2, 40, 55}, {1, 75, 15}, {3, 80, 40}, {1, 10, 50}, {2, 60, 30}};

        int[] kunden1 = {0, 4, 6, 8, 11, 4, 0, 11, 15, 7, 17, 24, 19, 22, 7, 17, 22, 8, 16, 15, 0, 12, 15, 17};

        System.out.println(array1.length);
        System.out.println(kunden1.length);
        System.out.println();
        System.out.println("Property tax is: " + Arrays.deepToString(calcPropertyTax(array1, kunden1)));


    }
       public static double[][] calcPropertyTax(int[][] array1, int[] kunden1) {
           double[][] propertyTax = new double[array1.length][2];

           for (int i = 0; i < array1.length; i++) {
               switch (array1[i][0]) {
                   case 1:
                       propertyTax[i][0] = array1[i][0];
                       propertyTax[i][1] = (array1[i][1] * array1[i][2]) * 3.2;
                       break;
                   case 2:
                       propertyTax[i][0] = array1[i][0];
                       propertyTax[i][1] = (array1[i][1] * array1[i][2]) * 2.1;
                       break;
                   case 3:
                       propertyTax[i][0] = array1[i][0];
                       propertyTax[i][1] = (array1[i][1] * array1[i][2]) * 0.9;
                       break;
               }
           }
           double[][] kunden2 = new double[propertyTax.length][2];
           for (int i = 0; i < propertyTax.length; i++) {
               kunden2[i][0] = kunden1[i];
               kunden2[i][1] = propertyTax[i][1];
           }

           for (int i = 0; i < kunden2.length; i++) {
               for (int j = i + 1; j < kunden2.length; j++) {
                   if (kunden2[i][1] >= 0) {
                       if (kunden2[i][0] == kunden2[j][0]) {
                           kunden2[i][1] += kunden2[j][1];
                           kunden2[j][1] = -1;
                       }
                   }
               }
           }

           for (int i = 0; i < kunden2.length; i++) {
               if (kunden2[i][1] == -1) {
                   kunden2[i][0] = -1;
               }

           }
           return kunden2;}


//    public static int[][] calcArea(int[][] array1) {
//        int[][] array2 = new int[array1.length][2];
//
//        for (int i = 0; i < array1.length; i++) {
//            array2[i][0] = array1[i][0];
//            array2[i][1] = array1[i][1] * array1[i][1];
//        }
//
//        return array2;
//    }
//
//    public static double[][] calcTax(int[][] array1) {
//        double[][] array3 = new double[array1.length][2];
//
//        for (int i = 0; i < array3.length; i++) {
//            if (calcArea(array1)[i][0] == 1) {
//                array3[i][0] = calcArea(array1)[i][0];
//                array3[i][1] = calcArea(array1)[i][1] * 3.20;
//            } else if (calcArea(array1)[i][0] == 2) {
//                array3[i][0] = calcArea(array1)[i][0];
//                array3[i][1] = calcArea(array1)[i][1] * 2.10;
//            } else if (calcArea(array1)[i][0] == 3) {
//                array3[i][0] = calcArea(array1)[i][0];
//                array3[i][1] = calcArea(array1)[i][1] * 0.90;
//            }
//        }
//        return array3;
//    }
//
//    public static double calcClientProperty(int[][] array1, int[] kunden1) {
//        double[][] kunden2 = new double[kunden1.length][2];
//        int calcClientTax = 0;
//        for (int i = 0; i < kunden1.length; i++) {
//            kunden2[i][0] = kunden1[i];
//            kunden2[i][1] = calcTax(array1)[i][1];
//        }
//        System.out.println("Clients with properties: " + Arrays.deepToString(kunden2));
//
//        for (int i = 0; i < kunden2.length; i++) {
//            for (int j = i + 1; j < kunden2.length; j++) {
//                    if (kunden2[i][0] == kunden2[j][0]) {
//                        kunden2[i][1] += kunden2[j][1];
//                        calcClientTax += kunden2[i][1];
//                        return calcClientTax;
//                    }
//                    }
//                }
//        return calcClientTax;}
        }




