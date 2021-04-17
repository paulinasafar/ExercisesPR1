package Uebungsbeispiele13;

import java.util.Arrays;

public class Recipe {
    int noPersons;
    String[] ingridientName;
    double[][] ingridientQuantity;


//    public Recipe() {
//        this.noPersons = noPersons;
//        this.ingridientName = ingridientName;
//        this.ingredientQuantity = ingredientQuantity;
//    }

    public boolean allergic(String alergen) {
        boolean isAllergen = false;
        for (int i = 0; i < ingridientName.length; i++) {
            if (ingridientName[i] == alergen) {
                isAllergen = true;
            }
        }
        return isAllergen;
    }

    public boolean lactoseFree() {
        boolean hasLactose = false;
        for (int i = 0; i < ingridientName.length; i++) {
            if ((ingridientName[i].contains("cheese")) || ingridientName[i].contains("Milk")) {
                ingridientQuantity[i][0] = 0;
                ingridientQuantity[i][1] = 0;
                return hasLactose = true;
            }
        }
        return hasLactose;
    }

    public double costs() {
        double totalCosts = 0;
        for (int i = 0; i < ingridientQuantity.length; i++) {
            totalCosts += ingridientQuantity[i][1];
        }
        return totalCosts;
    }

    public double costsPerPerson() {
        double costPerPerson = 0;
        costPerPerson = costs() / noPersons;
        return costPerPerson;
    }

    public void differentNoPersons(int number) {
        if (number <= 0) {
            System.out.println("Please enter valid number of persons.");
        } else {
            for (int i = 0; i < ingridientQuantity.length; i++) {
                ingridientQuantity[i][0] = (ingridientQuantity[i][0] / noPersons) * number;
                ingridientQuantity[i][1] = (ingridientQuantity[i][1] / noPersons) * number;
            }
        }
        System.out.println("For " + number + " persons, the quantity and price of ingredients would be "
                + Arrays.deepToString(ingridientQuantity));
    }
}
