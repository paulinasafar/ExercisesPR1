package Uebungsbeispiele4;

public class CurrencyExchage {

    public static void main(String[] args) {
        System.out.println(exchangeCurrency1("HUF", 35.56));
        System.out.println(exchangeCurrency1("USD", 125.567));
        System.out.println(exchangeCurrency1("SEK", -125.567));
        System.out.println(exchangeCurrency1("TRA", 125.567));
        System.out.println(exchangeCurrency1("CAD", 0));
        System.out.println();

        System.out.println(exchangeCurrency2("HUF", 35.56));
        System.out.println(exchangeCurrency2("USD", 125.567));
        System.out.println(exchangeCurrency2("SEK", -125.567));
        System.out.println(exchangeCurrency2("TRA", 125.567));
        System.out.println(exchangeCurrency2("CAD", 0));
    }

    public static double exchangeCurrency1(String currencyID, double value) {

        if (value < 0) {
            value = value * (-1); }
        else if (value == 0) {
            System.out.println("Please enter valid value!");
        }

        if (currencyID.equals("HUF")) {
            value = value * 328.61;
        } else if (currencyID.equals("SEK")) {
            value = value * 10.76;
        } else if (currencyID.equals("USD")) {
            value = value * 1.12;
        } else if (currencyID.equals("CAD")) {
            value = value * 1.47;
        }
        else {
            System.out.println("Please enter HUF/SEK/USD/CAD currency!");
        }
        value = Math.round(value * 100);
        value = value /100;
        return value;   }

    public static double exchangeCurrency2(String currencyID, double value) {
        if (value < 0) {
            value = value * (-1); }
        else if (value == 0) {
            System.out.println("Please enter valid value!");
        }

        switch (currencyID) {
            case "HUF":
                value = value * 328.61;
                break;
            case "SEK":
                value = value * 10.76;
                break;
            case "USD":
                value = value * 1.12;
                break;
            case "CAD":
                value = value * 1.47;
                break;
            default:
                System.out.println("Please enter HUF/SEK/USD/CAD currency!");
                break;
        }

        value = Math.round(value * 100);
        value = value /100;
        return value;}
}
