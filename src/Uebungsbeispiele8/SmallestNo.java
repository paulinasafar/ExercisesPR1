package Uebungsbeispiele8;

public class SmallestNo {

    public static void main(String[] args) {


        int[][] array1 = {{3, 5, -85, 6, 65, 76, -5, 0, 34}, {65, 8, 98, -759, 74, 32, 54, 19, 61}};
        System.out.println("Array length is: " + array1.length);
        System.out.println();
        System.out.println("Smallest number is: " + findSmallestNo(array1));

    }
    public static int findSmallestNo(int[][] int_array) {
        int smallest = int_array[0][0];

        for (int i = 0; i < int_array.length; i++) {
            for (int j = 0; j < int_array[i].length; j++) {
                if (smallest > int_array[i][j]) {
                    smallest = int_array[i][j];
                }
            }
        }
    return smallest;}
}

