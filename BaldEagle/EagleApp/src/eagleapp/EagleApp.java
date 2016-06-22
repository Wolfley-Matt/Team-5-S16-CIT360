
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt Wolfley
 */
public class menu {
    public static void main(String[] args) {
        
        
    // Display introduction and menu graphics
    //Introduction Print
    System.out.println("=================================");
    System.out.println("| This application is designed  |");
    System.out.println("| to help eagle enthusiasts to  |");
    System.out.println("| track and find eagles through |");
    System.out.println("| crowd reporting.              |");    
    System.out.println("=================================");
    //wait time in milliseconds, we could try building in a "Press Enter to Proceed" option if it's too long lol
    delay(6000);
    //Print Menu
    System.out.println("=================================");
    System.out.println("|   Eagle App                   |");
    System.out.println("=================================");
    System.out.println("| Options:                      |");
    System.out.println("|        1. Report Eagle        |");
    System.out.println("|        2. Find Eagle          |");
    System.out.println("|        3. Exit                |");
    System.out.println("=================================");
    System.out.println("Use Number To Make Selection");
    System.out.println("=================================");
    Scanner scanner = new Scanner(System.in);
    
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            // Perform "Report Eagle" case.
            break;
        case 2:
            // Perform "Find Eagle" case.
            break;
        case 3:
            // Perform "Exit" case.
            break;
        default:
            // Menu Reload.
    }
        
    }
    //Delay Method
    private static void delay(int millis) {
       try {
            Thread.sleep(millis);
        } catch (InterruptedException exp) {
        }
    
    }
}

