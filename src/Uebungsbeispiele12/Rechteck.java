package Uebungsbeispiele12;

public class Rechteck {
    private double howLong;
    private double howBreit;
    private int entryID;
    private static int uniqueID = 1;

    public Rechteck(double howLong, double howBreit) {
        this.howLong = howLong;
        this.howBreit = howBreit;
        this.entryID = uniqueID;
        uniqueID += 1;
    }

    public int getEntryID() {
        return entryID;
    }

    public static int nextEntryID() {
        return uniqueID;
    }

    public static int totalObjects() {
        return uniqueID - 1;
    }

    public double calcArea() {
        double area = howLong * howBreit;
        area = Math.round(area * 100);
        area = area / 100;
        return area;
    }

    public void scaling(double factor) {
        double scale1 = howLong * factor;
        scale1 = Math.round(scale1 * 100);
        scale1 = scale1 / 100;
        System.out.println("Length is increased by " + factor + ", and is now " + scale1);
        double scale2 = howBreit * factor;
        scale2 = Math.round(scale2 * 100);
        scale2 = scale2 / 100;
        System.out.println("Bright is increased by " + factor + ", and is now " + scale2);
    }

    @Override
    public String toString() {
        return  "Rechteck is long " + howLong + " and breit " + howBreit + ".";
    }
}
