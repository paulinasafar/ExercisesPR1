package Uebungsbeispiele4;

import java.util.Arrays;

public class Schleifen {

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] numbers1 = new int[100];
        int[] numbers2 = new int[100];

        //Ubung 1
        for (int j = 0; j < 100 ; j++) {
                numbers1[j] = j+1;
            }
            System.out.println(Arrays.toString(numbers1));

        //Ubung 2
        int i = 0;
        while (i < 100) {
            numbers2[i] = i+1;
            i++;
            }
        System.out.println(Arrays.toString(numbers2));

        //Ubung 3
        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of all numbers between 1 - 100 is: " + sum);

        //Ubung 4
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                System.out.print(j + ", ") ;
            }
        }
        System.out.println("\n Numbers Tirangle:");
        //Ubung 5
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        }
}


