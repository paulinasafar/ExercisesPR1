package Uebungsbeispiele8;

import java.util.Arrays;

public class SmartphoneDemo {
    public static void main(String[] args) {

        int[][] smartphone = {{1, 50}, {2, 40}, {1, 60}, {4, 50}, {3, 30}, {2, 70}, {1, 40}, {5, 40}, {6, 60}, {4, 50}};

        System.out.println("Mobile phones type counter: " + counter(smartphone));
        System.out.println("Smartphones Array: " + Arrays.deepToString(smartphone));
        System.out.println("Agreggated sales Array: " + Arrays.deepToString(agreggateArray(smartphone)));
    }

    public static int counter(int[][] smartphone) {
        int phoneModels = 0;
        int[] phoneModels1 = new int[10];
        for (int i = 0; i < smartphone.length; i++) {
            phoneModels1[i] = smartphone[i][0];
        }
        for (int i = 0; i < phoneModels1.length; i++) {
            for (int j = i + 1; j < phoneModels1.length; j++) {
                if (phoneModels1[i] == phoneModels1[j]) {
                    phoneModels1[j] = 0;
                }
            }
        }
        for (int j = 0; j < phoneModels1.length; j++) {
            if (phoneModels1[j] != 0) {
                phoneModels++;
            }
        }
        return phoneModels;
    }

    public static int[][] destroyArray(int[][] smartphone) {

        for (int i = 0; i < smartphone.length; i++) {
            for (int j = i + 1; j < smartphone.length; j++) {
                if (smartphone[i][0] == smartphone[j][0]) {
                    smartphone[i][1] += smartphone[j][1];
                    smartphone[j][0] = -1;
                }
            }
        }
        return smartphone;
    }

    public static int[][] agreggateArray(int[][] smartphone) {
        int[][] agreggateArray = new int[counter(smartphone)][2];
        int x = 0;

        for (int i = 0; i < destroyArray(smartphone).length; i++) {
            if (destroyArray(smartphone)[i][0] != -1) {
                agreggateArray[x][0] = destroyArray(smartphone)[i][0];
                agreggateArray[x][1] = destroyArray(smartphone)[i][1];
                x++;
            }
        }
        return agreggateArray;
    }
}
