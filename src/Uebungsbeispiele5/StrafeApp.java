package Uebungsbeispiele5;

public class StrafeApp {

    public static void main(String[] args) {

        Strafe strafe1 = new Strafe();
        strafe1.vorname = "John";
        strafe1.nachname = "Black";
        strafe1.kennzeichen = "G-987-UE";
        strafe1.strafnummer = 12345;

        strafe1.strafe(30);
        strafe1.alkohol(1.5);
        strafe1.getStrafe();



    }
}
