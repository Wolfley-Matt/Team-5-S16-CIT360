/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author Brandon Webb
 */
public class reportEagle {
        public static void report() {
            
       
            System.out.println("What County Are You In?");
            
            //This is where the counties need to be printed out to using deserialization
            
            Scanner scanner_1 = new Scanner(System.in); //Waits for User Input
            //If data is not a number reask user
            int county_choice = scanner_1.nextInt(); //Assigns the user input to a variable 
           
            //Compare the county_choice to the county list and put in variable
            
            System.out.println("What Kind of Eagle Did You See?");
            
            //This is where the type of eagle needs to be printed out to using deserialization
            
            Scanner scanner_2 = new Scanner(System.in); //Waits for User Input
            //If data is not a number reask user
            int eagle_type = scanner_2.nextInt(); //Assigns the user input to a variable 
           
            //Compare the eagle_type to the eagle list and put in variable
            
            System.out.println("When Did You See It?");
                        
            Scanner scanner_3 = new Scanner(System.in); //Waits for User Input
            String when = scanner_3.toString(); //Assigns the user input to a variable 
           
            //Testing
            System.out.println("What Size Was The Eagle");
            System.out.println("1. Baby");
            System.out.println("2. Youth");
            System.out.println("3. Adult");
            
            Scanner scanner_4 = new Scanner(System.in);
            int eagle_size = scanner_4.nextInt();
            
            switch (eagle_size) {
                case 1:
                break;
                case 2:
                break;
                case 3:
                break;
            }
            
            
           
            
            
            
            //At the End this would be the statement
            //INSERT INTO table_name VALUES (final_county_choice, final_eagle_type, time_found, eagle_size, spot_found);
          
            
        }

        
    
    
    private static void list_eagles() { //This function will go out to the database and grab a list of known eagles
        
    }
}

