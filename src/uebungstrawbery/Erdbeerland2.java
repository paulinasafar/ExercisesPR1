package uebungstrawbery;

import java.util.Arrays;

public class Erdbeerland2 {
    final int GRÜN = 1;
    final int REIF = 2;
    final int VERDORBEN = 3;
    final static int BECHER_GRÖSZE = 10;
    final static int BECHER_VORHANDEN = 100;

    public static void main(String[] args) {
        final double[] GEWICHTE = Erdbeeren.WEIGHTS;
        final int[] KLASSIFIZIERUNG = Erdbeeren.CLASSIFICATION;

        int[] becherFüllung = {151, 152, 154, 157, 158, 160, 161, 162, 164, 167};

        System.out.println();
        System.out.println("Is the berry spoiled: " + istVerdorben(KLASSIFIZIERUNG, 0));
        System.out.println("Is the berry spoiled: " + istVerdorben(KLASSIFIZIERUNG, 1002));
        System.out.println("Is the berry spoiled: " + istVerdorben(KLASSIFIZIERUNG, 54));
        System.out.println("Is the berry green: " + istGrün(KLASSIFIZIERUNG, 5));
        System.out.println("Is the berry green: " + istGrün(KLASSIFIZIERUNG, 1002));
        System.out.println();
        System.out.println("No of ripe berries: " + anzahlReifeBeeren(KLASSIFIZIERUNG));
        System.out.println();
        System.out.println("No of ripe berries in a row: " + nimmReifeBeeren(KLASSIFIZIERUNG, 0));
        System.out.println("No of ripe berries in a row: " + nimmReifeBeeren(KLASSIFIZIERUNG, 19));
        System.out.println("No of ripe berries in a row: " + nimmReifeBeeren(KLASSIFIZIERUNG, 1));
        System.out.println("No of ripe berries in a row: " + nimmReifeBeeren(KLASSIFIZIERUNG, 1));
        System.out.println();
        System.out.println("Average weight: " + mittleresGewicht(GEWICHTE));
        System.out.println();
        System.out.println("Average ripe berries weight: " + mittleresGewichtReif(GEWICHTE, KLASSIFIZIERUNG));
        System.out.println();
        System.out.println("Following berries are in the cup: " + Arrays.toString(fülleBecher(KLASSIFIZIERUNG, 0)));
        System.out.println("Following berries are in the cup: " + Arrays.toString(fülleBecher(KLASSIFIZIERUNG, 150)));
        System.out.println();
        System.out.println("Weight of berries in the cup: " + becherNettoGewicht (GEWICHTE, becherFüllung));
    }

    public static boolean istVerdorben(int[] beerenKlassifiziert, int index) {
        boolean isItSpoiled = false;

        if(index > 0 && index > beerenKlassifiziert.length) {
            System.out.println("Please enter correct berry number");
        }
        if((index <= beerenKlassifiziert.length) && (beerenKlassifiziert[index] == 3)) {
        return isItSpoiled = true;}

        return isItSpoiled; }

    public static boolean istGrün(int[] beerenKlassifiziert, int index) {
        boolean isItGreen = false;

        if(index > 0 && index > beerenKlassifiziert.length) {
            System.out.println("Please enter correct berry number");
        }
        if((index <= beerenKlassifiziert.length) && (beerenKlassifiziert[index] == 1))
            return isItGreen = true;
        return isItGreen;
    }

    public static int anzahlReifeBeeren(int[] beerenKlassifiziert) {
        int noRipeBerries = 0;
        for (int i = 0; i < beerenKlassifiziert.length; i++) {
            if(beerenKlassifiziert[i] == 2)
                noRipeBerries++;
        }
        return noRipeBerries;
    }

    public static int nimmReifeBeeren(int[] beerenKlassifiziert, int index) {
        int ripeBerriesInRow = 0;

        while (beerenKlassifiziert[index++] == 2) {
            ripeBerriesInRow++;
        }
        return ripeBerriesInRow;
    }

    public static double mittleresGewicht(double[] gewichte) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < gewichte.length; i++) {
            sum += gewichte[i];
        }
        average = sum / gewichte.length;
        return average;
    }

    public static double mittleresGewichtReif(double[] gewichte, int[] beerenKlassifiziert) {
        double sum = 0;
        double average = 0;
        int counter = 0;
        for (int i = 0; i < gewichte.length; i++) {
            if (beerenKlassifiziert[i] == 2) {
                sum += gewichte[i];
                counter++;
            }
        }
        average = sum / counter;
        return average;
    }

        public static int[] fülleBecher(int[] beerenKlassifiziert, int index){
            int[] becherFüllung = new int[BECHER_GRÖSZE];
            int x = 0;
            int counter = 0;
            for (int i = index; i < beerenKlassifiziert.length; i++) {
                if (beerenKlassifiziert[i] == 2 && counter < BECHER_GRÖSZE) {
                    becherFüllung[x++] = i;
                    counter++;
                }
            }
            return becherFüllung;
        }

    public static double becherNettoGewicht(double[] gewichte, int[] becherFüllung) {
        double weight = 0;
        for (int i = 0; i < becherFüllung.length; i++) {
            weight = weight + gewichte[becherFüllung[i]];
        }
        return weight;
    }
}