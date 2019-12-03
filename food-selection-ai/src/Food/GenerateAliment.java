package Food;

import DataMigrator.FoodGroup;
import DataMigrator.IncorrectFormatException;
import DataMigrator.Migrator;
import util.CSVReader;

import java.io.FileNotFoundException;
import java.util.List;

public class GenerateAliment {
    /**
     * Generate a group of aliments for the given food group.
     *
     * @param foodgroup the food group to generate.
     * @return the generated food group.
     */
    public static List<Aliment> generateAlimentGroup(FoodGroup foodgroup) {
        String csvFile = "C:\\Users\\Montigny\\Documents\\INSA\\UQAC\\IA\\projet\\foodTable.csv";

        // Import data from the CSV file
        Migrator m = new Migrator(new CSVReader(',', '"'));
        List<Aliment> aliments = null;
        try {
            aliments = m.importData(csvFile);
        } catch (FileNotFoundException fnfe) {
            System.err.println("File " + csvFile + " not found. Aborting.");
            System.exit(-1);
        } catch (IncorrectFormatException ife) {
            System.err.println("Incorrect format : " + ife.getMessage() + " Aborting.");
        }

        if (aliments == null || aliments.isEmpty()) {
            System.out.println("Couldn't gather data from file. Aborting.");
            System.exit(-1);
        }

        return m.getAlimentGroup(aliments, foodgroup);
    }
}
