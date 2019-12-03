package Food;

public class GA {
    /* GA parameters */
    private static final double mutationRate = 0.025;
    private static final int tournamentSize = 5;

    /**
     * Evolves a population over one generation
     * @param pop the population to evolve.
     * @return the evolved population.
     */
    public static Population evolvePopulation(Population pop) {
        Population newPopulation = new Population(pop.populationSize(), false);


        // Crossover population
        // Loop over the new population's size and create individuals from
        // Current population (select parents, crossover them, add child to population
        for (int i = 0; i < newPopulation.populationSize(); i++) {
            // Select parents Tournament 
            Meal parent1 = tournamentSelection(pop);
            Meal parent2 = tournamentSelection(pop);
            // Crossover parents
            Meal child = crossover(parent1, parent2);
            // Add child to new population
            newPopulation.saveMeal(i, child);
        }


        // Mutate the new population a bit to add some new genetic material
        for (int i = 0; i < newPopulation.populationSize(); i++) {
            if (Math.random() <= mutationRate) {
                mutate(newPopulation.getMeal(i));
            }
        }

        return newPopulation;
    }

    /**
     * Applies crossover to a set of parents and creates offspring
     * @param parent1 the first parent.
     * @param parent2 the second parent.
     * @return the child of the two parents.
     */
    public static Meal crossover(Meal parent1, Meal parent2) {
        // Create new child meal
        Meal child = new Meal();
        //---------------------------------------------------------------------------------------------------------
        // Crossover 2 parents using the Two Point crossover
        //----------------------------------------------------------------------------------------------------------
        int crossPos1, crossPos2;
        do {
            crossPos1 = (int) (Math.random() * parent1.mealSize());
            crossPos2 = (int) (Math.random() * parent1.mealSize());
        } while (crossPos1 >= crossPos2);

        for (int i = 0; i < crossPos1; i++) {
            child.setAliment(i, parent1.getAliment(i));
        }
        for (int i = crossPos1; i < crossPos2; i++) {
            child.setAliment(i, parent2.getAliment(i));
        }
        for (int i = crossPos2; i < child.mealSize(); i++) {
            child.setAliment(i, parent1.getAliment(i));
        }
        return child;
    }

    /**
     * Mutate a meal by changing a random aliment
     * @param meal the meal to mutate.
     */
    private static void mutate(Meal meal) {
        int pos = (int) (Math.random() * meal.mealSize());
        Aliment randomAliment = meal.getRandomAliment(pos);
        meal.setAliment(pos, randomAliment);

    }

    /**
     * Selects candidate tour for crossover using tournament method.
     * @param pop the population to select a Meal from.
     * @return the selected Meal.
     */
    private static Meal tournamentSelection(Population pop) {
        // Create a tournament population
        Population tournament = new Population(tournamentSize, false);
        // For each place in the tournament get a random candidate tour and
        // add it
        for (int i = 0; i < tournamentSize; i++) {
            int randomId = (int) (Math.random() * pop.populationSize());
            tournament.saveMeal(i, pop.getMeal(randomId));
        }
        // Get the fittest tour
        return tournament.getFittest();
    }
}
