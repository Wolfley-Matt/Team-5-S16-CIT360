/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view; //T

import java.util.Scanner;

/**
 *
 * @author Brandon Webb
 */
public class reportEagle {
        public static void report() {
      
            //OPTION 1
            Scanner scanner_1 = new Scanner(System.in); //Waits for User Input
            int county_choice;
            do {
                System.out.println("What County Are You In?");
                //This is where the counties need to be printed out to using deserialization
                while (!scanner_1.hasNextInt()) {
                    System.out.println("That's not a number! Please enter a valid number");
                    scanner_1.next();
                }
                county_choice = scanner_1.nextInt();
                } 
            while (county_choice <= 0);
                System.out.println("Thank you! Your reponse was " + county_choice);
            //Compare the county_choice to the county list and put in variable
            
            //OPTION 2
            Scanner scanner_2 = new Scanner(System.in); //Waits for User Input
            int eagle_type;
            do {
                System.out.println("What Kind of Eagle Did You See?");
            //This is where the type of eagle needs to be printed out to using deserialization
                while (!scanner_2.hasNextInt()) {
                    System.out.println("That's not a number! Please enter a valid number");
                    scanner_2.next();
                }
                eagle_type = scanner_2.nextInt();
            } while (eagle_type <= 0);
                System.out.println("Thank you! Your reponse was " + county_choice);
            //Compare the eagle_type to the eagle list and put in variable
            
            //OPTION 3
            System.out.println("When Did You See It?");
            Scanner scanner_3 = new Scanner(System.in); //Waits for User Input
            String when = scanner_3.toString(); //Assigns the user input to a variable 
           
            //OPTION 4
            
            
            Scanner scanner_4 = new Scanner(System.in);
            int eagle_size;
            do{
                System.out.println("What Size Was The Eagle");
                System.out.println("1. Baby");  
                System.out.println("2. Youth");
                System.out.println("3. Adult");
                while(!scanner_4.hasNextInt()) {
                    System.out.println("That's not a number! Please enter a valid number");
                    scanner_4.next();
                }
                eagle_size = scanner_4.nextInt();
            } while (eagle_size <= 0);
            
            switch (eagle_size) {
                case 1:
                    //Store the eagle size
                break;
                case 2:
                    //Sotre the eagle size
                break;
                case 3:
                    //Store the eagle size
                break;
            }
            
            Scanner scanner_5 = new Scanner(System.in);
            String spot_found = scanner_5.nextLine();
            
            
            
           
            
            
            
            //At the End this would be the statement
            //INSERT INTO table_name VALUES (final_county_choice, final_eagle_type, time_found, eagle_size, spot_found);
          
            
        }

        
    
    
    private static void list_eagles() { //This function will go out to the database and grab a list of known eagles
        
    }
}

