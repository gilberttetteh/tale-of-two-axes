import java.util.Scanner;
//class for analyzing afforestation
public class AfforestationAnalyse extends DeforestationAnalyse{
    private String [][]lossFigures;
    //2D array stores tree loss figures


    public void treelossnformation(){
        //accessing data file for tree loss information
        String file1 = "src\\Tree_cover_loss_figures.csv";
        //reads data form the file
        lossFigures = readDataFromFile(file1,100,9);

    }
    public AfforestationAnalyse(){
        //constructor to initalize the tree loss data
        treelossnformation();
    }

    public double computeAfforestationRate(){
        //uses the scanner class to read user input
        Scanner years = new Scanner(System.in);
        Scanner trees = new Scanner(System.in);

        System.out.print("How many years would you like to Estimate: ");
        int year = years.nextInt();
        System.out.println("Enter the number of trees to be planted: ");
        int tree = trees.nextInt();
        //calculates the afforestation rate
        double rate = tree/year;
        return rate;
    }

    public void estimate(){
        Scanner scanner = new Scanner(System.in);
        double afforestationRate = computeAfforestationRate();
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println("Locations:....");
        System.out.println("Ashanti,Western,BrongAhafo,Central,Eastern");
        System.out.println("Greater Accra,Northern,Upper East,Upper West,Volta");
        System.out.println("===================================================");
        System.out.println(" ");
        System.out.print("Enter the region: ");
        String region = scanner.nextLine();
        int rowIndex = findRowIndexByName(lossFigures,region); //finds the region index and associated data

        double deforestationRate = displayTrees(rowIndex);
        //shows the data for the amount of trees lost in the reagion and shos the defforestation rate
        System.out.println("The Afforestation rate would be: "+ afforestationRate);


        double rate = afforestationRate - deforestationRate;
        //makes an analysis based on the data and provides analysis
        if(rate < 0){
            System.out.println("Your effort to reduce Deforestation is likely ineffective");
        }else{
            System.out.println("You are contributing to saving the environment");
        }
        System.out.println(rate);

    }



}
