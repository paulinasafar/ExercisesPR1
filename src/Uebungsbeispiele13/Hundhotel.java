package Uebungsbeispiele13;

import Uebungsbeispiele12.Rechteck;

import java.util.Arrays;

public class Hundhotel {

    public static void main(String[] args) {

        String[] ingredients = {"milk", "chicken", "schnitzl", "salt", "pepper", "wallnuts", "potatoes", "soup", "creme"};
        Hund dog1 = new Hund("Fido");
        Hund dog2 = new Hund("Fifi");
        Hund dog3 = new Hund("Boris");
        Hund dog4 = new Hund("Donald");
        Hund dog5 = new Hund("Kiki");

        Hund[] dogs = new Hund[5];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        dogs[3] = dog4;
        dogs[4] = dog5;

        dog1.allergien = "wallnuts";
        dog2.allergien = "chocolade";
        dog3.allergien = "creme";
        dog4.allergien = "milk";
        dog5.allergien = "garlick";

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
        System.out.println();
        System.out.println("Dog 1: " + dog1.getName());
        System.out.println("Dog 5: " + dog5.getName());
        System.out.println();

        System.out.println(Arrays.toString(Hund.dogsWithAllergies(dogs, ingredients)));

        }

      //  System.out.println(Arrays.deepToString(Hund.dogsWithAllergies(dogs, ingredients)));

    }

