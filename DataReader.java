import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    protected String[][] readDataFromFile(String filename, int maxRows, int maxColumns) {
        // the method readDataFromFIle reads data from a csv file and creates a 2D array
        String[][] data = new String[maxRows][maxColumns]; // Creates a 2d array to store the data
        int rowCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Read headers (first line) to determine the number of columns
            String line = reader.readLine();
            int columnCount = line.split(",").length;

            while ((line = reader.readLine()) != null) { //Loops through the remaining lines of code
                String[] row = line.split(","); // seperates each line into different string arrays
                data[rowCount] = row;
                rowCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    protected int findRowIndexByName(String[][] data, String Name) {
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equalsIgnoreCase(Name)) {
                return i;
            }
        }
        return -1;
    }
}