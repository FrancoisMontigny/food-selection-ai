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

    public String getDescription() {
        return description;
    }

    public Double getEnergy() {
        return energy;
    }

    public Double getProtein() {
        return protein;
    }

    public Double getCarbohydrate() {
        return carbohydrate;
    }

    public Double getSugarsTotal() {
        return sugarsTotal;
    }

    public Double getFiberTotalDietary() {
        return fiberTotalDietary;
    }

    public Double getFatTotal() {
        return fatTotal;
    }

    public Double getFattyAcidsTotalSaturated() {
        return fattyAcidsTotalSaturated;
    }

    public Double getFattyAcidsTotalMonounsaturated() {
        return fattyAcidsTotalMonounsaturated;
    }

    public Double getFattyAcidsTotalPolyunsaturated() {
        return fattyAcidsTotalPolyunsaturated;
    }

    public Double getCholesterol() {
        return cholesterol;
    }

    public Double getRetinol() {
        return retinol;
    }

    public Double getaVitaminMce() {
        return aVitaminMce;
    }

    public Double getCaroteneAlpha() {
        return caroteneAlpha;
    }

    public Double getCaroteneBeta() {
        return caroteneBeta;
    }

    public Double getCryptoxanthinBeta() {
        return cryptoxanthinBeta;
    }

    public Double getLycopene() {
        return lycopene;
    }

    public Double getLuteinAndZeaxanthin() {
        return luteinAndZeaxanthin;
    }

    public Double getThiamin() {
        return thiamin;
    }

    public Double getRiboflavin() {
        return riboflavin;
    }

    public Double getNiacin() {
        return niacin;
    }

    public Double getB6Vitamin() {
        return b6Vitamin;
    }

    public Double getFolicAcid() {
        return folicAcid;
    }

    public Double getFolateFood() {
        return folateFood;
    }

    public Double getFolateDfe() {
        return folateDfe;
    }

    public Double getFolateTotal() {
        return folateTotal;
    }

    public Double getCholineTotal() {
        return cholineTotal;
    }

    public Double getB12Vitamin() {
        return b12Vitamin;
    }

    public Double getB12VitaminAdded() {
        return b12VitaminAdded;
    }

    public Double getcVitamin() {
        return cVitamin;
    }

    public Double getD2D3Vitamin() {
        return d2D3Vitamin;
    }

    public Double geteVitaminAlphaTocopherol() {
        return eVitaminAlphaTocopherol;
    }

    public Double geteVitaminAdded() {
        return eVitaminAdded;
    }

    public Double getkVitaminPhylloquinone() {
        return kVitaminPhylloquinone;
    }

    public Double getCalcium() {
        return calcium;
    }

    public Double getPhosphorus() {
        return phosphorus;
    }

    public Double getMagnesium() {
        return magnesium;
    }

    public Double getIron() {
        return iron;
    }

    public Double getZinc() {
        return zinc;
    }

    public Double getCopper() {
        return copper;
    }

    public Double getSelenium() {
        return selenium;
    }

    public Double getPotassium() {
        return potassium;
    }

    public Double getSodium() {
        return sodium;
    }

    public Double getCaffeine() {
        return caffeine;
    }

    public Double getTheobromine() {
        return theobromine;
    }

    public Double getAlcohol() {
        return alcohol;
    }

    public String getFoodGroup() {
        return foodGroup;
    }

    @Override
	public String toString() {
		return "Aliment{" +
				"description='" + description + '\'' +
				", energy=" + energy +
				", protein=" + protein +
//				", carbohydrate=" + carbohydrate +
//				", sugarsTotal=" + sugarsTotal +
//				", fiberTotalDietary=" + fiberTotalDietary +
//				", fatTotal=" + fatTotal +
//				", fattyAcidsTotalSaturated=" + fattyAcidsTotalSaturated +
//				", fattyAcidsTotalMonounsaturated=" + fattyAcidsTotalMonounsaturated +
//				", fattyAcidsTotalPolyunsaturated=" + fattyAcidsTotalPolyunsaturated +
//				", cholesterol=" + cholesterol +
//				", retinol=" + retinol +
//				", aVitaminMce=" + aVitaminMce +
//				", caroteneAlpha=" + caroteneAlpha +
//				", caroteneBeta=" + caroteneBeta +
//				", cryptoxanthinBeta=" + cryptoxanthinBeta +
//				", lycopene=" + lycopene +
//				", luteinAndZeaxanthin=" + luteinAndZeaxanthin +
//				", thiamin=" + thiamin +
//				", riboflavin=" + riboflavin +
//				", niacin=" + niacin +
//				", b6Vitamin=" + b6Vitamin +
//				", folicAcid=" + folicAcid +
//				", folateFood=" + folateFood +
//				", folateDfe=" + folateDfe +
//				", folateTotal=" + folateTotal +
//				", cholineTotal=" + cholineTotal +
//				", b12Vitamin=" + b12Vitamin +
//				", b12VitaminAdded=" + b12VitaminAdded +
//				", cVitamin=" + cVitamin +
//				", d2D3Vitamin=" + d2D3Vitamin +
//				", eVitaminAlphaTocopherol=" + eVitaminAlphaTocopherol +
//				", eVitaminAdded=" + eVitaminAdded +
//				", kVitaminPhylloquinone=" + kVitaminPhylloquinone +
//				", calcium=" + calcium +
//				", phosphorus=" + phosphorus +
//				", magnesium=" + magnesium +
//				", iron=" + iron +
//				", zinc=" + zinc +
//				", copper=" + copper +
//				", selenium=" + selenium +
//				", potassium=" + potassium +
//				", sodium=" + sodium +
//				", caffeine=" + caffeine +
//				", theobromine=" + theobromine +
//				", alcohol=" + alcohol +
				", foodGroup='" + foodGroup + '\'' +
				'}';
	}
}


