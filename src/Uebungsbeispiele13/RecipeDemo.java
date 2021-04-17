package Uebungsbeispiele13;

import java.util.Arrays;

public class RecipeDemo {
    public static void main(String[] args) {

        String alergen = "Fetacheese";
        String alergen1 = "Wallnuts";
        Recipe spBolognese = new Recipe();
        spBolognese.noPersons = 4;
        spBolognese.ingridientName = new String[]{"Spaghetti", "Salt", "Tomato", "Garlick", "Cooking oil", "Fetacheese"};
        spBolognese.ingridientQuantity = new double[][]{{500, 2.50}, {5, 0.5}, {200, 1.5}, {2, 2.0}, {0.1, 0.1}, {100, 2.70}};

        System.out.println(Arrays.toString(spBolognese.ingridientName));
        System.out.println(Arrays.deepToString(spBolognese.ingridientQuantity));
        System.out.println();

        System.out.println("Contains allergens: " + spBolognese.allergic(alergen));
        System.out.println("Contains allergens: " + spBolognese.allergic(alergen1));
        System.out.println();
        System.out.println("Is lactose free: " + spBolognese.lactoseFree());
        System.out.println();
        System.out.println("How much does it cost total: " + spBolognese.costs() + "EUR.");
        System.out.println("How much does it cost per person: " + spBolognese.costsPerPerson() + "EUR.");
        System.out.println();
        spBolognese.differentNoPersons(6);


    }
}
