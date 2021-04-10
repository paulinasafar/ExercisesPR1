package Uebungsbeispiele3;

public class StrassenbahnApp {

    public static void main(String[] args) {
        howLong(3, 4, 20);
        howLong(1, 0, 10);
        howLong(7, 1, 25);
        howLong(6, 8, 140);
        howLong(3, 1, 18);
        howLong(5, 6, 22);

    }

    public static void howLong(int station, int problem, int duration) {

        switch (station) {
            case 1:
                System.out.println("\n You are in station " + station + ". You should arrive in 20 minutes.");
                break;
            case 2:
                System.out.println("\n You are in station " + station + ". You should arrive in 16 minutes.");
                break;
            case 3:
                System.out.println("\n You are in station " + station + ". You should arrive in 15 minutes.");
                break;
            case 4:
                System.out.println("\n You are in station " + station + ". You should arrive in 10 minutes.");
                break;
            case 5:
                System.out.println("\n You are in station " + station + ". You should arrive in 3 minutes.");
                break;
            case 6:
                System.out.println("\n Alert: You have to leave the tram!");
                break;
            default:
                System.out.println("\n Give a valid station number! There is no station " + station + "!");
                break;
        }
        if (problem >= station){
        if (problem == 0) {
            System.out.println("There are no problems on your route. You will arrive on time.");
        } else if (problem > 0 && problem < 7) {
            System.out.println("However, there is a problem with station number " + problem + ". Add " + duration + " minutes to your travel time.");
        } else {
            System.out.println("Please give a valid number for the problematic station!");
        }
    }
}}
