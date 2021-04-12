package Uebungsbeispiele7;

public class Mitarbeiter {

    String vorname;
    String nachname;
    int mitarbeiternummer;
    double gehalt;
    int alter;

    public double monatsAbrechnung() {
        double gehaltNet = 0;
        double x = 0;

        if (gehalt <= 10000) {
            gehaltNet = (gehalt * 0.8) * 0.9;
        } else if (gehalt <= 20000) {
            x = (gehalt * 0.8) - 10000;
            gehaltNet = (10000 * 0.9) + (x * 0.8);
        } else if (gehalt <= 30000) {
            x = (gehalt * 0.8) - 20000;
            gehaltNet = (10000 * 0.9) + (10000 * 0.8) + (x * 0.68);
        } else if (gehalt <= 50000) {
            x = (gehalt * 0.8) - 40000;
            gehaltNet = (10000 * 0.9) + (10000 * 0.8) + (10000 * 0.68) + (x * 0.55);
        } else if (gehalt > 50000) {
            x = (gehalt * 0.8) - 50000;
            gehaltNet = (10000 * 0.9) + (10000 * 0.8) + (10000 * 0.68) + (20000 * 0.55) + (x * 0.40);
        }
        gehaltNet = Math.round(gehaltNet * 100);
        gehaltNet = gehaltNet / 100;
        return gehaltNet;}

    public double jahresAbrechnung() {
        double gehaltGross = 0;
        gehaltGross = gehalt * 12;

    return gehaltGross;}
}
