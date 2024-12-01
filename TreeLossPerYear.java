import java.util.Scanner;

// This class handles tree loss data per year
public class TreeLossPerYear extends DataReader {
    //A 2d array is created to store tree loss data per year
    private String[][] treeLossPerYear;

  //Constructor of the class TreeLossPerYear
    public TreeLossPerYear() {
        String file2 = "src\\Tree_cover_loss_per_year.csv";
        treeLossPerYear = readDataFromFile(file2, 100, 2);
    }

    // This method prints tree loss data for a specified year
    private void printRegionLossPerYear(int amountRow) {
        String[] rowTree = treeLossPerYear[amountRow];
        System.out.println("Year: " + rowTree[0]);
        System.out.println("Amount of Trees Loss in this Year: " + rowTree[1] + " Hectares");
    }

    // This method shows tree loss data for a specific year based on the user's choice
    public void showTreeData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String treeYear = scanner.nextLine();

        //This method finds the index of the year in the data
        int treeRow = findRowIndexByName(treeLossPerYear, treeYear);
        if (treeRow != -1) { //prints data of the year if found
            System.out.println(" ");
            printRegionLossPerYear(treeRow);
        } else { //if year is not found, an error message is displayed
            System.out.println("Year not found");
        }
    }
}