import java.util.Scanner;

public class RegionData extends DataReader {
    private String[][] lossFigures;
    //The 2D array to store the tree cover loss figures

    public RegionData() {
        // This class is made to handle the region data
        String file1 = "src\\Tree_cover_loss_figures.csv";
        //It reads data from file into The Loss figures array
        lossFigures = readDataFromFile(file1, 100, 9);

    }
    // Reading print region data based on the rowIndex
    private void printRegionData(int rowIndex) {
        //To get the row data for the given index
        String[] row = lossFigures[rowIndex];
        //Print all rows of data
        System.out.println("Region: " + row[0]);
        System.out.println("Tree cover extent (2001): " + row[1]);
        System.out.println("Tree cover loss (2001-2005): " + row[2]);
        System.out.println("Tree cover loss (2006-2010): " + row[3]);
        System.out.println("Tree cover loss (2011-2015): " + row[4]);
        System.out.println("Tree cover loss (2016-2020): " + row[5]);
        System.out.println("Tree cover loss (total): " + row[6]);
        System.out.println("Tree cover loss (percentage): " + row[7]);
    }

    //To display the region data based on the userInput
    public void showRegionData() {
        Scanner scanner = new Scanner(System.in);
        //Prompt user to enter region name
        System.out.print("Enter the region name: ");
        String regionName = scanner.nextLine();
        int rowIndex = findRowIndexByName(lossFigures, regionName);
        //If region found,print region data
        if (rowIndex != -1) {
            System.out.println(" ");
            printRegionData(rowIndex);
        } else {
            //Else print error message
            System.out.println("Region not found.");
        }
    }
}