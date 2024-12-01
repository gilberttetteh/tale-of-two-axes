
import java.util.Scanner;
//This class handles forest loss data per year
public class ForestLossPerYear extends DataReader {
    //creates a 2D array to store forest loss data
    public String[][] forestLossPerYear;

    public ForestLossPerYear() { // a contructor
        String file3 = "src\\Forest_Loss_per_YEAR.csv"; // uses the file location for the data file
        forestLossPerYear = readDataFromFile(file3, 100, 2);    //stores the data in a 2d array
    }

    private void printforestRegionData(int yearRow) {  //method for printing the forest data for a specified year
        String[] rowforest = forestLossPerYear[yearRow];
        System.out.println("Year: " + rowforest[0]); //prints the year and amount of forest lost
        System.out.println("Amount of Forest Loss in this Year: " + rowforest[1] + " Hectares");
    }

    public void showForestData() {             //uses user input to show the forest lost data for a specified year
        Scanner scanner = new Scanner(System.in);  //uses a scanner object to ask for user input
        System.out.print("Enter the year: ");
        String year = scanner.nextLine();          //takes in user input

        int yearRow = findRowIndexByName(forestLossPerYear, year); //Uses findRowIndexByName from the DataReader class
        if (yearRow != -1) {   //If the year is found, the data is printed
            System.out.println(" ");
            printforestRegionData(yearRow);
        } else {
            System.out.println("Year not found");
        }
    }
}
