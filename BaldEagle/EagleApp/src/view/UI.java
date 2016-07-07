package view;
import java.util.Scanner;

/**
*
* @author Danny Davis
*/

public class UI {

	// display menu with given titles and options
	public static String menu(String title, String[] options) {
		while (true) {
			System.out.println("=================================");
			displayLine(title, 3);
			System.out.println("=================================");
			displayLine("Options:", 3);
			int count = 1;
			for (String option : options) {
				displayLine(count + ". " + option, 8);
				count ++;
			}
			System.out.println("=================================");
			displayLine("Use Number To Make Selection",1);
			System.out.println("=================================");
			Scanner scanner = new Scanner(System.in);

			int choice = scanner.nextInt();
			if (choice > options.length || choice <= 0) {
				System.out.println("Please enter a number between 1 and " + options.length);
			} else {
				return options[choice - 1];
			}
		}
	}

	// display text with offset characters of white space
	private static void displayLine(String text, int offset) {
		String output = "|";
		for (int i = 0; i < offset; i++) {
			output += " ";
		}
		output += text;
		int charCount = text.length() + offset;
		while (charCount <= 30) {
			output += " ";
			charCount++;
		}
		output += "|";
		System.out.println(output);
	}

}
