package view;

import java.util.Scanner;

/**
 *
 * @author Danny Davis
 */

public class UI {
	
	private static final int lineLength = 50;

	// display menu with given titles and options
	public static String menu(String title, String[] options) {
		while (true) {
			printLineBreak();
			displayLine(title, 3);
			String result = menu(options);
			if (result != null) {
				return result;
			}
		}
	}

	// display menu with given titles and options
	public static String menu(String[] title, String[] options) {
		while (true) {
			printLineBreak();
			for (String line : title) {
				displayLine(line, 3);
			}
			String result = menu(options);
			if (result != null) {
				return result;
			}
		}
	}

	// display text with offset characters of white space
	public static void displayLine(String text, int offset) {
		String output = "|";
		for (int i = 0; i < offset; i++) {
			output += " ";
		}
		output += text;
		int charCount = text.length() + offset;
		while (charCount <= lineLength) {
			output += " ";
			charCount++;
		}
		output += "|";
		System.out.println(output);
	}

	private static String menu(String[] options) {
		printLineBreak();
		displayLine("Options:", 3);
		int count = 1;
		for (String option : options) {
			displayLine(count + ". " + option, 8);
			count++;
		}
		printLineBreak();
		displayLine("Use Number To Make Selection", 1);
		printLineBreak();
		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();
		if (choice > options.length || choice <= 0) {
			System.out.println("Please enter a number between 1 and " + options.length);
			return null;
		} else {
			return options[choice - 1];
		}
	}
	
	//simply display text;
	public static void display(String[] output){
		printLineBreak();
		for(String line:output){
			displayLine(line,1);
		}
		printLineBreak();
	}
	
	//print a line of ============
	private static void printLineBreak(){
		String output = "";
		for(int i = 0;i<lineLength+3;i++){
			output += "=";
		}
		System.out.println(output);
	}

}
