package Food;


/*
	*
	* Stores a candidate repas
	*/

import java.util.ArrayList;
import java.util.Random;

public class Repas {

    // Holds our repas of aliments
    private ArrayList<Aliment> repas = new ArrayList<Aliment>();
    // Cache
    private double fitness = 0;
    private int score = 0;
    private int numberOfAliments= Main.alimentlist.size();
    private int numberOfAlimentsAsked = 5;
    private Random rand = new Random();
    // Constructs a blank repas
    public Repas(){
        for (int i = 0; i < numberOfAlimentsAsked; i++) {
            repas.add(null);
        }
    }

    public Repas(ArrayList<Aliment> repas){
        this.repas = repas;
    }

    // Creates a random individual
    public void generateIndividual() {

        // Randomly select aliments
        setAliment(0,getRandomAliment("Dairy Foods"));
        setAliment(1,getRandomAliment("Fruits"));
        setAliment(2,getRandomAliment("Vegetables"));
        setAliment(3,getRandomAliment("Grains, Beans and Nuts"));
        setAliment(4,getRandomAliment("Meet, Poultry,Fish,Seafood and eggs"));
    }

    // Gets a aliment from the repas
    public Aliment getAliment(int repasPosition) {
        return (Aliment)repas.get(repasPosition);
    }

    // C EST DEGEULASSE PLEASE DONT DO THIS MAIS JAI PAS LES LISTE DIFFERENTE
    public Aliment getRandomAliment(String foodGroup){
        Aliment randomAliment;
        do{
            int random = rand.nextInt(numberOfAliments);
            randomAliment = Main.alimentlist.get(random);
        }while(!randomAliment.getFoodGroup().equals(foodGroup));
        return randomAliment;
    }

    // Sets a aliment in a certain position within a repas

    public void setAliment(int repasPosition, Aliment aliment) {
        repas.set(repasPosition, aliment);
        // If the repass been altered we need to reset the fitness and score
        fitness = 0;
        score = 0;
    }

    // Gets the repass fitness
    public double getFitness() {
        if (fitness == 0) {
            fitness = 1/(double)getScore();
        }
        return fitness;
    }

    // Gets the total score of the repas
    public int getScore(){
        if (score == 0) {
            int totalEnergy=0;
            int totalProtein=0;
            // Loop through our repas's aliments
            for (int alimentIndex=0; alimentIndex < repasSize(); alimentIndex++) {
                // Get aliment we're travelling from
                Aliment aliment = getAliment(alimentIndex);
                totalEnergy += aliment.getEnergy();
                totalProtein += aliment.getProtein();
            }
            double repasScore = Math.pow((totalEnergy- Main.goalValue.getEnergy()),2)+Math.pow((totalProtein- Main.goalValue.getProtein()),2);
            score = (int) Math.sqrt(repasScore);
        }
        return score;
    }

    // Get number of aliments on our repas
    public int repasSize() {
        return repas.size();
    }

    // Check if the repas contains a aliment
    public boolean containsAliment(Aliment aliment){
        return repas.contains(aliment);
    }

    @Override
    public String toString() {
        String geneString = "Repas conseillé-->";
        for (int i = 0; i < repasSize(); i++) {
            geneString += " --> " +  getAliment(i).getFoodGroup() + " : " + getAliment(i).getDescription();
        }
        return geneString;
    }
}
	

