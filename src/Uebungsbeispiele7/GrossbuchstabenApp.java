package Uebungsbeispiele7;

import java.util.Arrays;

public class GrossbuchstabenApp {

    public static void main(String[] args) {

      String buchstaben = "Wörter starten mit großbuchstaben";

        System.out.println(toUpperCase(buchstaben));

        }
//        public static void stringToArray(String buchstaben) {
//           char[] array = new char[buchstaben.length()];
//
//            for (int i = 0; i < array.length; i++) {
//                array[i] = buchstaben.charAt(i);
//            }
//        }

   public static String toUpperCase(String buchstaben) {
      String newbuchstaben = "";
      char character = ' ';
        for (int i = 0; i < buchstaben.length(); i++) {
            if (buchstaben.charAt(i) == character)
                character = Character.toUpperCase(buchstaben.charAt(i + 1));
                buchstaben.replace(buchstaben.charAt(i + 1), character);
        }
        return buchstaben;}
}
