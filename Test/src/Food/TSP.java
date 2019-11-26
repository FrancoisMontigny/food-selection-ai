package Food;

import java.util.ArrayList;

public class TSP {
	public static ArrayList<Aliment> destinationAliments = new ArrayList<Aliment>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        // Create and add our cities
	      /*
	       * 
	       * 
	       * Question 4-a: To complete
	       */
			Aliment aliment1 = new Aliment("Fruit");
			destinationAliments.add(aliment1);
			Aliment aliment2 = new Aliment("Viande");
			destinationAliments.add(aliment2);
			Aliment aliment3 = new Aliment("Dairy");
			destinationAliments.add(aliment3);
			Aliment aliment4 = new Aliment("Riz");
			destinationAliments.add(aliment4);
		Aliment aliment11 = new Aliment("Fruit2");
		destinationAliments.add(aliment11);
		Aliment aliment22 = new Aliment("Viande2");
		destinationAliments.add(aliment22);
		Aliment aliment33 = new Aliment("Dairy2");
		destinationAliments.add(aliment33);
		Aliment aliment44 = new Aliment("Riz2");
		destinationAliments.add(aliment44);
		Aliment aliment111 = new Aliment("Fruit3");
		destinationAliments.add(aliment111);
		Aliment aliment222 = new Aliment("Viande3");
		destinationAliments.add(aliment222);
		Aliment aliment333 = new Aliment("Dairy3");
		destinationAliments.add(aliment333);
		Aliment aliment444 = new Aliment("Riz3");
		destinationAliments.add(aliment444);

	        // Initialize population
	      /*
	       * 
	       * Question 4-b: To complete
	       * 
	       */
			Population pop = new Population(50,true);
			int initialscore = pop.getFittest().getScore();
			System.out.println("initial score = "+initialscore);

	        // Evolve population for 100 generations
	      /*
	       * 
	       * Question 4-c: To complete
	       * 
	       * 
	       */
			for(int i = 0 ; i<100;i++) {
				pop = GA.evolvePopulation(pop);
			}
			
	        // Print final results
		/*
		 * 
		 * Questions 4-d and 4-e: To Complete
		 * 
		 */
	        int finalscore = pop.getFittest().getScore();
	        System.out.println("final score = " +finalscore);
	        System.out.println("difference = " + (initialscore-finalscore));
	        System.out.println(pop.getFittest());
	    }
		
		
	

}
