package Food;

import java.util.ArrayList;

public class GA {
	/* GA parameters */
    private static final double mutationRate = 0.025;
    private static final int tournamentSize = 5;

    // Evolves a population over one generation
    public static Population evolvePopulation(Population pop) {
        Population newPopulation = new Population(pop.populationSize(), false);

       
        // Crossover population
        // Loop over the new population's size and create individuals from
        // Current population (select parents, crossover them, add child to population
        for (int i = 0; i < newPopulation.populationSize(); i++) {
            // Select parents Tournament 
            Repas parent1 = tournamentSelection(pop);
            Repas parent2 = tournamentSelection(pop);
            // Select parents RWS
            //Tour parent1 = RWS(pop);
            //Tour parent2 = RWS(pop);
            // Crossover parents
            Repas child = crossover(parent1, parent2);
            // Add child to new population
            newPopulation.saveRepas(i, child);
        }
      

        // Mutate the new population a bit to add some new genetic material
        for (int i = 0; i < newPopulation.populationSize(); i++) {
        	if(Math.random()<=mutationRate) {
        		mutate(newPopulation.getRepas(i));}
        }

        return newPopulation;
    }

    // Applies crossover to a set of parents and creates offspring
    public static Repas crossover(Repas parent1, Repas parent2) {
        // Create new child repas
        Repas child = new Repas();
        //---------------------------------------------------------------------------------------------------------
        // Crossover 2 parents using the Two Point crossover
        //----------------------------------------------------------------------------------------------------------
        int crossPos1, crossPos2;
        do{
        crossPos1 = (int) (Math.random() * parent1.repasSize());
        crossPos2 = (int) (Math.random() * parent1.repasSize());
        } while (crossPos1>=crossPos2);

        for (int i = 0 ; i < crossPos1; i++) {
        	child.setAliment(i, parent1.getAliment(i));
        }
        for (int i = crossPos1 ; i < crossPos2; i++) {
            child.setAliment(i, parent1.getAliment(i));
        }
        for (int i = crossPos2 ; i < child.repasSize(); i++) {
            child.setAliment(i,parent1.getAliment(i));
        }
        return child;
    }

    // Mutate a repas by changin a random aliment
    private static void mutate(Repas repas) {
    	int pos= (int) (Math.random()* repas.repasSize());
    	Aliment randomAliment = repas.getRandomAliment(pos);
        repas.setAliment(pos, randomAliment);
    
    }
    	
    

    // Selects candidate tour for crossover using tournament method
    private static Repas tournamentSelection(Population pop) {
        // Create a tournament population
        Population tournament = new Population(tournamentSize, false);
        // For each place in the tournament get a random candidate tour and
        // add it
        for (int i = 0; i < tournamentSize; i++) {
            int randomId = (int) (Math.random() * pop.populationSize());
            tournament.saveRepas(i, pop.getRepas(randomId));
        }
        // Get the fittest tour
        Repas fittest = tournament.getFittest();
        return fittest;
    }
    
    //Select candidate tour for crossover using a RWS 
    private static Repas RWS(Population pop) {
    	ArrayList<Float> fitness_share=new ArrayList<Float>();
    	Repas candidate= new Repas();
    	
        //Calculate sum of fitness values of all individuals in the population
        float S=0;
        for(int i=0;i<pop.populationSize();i++) {
        		S=S+(float)(pop.getRepas(i).getFitness());
        	}
        
        //Calculate and Save fitness share for all individuals in population
        for(int i=0;i<pop.populationSize();i++) {
        	fitness_share.add((float) (pop.getRepas(i).getFitness()/S));
        	}
        	//Select individual based on its fitness share value and random generated value between 0 and 1 
        	double r= Math.random();
        		float var=0;
        		boolean passage=false;
        		for(int i=0; i<fitness_share.size();i++) {
        			var=var+fitness_share.get(i);
        			if(r<var && passage==false) {
        				candidate=pop.getRepas(i);
        				passage=true;
        				//break;
        			}
        		}
        	
        	return candidate;
    }

}
