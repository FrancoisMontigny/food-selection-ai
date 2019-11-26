package DataMigrator;

import Food.Aliment;
import util.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Migrator {
    private static final int EXPECTED_COLUMNS = 47;

    private CSVReader reader;

    public Migrator(CSVReader reader) {
        this.reader = reader;
    }

    public List<Aliment> migrateData(String csvPath) throws FileNotFoundException {
        List<Aliment> data = new ArrayList<>();
        AlimentFactory af = new AlimentFactory();

        Scanner scanner = new Scanner(new File(csvPath));

        if (!scanner.hasNext()) { // Empty file
            return null;
        }

        // The first line is the columns' headers
        List<String> headers = reader.parseLine(scanner.nextLine(), ' ', ' ');

        if (headers.size() != EXPECTED_COLUMNS) {
            return null;
        }

        while (scanner.hasNext()) {
            List<String> line = reader.parseLine(scanner.nextLine(), ' ', ' ');
            System.out.println(line.get(0));

            data.add(af.createAliment(line));
        }
        scanner.close();

        return data;
    }
}
