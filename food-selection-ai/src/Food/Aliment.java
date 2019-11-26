package Food;

public class Aliment {

    private String description;
    private Double energy;
    private Double protein;
    private Double carbohydrate;
    private Double sugarsTotal;
    private Double fiberTotalDietary;
    private Double fatTotal;
    private Double fattyAcidsTotalSaturated;
    private Double fattyAcidsTotalMonounsaturated;
    private Double fattyAcidsTotalPolyunsaturated;
    private Double cholesterol;
    private Double retinol;
    private Double aVitaminMce;
    private Double caroteneAlpha;
    private Double caroteneBeta;
    private Double cryptoxanthinBeta;
    private Double lycopene;
    private Double luteinAndZeaxanthin;
    private Double thiamin;
    private Double riboflavin;
    private Double niacin;
    private Double b6Vitamin;
    private Double folicAcid;
    private Double folateFood;
    private Double folateDfe;
    private Double folateTotal;
    private Double cholineTotal;
    private Double b12Vitamin;
    private Double b12VitaminAdded;
    private Double cVitamin;
    private Double d2D3Vitamin;
    private Double eVitaminAlphaTocopherol;
    private Double eVitaminAdded;
    private Double kVitaminPhylloquinone;
    private Double calcium;
    private Double phosphorus;
    private Double magnesium;
    private Double iron;
    private Double zinc;
    private Double copper;
    private Double selenium;
    private Double potassium;
    private Double sodium;
    private Double caffeine;
    private Double theobromine;
    private Double alcohol;
    String foodGroup;

    /*
     *
     * Models of a aliment
     */

    int Calorie;
    int VitamineA;
    String Name;

    public Aliment(String description, Double energy, Double protein, Double carbohydrate, Double sugarsTotal,
				   Double fiberTotalDietary, Double fatTotal, Double fattyAcidsTotalSaturated,
				   Double fattyAcidsTotalMonounsaturated, Double fattyAcidsTotalPolyunsaturated, Double cholesterol,
				   Double retinol, Double aVitaminMce, Double caroteneAlpha, Double caroteneBeta,
				   Double cryptoxanthinBeta, Double lycopene, Double luteinAndZeaxanthin, Double thiamin,
				   Double riboflavin, Double niacin, Double b6Vitamin, Double folicAcid, Double folateFood,
				   Double folateDfe, Double folateTotal, Double cholineTotal, Double b12Vitamin, Double b12VitaminAdded,
				   Double cVitamin, Double d2D3Vitamin, Double eVitaminAlphaTocopherol, Double eVitaminAdded,
				   Double kVitaminPhylloquinone, Double calcium, Double phosphorus, Double magnesium, Double iron,
				   Double zinc, Double copper, Double selenium, Double potassium, Double sodium, Double caffeine,
				   Double theobromine, Double alcohol, String foodGroup) {
        this.description = description;
        this.energy = energy;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.sugarsTotal = sugarsTotal;
        this.fiberTotalDietary = fiberTotalDietary;
        this.fatTotal = fatTotal;
        this.fattyAcidsTotalSaturated = fattyAcidsTotalSaturated;
        this.fattyAcidsTotalMonounsaturated = fattyAcidsTotalMonounsaturated;
        this.fattyAcidsTotalPolyunsaturated = fattyAcidsTotalPolyunsaturated;
        this.cholesterol = cholesterol;
        this.retinol = retinol;
        this.aVitaminMce = aVitaminMce;
        this.caroteneAlpha = caroteneAlpha;
        this.caroteneBeta = caroteneBeta;
        this.cryptoxanthinBeta = cryptoxanthinBeta;
        this.lycopene = lycopene;
        this.luteinAndZeaxanthin = luteinAndZeaxanthin;
        this.thiamin = thiamin;
        this.riboflavin = riboflavin;
        this.niacin = niacin;
        this.b6Vitamin = b6Vitamin;
        this.folicAcid = folicAcid;
        this.folateFood = folateFood;
        this.folateDfe = folateDfe;
        this.folateTotal = folateTotal;
        this.cholineTotal = cholineTotal;
        this.b12Vitamin = b12Vitamin;
        this.b12VitaminAdded = b12VitaminAdded;
        this.cVitamin = cVitamin;
        this.d2D3Vitamin = d2D3Vitamin;
        this.eVitaminAlphaTocopherol = eVitaminAlphaTocopherol;
        this.eVitaminAdded = eVitaminAdded;
        this.kVitaminPhylloquinone = kVitaminPhylloquinone;
        this.calcium = calcium;
        this.phosphorus = phosphorus;
        this.magnesium = magnesium;
        this.iron = iron;
        this.zinc = zinc;
        this.copper = copper;
        this.selenium = selenium;
        this.potassium = potassium;
        this.sodium = sodium;
        this.caffeine = caffeine;
        this.theobromine = theobromine;
        this.alcohol = alcohol;
        this.foodGroup = foodGroup;
    }

    // Constructs a aliment with a name
    public Aliment(String Name) {
        this.Calorie = (int) (Math.random() * 200);
        this.VitamineA = (int) (Math.random() * 200);
        this.Name = Name;
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
    public String getName() {
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


