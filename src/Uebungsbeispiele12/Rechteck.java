package Uebungsbeispiele12;

public class Rechteck {
    private double howLong;
    private double howBreit;

    public Rechteck(double howLong, double howBreit) {
        this.howLong = howLong;
        this.howBreit = howBreit;
    }
    public double calcArea() {
        double area = howLong * howBreit;
        return area;
    }

    public void scaling(double factor) {
        double scale1 = howLong * factor;
        System.out.println("Length is increased by " + factor + ", and is now " + scale1);
        double scale2 = howBreit * factor;
        System.out.println(" is increased by " + factor + ", and is now " + scale1);
    }
}
