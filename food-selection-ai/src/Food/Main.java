package Food;

import DataMigrator.FoodGroup;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static ArrayList<List<Aliment>> alimentlist= new ArrayList<>();
	public static Aliment goalValue;


	public static void main(String[] args) {
			alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.DAIRY_FOOD));
			alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.VEGETABLES));
			alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.MEAT_POULTRY_FISH_SEAFOOD_EGGS));
			alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.GRAINS_BEANS_NUTS));
			alimentlist.add(GenerateAliment.generateAlimentGroup(FoodGroup.FRUITS));
			goalValue = new Aliment("Valeur journalière",2000.0,50.0,260.0,90.0,123.0,70.0,20.0,123.0,123.0,123.0,800.0,800.0,123.0,123.0,123.0,123.0,123.0,1.1,1.4,123.0,1.4,200.0,123.0,1.23,1.23,1.23,2.5,0.0,80.0,1.23,1.23,1.23,1.23,800.0,700.0,375.0,14.0,10.0,1.0,55.0,2000.0,12.0,0.0,1.23,0.0,"Aucun");
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
			System.out.println(5%5);
	    }
		
		
	

}
