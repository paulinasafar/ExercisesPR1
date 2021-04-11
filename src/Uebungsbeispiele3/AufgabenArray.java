package Uebungsbeispiele3;

public class AufgabenArray {

    public static void main(String[] args) {
        int[] numbers = {20, 15, 4898, -5875, 8119, -990, 36, 155122, -9125, 1285, 147, -5, 2};

        System.out.println(numbers.length);
        System.out.println("Smallest value in the array is: " + findSmallestValue(numbers));
        System.out.println("Largest value in the array is: " + findLargestValue(numbers));
        System.out.println("Sum1 of the array is: " + findSum1(numbers));
        System.out.println("Sum2 of the array is: " + findSum2(numbers));
        System.out.println("Average of the array is: " + findAverage(numbers));

    }

    //Method 1
    public static int findSmallestValue(int[] int_array) {
        int smallest = int_array[0];
        for (int i = 0; i < int_array.length; i++) {
            if (smallest > int_array[i]) {
                smallest = int_array[i];
            }
        }
        return smallest;
    }

    //Method 2
    public static int findLargestValue(int[] int_array) {
        int largest = int_array[0];
        for (int i = 0; i < int_array.length; i++) {
            if (largest < int_array[i]) {
                largest = int_array[i];
            }
        }
        return largest;
    }

    //Method 3
    public static int findSum1(int[] int_array) {
        int sum = 0;
        for (int i = 0; i < int_array.length; i++) {
            sum = sum + int_array[i];
        }
        return sum;
    }

    //Method 3a
    public static int findSum2(int[] int_array) {
        int sum = 0;
        int i = 1;
        while (i != int_array.length) {
            sum = sum + int_array[i];
            i++;
        }
        return sum;
    }

    //Method 4
    public static int findAverage(int[] int_array) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < int_array.length; i++) {
            sum = sum + int_array[i];
        }
        average = sum / int_array.length;
        return average;
    }
}