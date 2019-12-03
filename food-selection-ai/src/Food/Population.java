package Food;
/*
* Population.java
* Manages a population of candidate Meal
*/



public class Population {

    // Holds population of Meal
    Meal[] mealList;

    // Construct a population
    public Population(int populationSize, boolean initialise) {
        mealList = new Meal[populationSize];
        // If we need to initialise a population of Meal do so
        if (initialise) {
            // Loop and create individuals
            for (int i = 0; i < populationSize(); i++) {
                Meal newMeal = new Meal();
                newMeal.generateIndividual();
                saveMeal(i, newMeal);
            }
        }
    }
    
    // Saves a Meal
    public void saveMeal(int index, Meal Meal) {
        mealList[index] = Meal;
    }
    
    // Gets a Meal from population
    public Meal getMeal(int index) {
        return mealList[index];
    }

    // Gets the best Meal in the population
    public Meal getFittest() {
        Meal fittest = mealList[0];
        // Loop through individuals to find fittest
        for (int i = 1; i < populationSize(); i++) {
            if (fittest.getFitness() <= getMeal(i).getFitness()) {
                fittest = getMeal(i);
            }
        }
        return fittest;
    }

    // Gets population size
    public int populationSize() {
        return mealList.length;
    }
}