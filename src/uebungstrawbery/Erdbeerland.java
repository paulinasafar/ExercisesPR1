package uebungstrawbery;

import java.util.Arrays;

public class Erdbeerland {
    final int GRÜN = 1;
    final int REIF = 2;
    final int VERDORBEN = 3;
    final static int BECHER_GRÖSZE = 10;
    final static int BECHER_VORHANDEN = 100;

    public static void main(String[] args) {
        final double[] GEWICHTE = Erdbeeren.WEIGHTS;
        final int[] KLASSIFIZIERUNG = Erdbeeren.CLASSIFICATION;

        System.out.println("Is it spoiled: " + istVerdorben(KLASSIFIZIERUNG, 3));
        System.out.println("Is it too green: " + istGrÜn(KLASSIFIZIERUNG, 3));
        System.out.println("Number of ripe berries: " + anzahlReifeBeeren(KLASSIFIZIERUNG));
        System.out.println("The number of ripe berries in a row is: " + nimmReifeBeeren(KLASSIFIZIERUNG, 2));
        System.out.println("The number of ripe berries in a row is: " + nimmReifeBeeren(KLASSIFIZIERUNG, 1));
        System.out.println("The average is: " + mittleresGewicht(GEWICHTE));
        System.out.println("The average of ripe berries is: " + mittleresGewichtReif(GEWICHTE, KLASSIFIZIERUNG));
        System.out.println("The indexes of ripe berries in the cup are: " + Arrays.toString(fülleBecher(KLASSIFIZIERUNG, 1)));
        System.out.println("The indexes of ripe berries in the cup are: " + Arrays.toString(fülleBecher(KLASSIFIZIERUNG, 2)));
        int[] becherFüllung = {1, 6, 9, 16, 17, 19, 20, 21, 23, 25};
        //System.out.println("The weight of the cup is: " + becherNettoGewicht(GEWICHTE, becherFüllung));

    }

    public static boolean istVerdorben(int[] CLASSIFICATION, int index) {

            if (CLASSIFICATION[index] == 3) {
                return true;
            }
        return false;} // Platzhalter}

        public static boolean istGrÜn(int[] CLASSIFICATION, int index){
                if (CLASSIFICATION[index] == 1) {
                    return true;
                }
            return false;} // Platzhalter}}

    public static int anzahlReifeBeeren(int[] CLASSIFICATION) {
        int counter = 0;
        for (int i = 0; i < CLASSIFICATION.length; i++) {
            if(CLASSIFICATION[i] == 2) {
                counter++;
            }
        }
        return counter; // Platzhalter
    }

    public static int nimmReifeBeeren(int[] CLASSIFICATION, int index) {
        int counter = 0;
        for (int i = index; i < CLASSIFICATION.length; i++) {
            if(CLASSIFICATION[i] == 2) {
                counter++;
            } else {
                break;
        } }
        return counter; // Platzhalter
    }

    public static double mittleresGewicht(double[] WEIGHTS) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < WEIGHTS.length; i++) {
                sum = sum + WEIGHTS[i];
        }
        average = sum / WEIGHTS.length;
        average = Math.round(average * 100);
        average = average / 100;
        return average; // Platzhalter
    }

    public static double mittleresGewichtReif(double[] WEIGHTS, int[] CLASSIFICATION) {
        int counter = 0;
        double average = 0;
        double sum = 0;
        for (int i = 0; i < WEIGHTS.length; i++) {
            if(CLASSIFICATION[i] == 2) {
                sum = sum + WEIGHTS[i];
                counter++;
            }
        }
        average = sum / counter;
        average = Math.round(average * 100);
        average = average / 100;
        return average; // Platzhalter
   }

    public static int[] fülleBecher(int[] CLASSIFICATION, int index) {
            int[] becherFüllung = new int[10];
            int x = 0;
        for (int i = index; i < CLASSIFICATION.length; i++) {
            if((CLASSIFICATION[i] == 2) && (x < BECHER_GRÖSZE)) {
                becherFüllung[x] = i;
                x++;
            }
        }
        return becherFüllung; // Platzhalter
    }

//    public static double becherNettoGewicht(double[] WEIGHTS, int[] becherFüllung) {
//            double netWeight = 0;
//        for (int i = 0; i < becherFüllung.length ; i++) {
//            if(becherFüllung[i] == WEIGHTS[becherFüllung[i]]) {
//                netWeight = netWeight + WEIGHTS[becherFüllung[i]];
//            }
//        }
//        return netWeight;
//    }
}
