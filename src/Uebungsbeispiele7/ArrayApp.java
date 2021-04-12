package Uebungsbeispiele7;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String[] args) {

        int[] numbers = {20, 15, 48, 5, 122, 90, 36, 122, -95, 85, 47, 5, 2, 56,
                67, 78, 89, 133, 455, 644, 422, 766, 1212, 1002, 85, 48, 45987, 3213};

        System.out.println("Array length is: " + numbers.length);
        System.out.println("Array with duplicate numbers is: " + Arrays.toString(duplicatedNumbers(numbers)));
        System.out.println();
        for (int i = 0; i < duplicatedNumbers(numbers).length; i++) {
            System.out.print(duplicatedNumbers(numbers)[i] + ", ");
        }

        System.out.println();
        System.out.println("Average is: " + average(numbers));
        System.out.println();
        replace(numbers, 85, -1);
        System.out.println();
        System.out.println(Arrays.toString(extendsArray(numbers, 0)));
    }


    public static int counter(int[] numbers) {
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    counter++;
                }
            }
        }
        return counter;}

        //Methode A
        public static int[] duplicatedNumbers(int[] numbers){
            int[] numbers1 = new int[counter(numbers)];
            int x = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        numbers1[x] = numbers[i];
                    x++;}
                }
            }
        return numbers1;}

        //Methode B
        public static double average(int[] int_array) {
            int sum = 0;
            double average = 0;
            for (int i = 0; i < int_array.length; i++) {
                sum += int_array[i];
            }
            average = sum / int_array.length;
            average = Math.round(average * 100);
            average = average / 100;
            return average;}

        //Methode C
        public static void replace(int[] numbers, int searchNumber, int newNumber) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == searchNumber) {
                    numbers[i] = newNumber;
                }
            }
            System.out.println(Arrays.toString(numbers));}
        //Methode D
        public static int[] extendsArray(int[] numbers, int number) {

        int[] numbers2 = new int[numbers.length + 1];
        int x = 0;
            for (int i = 0; i < numbers.length; i++) {
              numbers2[x] = numbers[i];
              x++;
            }
        numbers2[numbers.length] = number;
        return numbers2;}
    }
