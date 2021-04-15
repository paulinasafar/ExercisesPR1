package Uebungsbeipiele9;

public class TickVaccineDemo {

    public static void main(String[] args) {

        System.out.println("Your next vaccine should be in year " + nextVaccine(65, 2018, false));
        System.out.println("Your next vaccine should be in year " + nextVaccine(15, 2019, true));
        System.out.println("Your next vaccine should be in year " + nextVaccine(45, 2020, true));
        System.out.println("Your next vaccine should be in year " + nextVaccine(45, 2016, false));
        System.out.println("Your next vaccine should be in year " + nextVaccine(70, 2020, true));
    }
    public static int nextVaccine(int age, int lastVaccine, boolean firstRepeat) {
        int nextVaccine = 0;

        if (lastVaccine < 1940) {
            System.out.println("Please enter valid date for the last vaccine.");
        } else if (lastVaccine < 2015) {
            nextVaccine = 2021;
        } else if (age > 60 || firstRepeat) {
            nextVaccine = lastVaccine + 3;
        } else{
                nextVaccine = lastVaccine + 5;
            }
    return nextVaccine;}
}
