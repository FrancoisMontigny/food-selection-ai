package Food;
/*
* Population.java
* Manages a population of candidate Repas
*/



public class Population {

    // Holds population of Repas
    Repas[] RepasList;

    // Construct a population
    public Population(int populationSize, boolean initialise) {
        RepasList = new Repas[populationSize];
        // If we need to initialise a population of Repas do so
        if (initialise) {
            // Loop and create individuals
            for (int i = 0; i < populationSize(); i++) {
                Repas newRepas = new Repas();
                newRepas.generateIndividual();
                saveRepas(i, newRepas);
            }
        }
    }
    
    // Saves a Repas
    public void saveRepas(int index, Repas Repas) {
        RepasList[index] = Repas;
    }
    
    // Gets a Repas from population
    public Repas getRepas(int index) {
        return RepasList[index];
    }

    // Gets the best Repas in the population
    public Repas getFittest() {
        Repas fittest = RepasList[0];
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
        return RepasList.length;
    }
}