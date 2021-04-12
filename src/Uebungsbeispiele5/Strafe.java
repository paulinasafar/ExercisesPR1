package Uebungsbeispiele5;

public class Strafe {

    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahl;

    public void strafe(int geschwindigkeitsueberschreitung) {
        if (geschwindigkeitsueberschreitung >= 20) {
            strafe += 30;
            anzahl += 1;
        } else if (geschwindigkeitsueberschreitung <= 30) {
            strafe += 50;
            anzahl += 1;
        } else if (geschwindigkeitsueberschreitung <= 50) {
            strafe += 100;
            anzahl += 1;
        } else if (geschwindigkeitsueberschreitung <= 100) {
            strafe += 500;
            anzahl += 1;
        } else if (geschwindigkeitsueberschreitung > 100) {
            strafe += 1500;
            anzahl += 1;
        }
    }
        public void verbandspaket () {
            strafe += 25;
            anzahl += 1;
        }
        public void alkohol ( double wert){
            if (wert <= 1.0) {
                strafe += 100;
                anzahl += 2;
            } else if (wert <= 2.0) {
                strafe += 400;
                anzahl += 2;
            } else if (wert <= 3.0) {
                strafe += 1000;
                anzahl += 2;
            }
            if (wert > 3.0) {
                strafe += 5000;
                anzahl += 2;
            }
        }
            public double getStrafe() {
            if (anzahl == 1) {
                strafe = strafe * 0.7;
                System.out.println("The ticket amount is " + strafe + " EUR.");}
            else if (anzahl == 2) {
                strafe = strafe * 0.8;
                System.out.println("The ticket amount is " + strafe + " EUR.");}
            else if (anzahl == 3) {
                strafe = strafe * 0.9;
                System.out.println("The ticket amount is " + strafe + " EUR.");}
            else {strafe = strafe * 1;
                System.out.println("The ticket amount is " + strafe + " EUR.");}
            return strafe;}
}
