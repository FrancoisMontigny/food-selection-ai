package Food;

public class Aliment {
	
	/*
	*
	* Models of a aliment
	*/

	    int Calorie;
	    int VitamineA;
	    String Name;

	    // Constructs a aliment with a name
	    public Aliment(String Name){
			this.Calorie = (int)(Math.random()*200);
			this.VitamineA = (int)(Math.random()*200);
	        this.Name=Name;
	    }

	    // Gets aliment's calorie
		public int getCalorie() {
			return Calorie;
		}
		// Gets aliment's Vitamine A
		public int getVitamineA() {
			return VitamineA;
		}

	    // Gets aliment's name
	    public String getName(){
	        return this.Name;
	    }

	@Override
	public String toString() {
		return "Aliment{" +
				"Calorie=" + Calorie +
				", VitamineA=" + VitamineA +
				", Name='" + Name + '\'' +
				'}';
	}
}


