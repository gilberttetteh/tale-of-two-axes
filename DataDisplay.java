//This is the Main Method

import java.util.Scanner;

public class DataDisplay {
    public static void main(String[] args) {
        //Creates various instances for different objects of different classes
        RegionData regionData = new RegionData();
        TreeLossPerYear treeLossPerYear = new TreeLossPerYear();
        ForestLossPerYear forestLossPerYear = new ForestLossPerYear();
        DeforestationAnalyse deforestationAnalyse = new DeforestationAnalyse();
        AfforestationAnalyse afforestationAnalyse = new AfforestationAnalyse();
        OpenYouTubeVideo openYouTubeVideo = new OpenYouTubeVideo();
        //Uses scanner object to ask for user input
        Scanner scanner = new Scanner(System.in);
        //Uses a while loop to keep the code running until the user exits the code.
        while (true) {
            //Multiple options
            System.out.println(" ");
            System.out.println("===================================================");
            System.out.println("Hello, Welcome to the Tale Of Two Axes Climate System");
            System.out.println("===================================================");
            System.out.println("(1)-Retrieve Data of Deforestation by Location");
            System.out.println("(2)-Retrieve Data of Deforestation by Year");
            System.out.println("(3)-Retrieve Forests Lost Per Year");
            System.out.println("(4)-Conduct Deforestation Results");
            System.out.println("(5)-Project Afforestation Results");
            System.out.println("(6)-For More Information");
            System.out.println("(0)-Exit Program");
            System.out.println(" ");
            System.out.print("Enter  what you wish to do: ");
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                //Show Deforestation Data by Location/Region
                System.out.println(" ");
                System.out.println("Locations:....");
                System.out.println("Ashanti,Western,BrongAhafo,Central,Eastern");
                System.out.println("Greater Accra,Northern,Upper East,Upper West,Volta");
                System.out.println(" ");

                System.out.println(" ");
                try {regionData.showRegionData();

                } catch (Exception e) { //Handles any exception or error that might occur
                    System.out.println("There has been an Error");
                    System.out.println("Kindly rerun the code");

                }

            }else if (userInput == 2) {
                //Show Deforestation Data by Year
                System.out.println(" ");
                System.out.println("Data was Collected for Year 2001 through 2020");

                System.out.println(" ");
                try {
                    treeLossPerYear.showTreeData();
                } catch (Exception e) {
                    System.out.println("The has been an error");
                    System.out.println("The year entered could possibly be out of range");

                }

            } else if (userInput == 3) {
                //Show Forests Lost Per Year
                System.out.println(" ");
                System.out.println("Data was Collected for Year 2002 through 2020");

                System.out.println(" ");
                try {
                    forestLossPerYear.showForestData();

                } catch (Exception e) {
                    System.out.println("There has been an error");
                    System.out.println("The year entered could possibly be out of range");

                }

            } else if (userInput == 4) {

                System.out.println(" ");
                System.out.println("Data was Collected for Year 2001 through 2020");

                try {
                    deforestationAnalyse.showDeforestationAnalyse();
                } catch (Exception e) {
                    System.out.println("An Error Occurred");
                    System.out.println("Kindly re-enter the Region name");

                }

            } else if (userInput == 5) {
                System.out.println(" ");
                System.out.println("===============================================");
                System.out.println("Calculating possible Afforestation Projects: ");
                try {
                    afforestationAnalyse.estimate();

                }catch (Exception e){
                    System.out.println("An Error Occurred");
                }

            } else if (userInput == 6 ) {
                try {
                    openYouTubeVideo.openVideo();

                }catch (Exception e){
                    System.out.println("Error Occurred");
                    System.out.println("MIght have bad internet connection");

                }
            } else if (userInput == 0) {

                break;

            } else{
                System.out.println(" ");
                System.out.println("Wrong Choice... Try again");
            }
        }
        }
    }
