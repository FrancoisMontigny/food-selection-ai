package DataMigrator;

import Food.Aliment;

import java.util.List;

public class AlimentFactory {

    /**
     * Create an Aliment from a CSV line.
     *
     * @param csvLine the line from which we create the Aliment.
     * @return the created Aliment.
     */
    public Aliment createAliment(List<String> csvLine) throws IncorrectFormatException {
        String description = csvLine.get(IndexesService.DESCRIPTION);
        Double energy = Double.parseDouble(csvLine.get(IndexesService.ENERGY));
        Double protein = Double.parseDouble(csvLine.get(IndexesService.PROTEIN));
        Double carbohydrate = Double.parseDouble(csvLine.get(IndexesService.CARBOHYDRATE));
        Double sugarsTotal = Double.parseDouble(csvLine.get(IndexesService.SUGARS_TOTAL));
        Double fiberTotalDietary = Double.parseDouble(csvLine.get(IndexesService.FIBER_TOTAL_DIETARY));
        Double fatTotal = Double.parseDouble(csvLine.get(IndexesService.FAT_TOTAL));
        Double fattyAcidsTotalSaturated = Double.parseDouble(csvLine.get(IndexesService.FATTY_ACIDS_TOTAL_SATURATED));
        Double fattyAcidsTotalMonounsaturated = Double.parseDouble(csvLine.get(IndexesService.FATTY_ACIDS_TOTAL_MONOUNSATURATED));
        Double fattyAcidsTotalPolyunsaturated = Double.parseDouble(csvLine.get(IndexesService.FATTY_ACIDS_TOTAL_POLYUNSATURATED));
        Double cholesterol = Double.parseDouble(csvLine.get(IndexesService.CHOLESTEROL));
        Double retinol = Double.parseDouble(csvLine.get(IndexesService.RETINOL));
        Double aVitaminMce = Double.parseDouble(csvLine.get(IndexesService.A_VITAMIN_MCE));
        Double caroteneAlpha = Double.parseDouble(csvLine.get(IndexesService.CAROTENE_ALPHA));
        Double caroteneBeta = Double.parseDouble(csvLine.get(IndexesService.CAROTENE_BETA));
        Double cryptoxanthinBeta = Double.parseDouble(csvLine.get(IndexesService.CRYPTOXANTHIN_BETA));
        Double lycopene = Double.parseDouble(csvLine.get(IndexesService.LYCOPENE));
        Double luteinAndZeaxanthin = Double.parseDouble(csvLine.get(IndexesService.LUTEIN_AND_ZEAXANTHIN));
        Double thiamin = Double.parseDouble(csvLine.get(IndexesService.THIAMIN));
        Double riboflavin = Double.parseDouble(csvLine.get(IndexesService.RIBOFLAVIN));
        Double niacin = Double.parseDouble(csvLine.get(IndexesService.NIACIN));
        Double b6Vitamin = Double.parseDouble(csvLine.get(IndexesService.B_6_VITAMIN));
        Double folicAcid = Double.parseDouble(csvLine.get(IndexesService.FOLIC_ACID));
        Double folateFood = Double.parseDouble(csvLine.get(IndexesService.FOLATE_FOOD));
        Double folateDfe = Double.parseDouble(csvLine.get(IndexesService.FOLATE_DFE));
        Double folateTotal = Double.parseDouble(csvLine.get(IndexesService.FOLATE_TOTAL));
        Double cholineTotal = Double.parseDouble(csvLine.get(IndexesService.CHOLINE_TOTAL));
        Double b12Vitamin = Double.parseDouble(csvLine.get(IndexesService.B_12_VITAMIN));
        Double b12VitaminAdded = Double.parseDouble(csvLine.get(IndexesService.B_12_VITAMIN_ADDED));
        Double cVitamin = Double.parseDouble(csvLine.get(IndexesService.C_VITAMIN));
        Double d2D3Vitamin = Double.parseDouble(csvLine.get(IndexesService.D2_D3_VITAMIN));
        Double eVitaminAlphaTocopherol = Double.parseDouble(csvLine.get(IndexesService.E_VITAMIN_ALPHA_TOCOPHEROL));
        Double eVitaminAdded = Double.parseDouble(csvLine.get(IndexesService.E_VITAMIN_ADDED));
        Double kVitaminPhylloquinone = Double.parseDouble(csvLine.get(IndexesService.K_VITAMIN_PHYLLOQUINONE));
        Double calcium = Double.parseDouble(csvLine.get(IndexesService.CALCIUM));
        Double phosphorus = Double.parseDouble(csvLine.get(IndexesService.PHOSPHORUS));
        Double magnesium = Double.parseDouble(csvLine.get(IndexesService.MAGNESIUM));
        Double iron = Double.parseDouble(csvLine.get(IndexesService.IRON));
        Double zinc = Double.parseDouble(csvLine.get(IndexesService.ZINC));
        Double copper = Double.parseDouble(csvLine.get(IndexesService.COPPER));
        Double selenium = Double.parseDouble(csvLine.get(IndexesService.SELENIUM));
        Double potassium = Double.parseDouble(csvLine.get(IndexesService.POTASSIUM));
        Double sodium = Double.parseDouble(csvLine.get(IndexesService.SODIUM));
        Double caffeine = Double.parseDouble(csvLine.get(IndexesService.CAFFEINE));
        Double theobromine = Double.parseDouble(csvLine.get(IndexesService.THEOBROMINE));
        Double alcohol = Double.parseDouble(csvLine.get(IndexesService.ALCOHOL));
        String foodGroup = csvLine.get(IndexesService.FOOD_GROUP);

        return new Aliment(description, energy, protein, carbohydrate, sugarsTotal, fiberTotalDietary, fatTotal,
                fattyAcidsTotalSaturated, fattyAcidsTotalMonounsaturated, fattyAcidsTotalPolyunsaturated,
                cholesterol, retinol, aVitaminMce, caroteneAlpha, caroteneBeta, cryptoxanthinBeta, lycopene,
                luteinAndZeaxanthin, thiamin, riboflavin, niacin, b6Vitamin, folicAcid, folateFood, folateDfe,
                folateTotal, cholineTotal, b12Vitamin, b12VitaminAdded, cVitamin, d2D3Vitamin, eVitaminAlphaTocopherol,
                eVitaminAdded, kVitaminPhylloquinone, calcium, phosphorus, magnesium, iron, zinc, copper, selenium,
                potassium, sodium, caffeine, theobromine, alcohol, foodGroup); // TODO
    }
}
