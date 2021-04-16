package Uebungsbeispiele12;

public class RechteckDemo {
    public static void main(String[] args) {

        Rechteck eck1 = new Rechteck(24.45, 23.12);
        Rechteck eck2 = new Rechteck(34.15, 13.18);
        Rechteck eck3 = new Rechteck(8.08, 62.43);
        Rechteck eck4 = new Rechteck(35.85, 48.62);

        System.out.println(eck1.calcArea());
        System.out.println(eck4.calcArea());
        System.out.println(eck3.calcArea());
        System.out.println(eck2.calcArea());
        System.out.println();

        eck1.scaling(2.0);
        eck4.scaling(8.87);
        eck2.scaling(1.50);
        eck3.scaling(10.0);
        System.out.println();

        System.out.println(eck1.getEntryID());
        System.out.println(eck4.getEntryID());
        System.out.println(eck2.getEntryID());
        System.out.println(eck3.getEntryID());
        System.out.println();
        System.out.println(Rechteck.nextEntryID());
        System.out.println(Rechteck.totalObjects());

        Rechteck[] ecke = new Rechteck[Rechteck.totalObjects()];
        ecke[0] = eck1;
        ecke[1] = eck2;
        ecke[2] = eck3;
        ecke[3] = eck4;

        for (int i = 0; i < ecke.length; i++) {
            System.out.println(ecke[i]);
        }

    }
}
