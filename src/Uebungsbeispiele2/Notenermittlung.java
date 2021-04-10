package Uebungsbeispiele2;

import java.util.*;

public class Notenermittlung {

    public static void main(String[] args) {
        Random nxt = new Random();
        int punkte = nxt.nextInt(120);

        System.out.println("For the " + punkte + " points, the note is:  " + getNotentext(punkte) + ".");
    }

    public static String getNotentext(int punkte) {
        String note = "";
        if (punkte <= 50) {
            note = "Ungenügend";
        } else if (punkte <= 64) {
            note = "Genügend";
        } else if (punkte <= 77) {
            note = "Befriedigend";
        } else if (punkte <= 89) {
            note = "Gut";
        } else {
            note = "Sehr gut";
        }
        return note;
    }
}
