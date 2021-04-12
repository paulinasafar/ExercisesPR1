package Uebungsbeispiele7;

public class MitarbeiterApp {

    public static void main(String[] args) {

        Mitarbeiter Arbeiter1 = new Mitarbeiter();
        Arbeiter1.vorname = "John";
        Arbeiter1.nachname = "Black";
        Arbeiter1.gehalt = 10435.98;
        Arbeiter1.alter = 43;
        Arbeiter1.mitarbeiternummer = 12345;

        System.out.println(Arbeiter1.monatsAbrechnung());
        System.out.println();
        System.out.println(Arbeiter1.jahresAbrechnung());

        Mitarbeiter Arbeiter2 = new Mitarbeiter();
        Arbeiter2.gehalt = 45657.43;
        System.out.println();
        System.out.println(Arbeiter2.monatsAbrechnung());
        System.out.println();
        System.out.println(Arbeiter2.jahresAbrechnung());

        Mitarbeiter Arbeiter3 = new Mitarbeiter();
        Arbeiter3.gehalt = 4557.43;
        System.out.println();
        System.out.println(Arbeiter3.monatsAbrechnung());
        System.out.println();
        System.out.println(Arbeiter3.jahresAbrechnung());

    }
}
