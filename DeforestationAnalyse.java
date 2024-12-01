import java.util.Scanner;

//This class is for analyzing deforestation data
class DeforestationAnalyse extends DataReader {
    //This creates a 2D array to store tree loss figures
    private String [][]lossFigures;
//This creates a 2D array to store forest loss data per year
    private String [][] forestLossPerYear;
    //This method is for retrieving forest loss data
    public void ForestLossinformation() {
        String file3 = "src\\Forest_Loss_per_YEAR.csv";
        //This reads forest loss data from file and store it in forestLossPerYear array

        forestLossPerYear = readDataFromFile(file3, 100, 2);

    }
    // This method is to retrieve tree loss data
    public void treelossinformation(){
        String file1 = "src\\Tree_cover_loss_figures.csv";
        lossFigures = readDataFromFile(file1,100,9);

    }
    // This constructor is to initialize tree and forest loss data
    public DeforestationAnalyse(){
        treelossinformation();
        ForestLossinformation();
    }
    // This method is for printing forest loss data
    public void printerForest(){
        //This is to display forest loss data
        displayForest();

    }
    // This method is to print tree loss data for a specific region
    public void printerTrees(){
        Scanner scanner = new Scanner(System.in);
        // This displays regions to choose from
        System.out.println(" ");
        System.out.println("====================================================");
        System.out.println("Locations:....");
        System.out.println("Ashanti,Western,BrongAhafo,Central,Eastern");
        System.out.println("Greater Accra,Northern,Upper East,Upper West,Volta");
        System.out.println("====================================================");
        System.out.println(" ");
        System.out.print("Enter the region name: ");
        String name = scanner.nextLine();
        // Finds the index of the region in the tree loss data
        int rowIndex = findRowIndexByName(lossFigures,name);
        if (rowIndex != -1){
            // If the region is found, display its tree loss data
            displayTrees(rowIndex);
            // If the region is not found, display error message
        }else{
            System.out.println("Region not found");
        }

    }
    // This method is to calculate and display tree loss data for a specific region
    public double displayTrees(int rows){
        String [] row = lossFigures[rows];
        System.out.println("Region: "+ row[0]);
        int j = 1;
        int total = 0;
        // Calculate total tree loss for the region
        for(int i = 0;i < row.length; i++){
            if(j == 7){
                break;

            }else {
                int number = Integer.parseInt(row[j]);
                total = total + number;
                j++;
            }

        }
        // For calculating deforestation rate for trees
        int numberOfYears = 20; // Assuming data spans over 20 years
        double deforestationRateForTrees = total/numberOfYears;
        System.out.println("The deforestation rate for trees in "+ row[0]  +" is "+ deforestationRateForTrees +" per year");
        return deforestationRateForTrees;



    }
    // This method is to calculate and display total forest loss data
    public void displayForest(){
        int j = 0;
        int total = 0;
        // To calculate total forest loss over the years
        for(int i = 0;i<forestLossPerYear.length;i++){
            if(j == 19){
                break;
            }else {
                int number = Integer.parseInt(forestLossPerYear[j][1]);
                total = total + number;
                j++;
            }

        }
        // To calculate deforestation rate for forest
        int numberOfForest = 19;
        double deforestationRateForForest = total/numberOfForest;
        // To print total deforestation rate for forest
        System.out.println("The total Deforestation Rate for forest is "+ deforestationRateForForest +" per year" );
    }
    public void showDeforestationAnalyse(){
        // This displays tree loss data for a specific region
        printerTrees();
        // This displays total forest loss data
        printerForest();
    }



}


