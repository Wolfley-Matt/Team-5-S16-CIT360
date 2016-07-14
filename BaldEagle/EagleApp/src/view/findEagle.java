/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EagleApp;

/**
 * 
 * @author Danny Davis
 */
public class findEagle {

	public static void find() {

		// TODO look up counties
		String[] counties = { "Boise", "Rexburg", "Madison" };

		// select a county from the list
		String county = UI.menu("Select County", counties);

		findEagles(county);

	}

	public static void findEagles(String county) {
		// TODO look up eagles in county and convert the list to a String[]
		String[] eagles = { "Bald Eagle Jan 21,2016", "Bald Eagle Jan 21, 2015", "Bald Eagle Jan 21, 2014",
				"Bald Eagle Jan 21, 2013" };

		// select an eagle from the list
		String eagle = UI.menu("Find an Eagle", eagles);

		// TODO get the details for that eagle
		String[] details = { "Details:","1. SIZE", "2. LAST SEEN", "3. KIND" };

		// display the details
		String[] options = { "Find another eagle from same county.", "Back to Main"};
		String choice = UI.menu(details, options);

		// handle the input from the previous menu
		switch (choice) {
		case "Find another eagle from same county.":
			findEagles(county);
			break;
		case "Back to Main":
			break;
		}
	}

}
