package Food;
/*
* Population.java
* Manages a population of candidate Repas
*/



public class Population {

    // Holds population of Repas
    Meal[] mealList;

    // Construct a population
    public Population(int populationSize, boolean initialise) {
        mealList = new Meal[populationSize];
        // If we need to initialise a population of Repas do so
        if (initialise) {
            // Loop and create individuals
            for (int i = 0; i < populationSize(); i++) {
                Meal newMeal = new Meal();
                newMeal.generateIndividual();
                saveRepas(i, newMeal);
            }
        }
    }
    
    // Saves a Repas
    public void saveRepas(int index, Meal Meal) {
        mealList[index] = Meal;
    }
    
    // Gets a Repas from population
    public Meal getRepas(int index) {
        return mealList[index];
    }

    // Gets the best Repas in the population
    public Meal getFittest() {
        Meal fittest = mealList[0];
        // Loop through individuals to find fittest
        for (int i = 1; i < populationSize(); i++) {
            if (fittest.getFitness() <= getRepas(i).getFitness()) {
                fittest = getRepas(i);
            }
        }
        return fittest;
    }

    // Gets population size
    public int populationSize() {
        return mealList.length;
    }
}