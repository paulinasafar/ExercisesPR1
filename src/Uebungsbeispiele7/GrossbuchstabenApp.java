package Uebungsbeispiele7;

import java.util.Arrays;

public class GrossbuchstabenApp {

    public static void main(String[] args) {

        String buchstaben = "Wörter starten mit großbuchstaben";

        toUpperCase(buchstaben);

    }

    public static void toUpperCase(String buchstaben) {
        String newbuchstaben = "";
        for (int i = 0; i < buchstaben.length(); i++) {
            if (buchstaben.charAt(i) == ' ') {
                newbuchstaben = newbuchstaben + buchstaben.charAt(i) + Character.toUpperCase(buchstaben.charAt(i + 1));
            i++;
            } else {
                newbuchstaben += buchstaben.charAt(i);
            }
        }
        System.out.println(newbuchstaben);}
}
