package Uebungsbeispiele13;

public class Hund {

    private String name;
    public String allergien;

    public Hund(String name) {
        this.name = name;
        this.allergien = allergien;
    }

    public String getName() {
        return name;
    }

    public static String[] dogsWithAllergies(Hund[] dogs, String[] ingredients) {
        String[] dogsWithAllergy = new String[dogs.length];
        int x = 0;
        for (int i = 0; i < ingredients.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                if(ingredients[i].equals(dogs[j].allergien)) {
                dogsWithAllergy[x] = dogs[j].getName();
                x++;
                } }
            }
        return dogsWithAllergy;}

     public static int[] frequentAllergen(Hund[] dogs, String[] ingredients) {
        int[] frequentallergen = new int[ingredients.length];

         for (int i = 0; i < ingredients.length; i++) {
             int counter = 0;
             for (int j = 0; j < dogs.length; j++) {
                 frequentallergen[i] = counter;
                 if(ingredients[i].equals(dogs[j].allergien)) {
                     counter++;
                 frequentallergen[i] = counter;
                 } }
         }
         return frequentallergen;}


    @Override
   public String toString() {
        return "Dog " + name;
    }



}
