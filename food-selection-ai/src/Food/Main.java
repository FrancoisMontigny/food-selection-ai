package Food;

import DataMigrator.FoodGroup;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<List<Aliment>> alimentlist = new ArrayList<>();
    public static Aliment goalValue;

    private static final int GENERATIONS_NUMBER = 2000;
    private static final int POPULATION_SIZE = 100;

    public static void main(String[] args) {
        alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.DAIRY_FOOD));
        alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.VEGETABLES));
        alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.MEAT_POULTRY_FISH_SEAFOOD_EGGS));
        alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.GRAINS_BEANS_NUTS));
        alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.FRUITS));
        goalValue = new Aliment("Valeur journalière", 2000.0, 50.0, 260.0,
				90.0, 123.0, 70.0, 20.0,
				123.0, 123.0, 123.0, 800.0,
				800.0, 123.0, 123.0, 123.0, 123.0,
				123.0, 1.1, 1.4, 123.0, 1.4, 200.0,
				123.0, 1.23, 1.23, 1.23, 2.5, 0.0,
				80.0, 1.23, 1.23, 1.23, 1.23,
				800.0, 700.0, 375.0, 14.0, 10.0, 1.0, 55.0,
				2000.0, 12.0, 0.0, 1.23, 0.0, "Aucun");

        // Initialize population
        Population pop = new Population(POPULATION_SIZE, true);
        int initialScore = pop.getFittest().getScore();
        System.out.println("Initial score = " + initialScore);

        // Evolve population for 2000 generations
        for (int i = 0; i < GENERATIONS_NUMBER; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        int finalScore = pop.getFittest().getScore();
        System.out.println("Final score = " + finalScore);
        System.out.println("Difference = " + (initialScore - finalScore));
        System.out.println(pop.getFittest());
    }
}
