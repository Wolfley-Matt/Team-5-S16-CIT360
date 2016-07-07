package controller;

import java.util.Scanner;

import view.UI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt Wolfley & Danny Davis
 */
public class EagleApp {
	public static void main(String[] args) {
		boolean repeat = true;
		// Display intr oduction and menu graphics
		// Introduction Print
		System.out.println("=================================");
		System.out.println("| This application is designed  |");
		System.out.println("| to help eagle enthusiasts to  |");
		System.out.println("| track and find eagles through |");
		System.out.println("| crowd reporting.              |");
		System.out.println("=================================");
		// wait time in milliseconds, we could try building in a "Press Enter to
		// Proceed" option if it's too long lol
		delay(6000);

		do {
			// Print Menu
			String[] options = {"Report Eagle","Find Eagle","Exit"};
			String choice = view.UI.menu("Main Menu", options);
			switch (choice) {
			case "Report Eagle":
                            
				view.reportEagle.report();
				break;
			case "Find Eagle":
				// Perform "Find Eagle" case.
				break;
			case "Exit":
				// Perform "Exit" case.
				repeat = false;
				break;
			default:
				// Menu Reload.
				System.out.println("Please enter a valid number.");
			}
		} while (repeat);

	}

	// Delay Method
	private static void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException exp) {
		}

	}

}
