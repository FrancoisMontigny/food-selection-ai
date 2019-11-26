package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Provides a tool to read a CSV file.
 * Inspired by https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
 */
public class CSVReader {
    private char defaultSeparator;
    private char defaultQuote;

    public CSVReader(char defaultSeparator, char defaultQuote) {
        this.defaultSeparator = defaultSeparator;
        this.defaultQuote = defaultQuote;
    }

    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(',','"');

        String csvFile = "C:\\Users\\Montigny\\Documents\\INSA\\UQAC\\IA\\projet\\foodTable.csv";

        Scanner scanner = new Scanner(new File(csvFile));
        while (scanner.hasNext()) {
            List<String> line = reader.parseLine(scanner.nextLine(), reader.defaultSeparator, reader.defaultQuote);
            System.out.println(line.get(0));
        }
        scanner.close();
    }

    public List<String> parseLine(String cvsLine, char separators, char customQuote) {
        List<String> result = new ArrayList<>();

        if (cvsLine == null && cvsLine.isEmpty()) {
            return result;
        }

        if (customQuote == ' ') {
            customQuote = this.defaultQuote;
        }

        if (separators == ' ') {
            separators = this.defaultSeparator;
        }

        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;

        char[] chars = cvsLine.toCharArray();

        for (char ch : chars) {
            if (inQuotes) {
                startCollectChar = true;
                if (ch == customQuote) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                } else {

                    // Fixed : allow "" in custom quote enclosed
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }

                }
            } else {
                if (ch == customQuote) {

                    inQuotes = true;

                    //Fixed : allow "" in empty quote enclosed
                    if (chars[0] != '"' && customQuote == '\"') {
                        curVal.append('"');
                    }

                    //double quotes in column will hit this!
                    if (startCollectChar) {
                        curVal.append('"');
                    }

                } else if (ch == separators) {

                    result.add(curVal.toString());

                    curVal = new StringBuffer();
                    startCollectChar = false;

                } else if (ch == '\r') {
                    // ignore LF characters
                    continue;
                } else if (ch == '\n') {
                    // the end, break!
                    break;
                } else {
                    curVal.append(ch);
                }
            }

        }

        result.add(curVal.toString());

        return result;
    }
}
