import DataMigrator.Migrator;
import Food.Aliment;
import util.CSVReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Montigny\\Documents\\INSA\\UQAC\\IA\\projet\\foodTable.csv";

        // Import data from the CSV file
        Migrator m = new Migrator(new CSVReader(',', '"'));
        List<Aliment> aliments = null;
        try {
            aliments = m.migrateData(csvFile);
        } catch (FileNotFoundException e) {
            System.err.println("File " + csvFile + " not found. Aborting.");
            System.exit(-1);
        }

        if (aliments == null || aliments.isEmpty()) {
            System.out.println("Couldn't gather data from file. Aborting.");
            System.exit(-1);
        }

        // Use data
        // TODO
    }
}
