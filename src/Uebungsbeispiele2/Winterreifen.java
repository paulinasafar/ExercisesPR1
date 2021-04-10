package Uebungsbeispiele2;

import java.util.*;

public class Winterreifen {

    public static void main(String[] args) {

        Random ran = new Random();
        int temperatur = ran.nextInt(40);

        System.out.println("Are winter tyres necessary for temperature " + temperatur + "C? Answer: "
                + isWinterreifenPflicht(temperatur, true));

        System.out.println("Are winter tyres necessary for temperature 3C? Answer:  " + isWinterreifenPflicht(3, false));
        System.out.println("Are winter tyres necessary for temperature -20C? Answer:  " + isWinterreifenPflicht(-20, false));
        System.out.println("Are winter tyres necessary for temperature 8C? Answer:  " + isWinterreifenPflicht(8, true));
        System.out.println("Are winter tyres necessary for temperature 0C? Answer:  " + isWinterreifenPflicht(0, true));
        System.out.println("Are winter tyres necessary for temperature 1000C? Answer:  " + isWinterreifenPflicht(1000, true));

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        boolean isWinterTyres = true;
        if (temperatur > -50 && temperatur < 50) {
            if (temperatur < 4) {
                isWinterTyres = true;
            } else if (temperatur < 10 && rutschigeFahrbahn) {
                isWinterTyres = true;
            } else {
                isWinterTyres = false;
            }}
            else { isWinterTyres = false;
                System.out.println("Please insert appropriate values for temperature!");
        }
        return isWinterTyres;
    }
}

