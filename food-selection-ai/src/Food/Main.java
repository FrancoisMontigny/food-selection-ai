package Food;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<Aliment> alimentlist;
	public static Aliment goalValue;


	public static void main(String[] args) {
			alimentlist = GenerateAliment.generateAliment();
			goalValue = new Aliment("Valeur journalière",150.0,100.0,123.0,123.0,123.0,123.0,132.0,123.0,123.0,123.0,213.0,123.0,123.0,123.0,123.0,123.0,123.0,123.0,123.0,123.0,123.0,13.0,123.0,1.23,1.23,1.23,1.23,1.23,1.23,1.23,1.23,1.23,1.23,1.23,1.23,1.23,1.32,1.32,1.23,1.23,1.32,1.3,1.23,1.23,1.23,"Aucun");
	        // Initialize population
			Population pop = new Population(50,true);
			int initialscore = pop.getFittest().getScore();
			System.out.println("initial score = "+initialscore);

	        // Evolve population for 100 generations
			for(int i = 0 ; i<100;i++) {
				pop = GA.evolvePopulation(pop);
			}
			
	        // Print final results
	        int finalscore = pop.getFittest().getScore();
	        System.out.println("final score = " +finalscore);
	        System.out.println("difference = " + (initialscore-finalscore));
	        System.out.println(pop.getFittest());
	    }
		
		
	

}
