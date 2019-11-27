package Food;

import DataMigrator.FoodGroup;
import DataMigrator.IncorrectFormatException;
import DataMigrator.Migrator;
import util.CSVReader;

import java.io.FileNotFoundException;
import java.util.List;

public class GenerateAliment {
    public static List<Aliment> generateAlimentGroup(FoodGroup foodgroup) {
        // TODO put this in config file
        String csvFile = "foodTable.csv";

        // Import data from the CSV file
        Migrator m = new Migrator(new CSVReader(',', '"'));
        List<Aliment> aliments = null;
        try {
            aliments = m.importData(csvFile);
        } catch (FileNotFoundException fnfe) {
            System.err.println("File " + csvFile + " not found. Aborting.");
            System.exit(-1);
        } catch (IncorrectFormatException ife) {
            System.err.println("Uncorrect format : " + ife.getMessage() + " Aborting.");
        }

        if (aliments == null || aliments.isEmpty()) {
            System.out.println("Couldn't gather data from file. Aborting.");
            System.exit(-1);
        }

        return  m.getAlimentGroup(aliments,foodgroup);
        // Use data
        // TODO
    }
}
