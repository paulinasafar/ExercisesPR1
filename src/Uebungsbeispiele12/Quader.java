package Uebungsbeispiele12;

public class Quader {
    private double howLong;
    private double howWide;
    private double howHigh;
    private int entryID;
    private static int uniqueID = 1;

    public Quader(double howLong, double howWide, double howHigh) {
        this.howLong = howLong;
        this.howWide = howWide;
        this.howHigh = howHigh;
        this.entryID = uniqueID;
        uniqueID += 1;
    }

        public int getEntryID() {
            return entryID;
        }

        public static int getNextEntryID() {
            return uniqueID;
        }

        public static int getTotalQuader() {
            return uniqueID - 1;
        }

        public double getBaseArea(double howLong, double howWide) {
                double basearea = howLong * howWide;
                basearea = Math.round(basearea * 100);
                basearea = basearea / 100;
                return basearea;
    }

        public void scaleUp(double scaling_factor) {
            howLong *= scaling_factor;
            howWide *= scaling_factor;
            howHigh *= scaling_factor;
    }

        public void scaleDown(double scaling_factor) {
            howLong /= scaling_factor;
            howWide /= scaling_factor;
            howHigh /= scaling_factor;
    }

        public double getVolume() {
         double volume = howLong * howWide * howHigh;
         return volume;
        }

        public double getSurface() {
            double surface = 2 * ((howLong*howWide) + (howWide*howHigh) + (howLong*howHigh));
            return surface;
        }
}
