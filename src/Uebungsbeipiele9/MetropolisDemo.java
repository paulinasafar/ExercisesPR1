package Uebungsbeipiele9;

public class MetropolisDemo {

    public static void main(String[] args) {

        Metropolis Zagreb = new Metropolis(true, 1_000_000, 500_000_000, "Zagreb");
        Metropolis Graz = new Metropolis(false, 350_000, 100_000_000, "Graz");
        Metropolis Vienna = new Metropolis(true, 2_000_000, 900_000_000, "Vienna");
        Metropolis Kapfernberg = new Metropolis(false, 1_000, 100_000, "Kapfernberg");
        Metropolis Irgendwo = new Metropolis(false, 5_000_000, 900_000_000, "Irgendwo");

        System.out.println();
        System.out.println("Zagreb: " + Zagreb.isMetropolis());
        System.out.println("Graz: " + Graz.isMetropolis());
        System.out.println("Vienna: " + Vienna.isMetropolis());
        System.out.println("Kapfernberg: " + Kapfernberg.isMetropolis());
        System.out.println("Irgendwo: " + Irgendwo.isMetropolis());

        System.out.println();
        System.out.println("ZagrebID: " + Zagreb.getCityID());
        System.out.println("ViennaID: " + Vienna.getCityID());
        System.out.println("IrgendwoID: " + Irgendwo.getCityID());

        System.out.println();
        System.out.println("Next cityID: " + Metropolis.getNextCityID());
        System.out.println("How many cities: " + Metropolis.howManyCities());

        Metropolis[] metropolise = new Metropolis[Metropolis.howManyCities()];
        metropolise[0] = Zagreb;
        metropolise[1] = Graz;
        metropolise[2] = Vienna;
        metropolise[3] = Kapfernberg;
        metropolise[4] = Irgendwo;

        for (int i = 0; i < metropolise.length; i++) {
            System.out.println(metropolise[i]);
        }
    }
}
