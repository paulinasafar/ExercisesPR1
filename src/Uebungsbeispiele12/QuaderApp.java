package Uebungsbeispiele12;

public class QuaderApp {

    public static void main(String[] args) {

        Quader quad1 = new Quader(2,4.5,6.5);
        Quader quad2 = new Quader(6.5,7.2,5.11);
        Quader quad3 = new Quader(12,4.5,8.12);
        Quader quad4 = new Quader(10,11.5,6.88);
        Quader quad5 = new Quader(8,8.45,12.05);

        quad1.scaleUp(10);
        quad5.scaleDown(2);

        System.out.println();
        System.out.println(quad1.getEntryID());
        System.out.println(quad5.getEntryID());
        System.out.println();
        System.out.println(Quader.getNextEntryID());
        System.out.println(Quader.getTotalQuader());
        System.out.println();
        System.out.println("Volume: " + quad1.getVolume());
        System.out.println("Surface: " + quad1.getSurface());

    }
}
