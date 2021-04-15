package Uebungsbeipiele9;

public class Metropolis {

    private boolean isCapital;
    private int inhabitants;
    private double taxPersonAndMonth;
    private int cityID;
    private static int uniqueID= 1;
    private String name;

    public Metropolis(boolean isCapital, int inhabitants, double taxPersonAndMonth, String name) {
        this.isCapital = isCapital;
        this.inhabitants = inhabitants;
        this.taxPersonAndMonth = taxPersonAndMonth;
        this.cityID = uniqueID;
        uniqueID += 1;
        this.name = name;
    }

    public boolean isMetropolis() {
        boolean isMetropolis1 = false;

        if (isCapital && inhabitants > 100_000) {
            isMetropolis1 = true;
        } else if(inhabitants > 200000 && taxPersonAndMonth >=720_000_000) {
            isMetropolis1 = true;
        }
    return isMetropolis1;}

    public int getCityID() {
        return cityID;
    }
    public static int getNextCityID(){
        return uniqueID;
    }
    public static int howManyCities(){
        return uniqueID - 1;
    }
    @Override
    public String toString() {
        return "City of " + name + " has " + inhabitants + " inhabitants. Is it Metropolis: " + isMetropolis();
    }

}
