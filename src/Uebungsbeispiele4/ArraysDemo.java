package Uebungsbeispiele4;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] numbers = {20, 15, 48, 5, 89, 90, 36, 122, -95, 85, 47, -5, 2};
        System.out.println("PrintArray Method");
        printArray(numbers);
        System.out.println("\nContainsNumber Method 5: " + containsNumber(numbers, 5));
        System.out.println("\nContainsNumber Method 7: " + containsNumber(numbers, 7));
        System.out.println("\nCalculateSum Method: " + calculateSum(numbers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverse(numbers)));

    }

    //Methode A
    public static void printArray(int[] int_array) {
        for (int i = 0; i < int_array.length; i++) {
            System.out.print(int_array[i] + ", ");
        }

    }

    //Methode B
    public static boolean containsNumber(int[] int_array, int n) {

        boolean isThereNo = false;

        for (int i = 0; i < int_array.length; i++) {
            if (int_array[i] == n) {
                isThereNo = true;
            }
        }
    return isThereNo;}

    //Methode C
    public static int calculateSum(int[] int_array) {
        int sum = 0;
        for (int i = 0; i < int_array.length; i++) {
            sum = sum + int_array[i];
        }
    return sum;}

    //Methode D
    public static int[] reverse(int[] int_array) {
        int[] numbers1 = new int[int_array.length];
        int x = int_array.length-1;

        for (int i = 0; i < int_array.length; i++) {
            numbers1[x] = int_array[i];
            x--;
        }
    return numbers1;}

}
