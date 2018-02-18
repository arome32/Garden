/* PA6 Inherently Horticulture Main Key
 * Author: Hannah Parraga
 * Program argument is a file name which contains a 
 * dimension of a garden object of the form:
 * 4x4
 * which can be any positive integer,
 * list of plant objects of the form: 
 * banana (1,3) 
 * where plant names can be any of:
 * banana, coconut, pine, tulip, daisy, rose, 
 * carrot, potato, tomato
 * and dimensions can be 0 to garden dimension - 1,
 * followed by a list of commands which can be any of:
 * CUT, PICK, HARVEST, PRINT, EAT, SMELL, PAPER, STATS
 * Then constructs a garden object with plant objects
 * at every location specified and calls methods on
 * garden for each command.
 */

import java.util.Scanner;
import java.io.*;

public class InherentlyHorticulture {
	public static void main(String[] args) {
		Scanner scanny = null;		
		try {
			scanny = new Scanner(new File(args[0]));
		} catch (IOException e) {
			System.err.println("File not found.");
			System.exit(1);
		}
	
		Garden garden = makeGarden(scanny);
		fillGarden(scanny, garden);
		parseCommands(scanny, garden);
	}


	/* Gets garden dimensions from Scanner and returns
	 * empty Garden objects
	 */ 
	private static Garden makeGarden(Scanner scanny) { 
		//get size of garden
		String size = scanny.nextLine();
		//check for valid input
		if (size.length() != 3 || 
				Integer.parseInt(size[0]) < 1 ||
				Integer.parseInt(size[2]) < 1) {
			System.err.println("Invalid garden dimensions.");
		}
	
	   return new Garden(size[0], size[2]);
	}


	/* Gets lines of plants and their locations from Scanner 
	 * Calls garden.plant() for each 
	 */
	private static void fillGarden(Scanner scanny, Garden garden) {
		//skip over blank line
		scanny.nextLine();
		String plantName;
		String[] deets;

		String line =  scanny.nextLine();
		while (line != "") {
			deets = line.split(" ");
			//preserve last index, join others
			for(int i = 0; i < deets.length - 2; i++) {
				plantName += deets[i].toLowerCase();
			}
			
			//deets[length - 1] is (x,y) 
			garden.plant(plantName, deets[deets.length - 1][1], 
					deets[deets.length - 1][3]);
			line = scanny.nextLine();
		}
	}


	/* Reads in Strings of commands from Scanner and
	 * calls each corresponding function on Garden
	 */
	private static void parseCommands(Scanner scanny, Garden garden) {
		String command;
		String[] g;

		while (scanny.hasNext()) {
			command = scanny.next().toLowerCase();
			if (command.equals("print")) {
				garden.print();
			} else if (command.equals("cut")) {
				garden.cut();
			} else if (command.equals("harvest")) {
				garden.harvest();
			} else if (command.equals("smell")) {
				garden.smell();
			} else if (command.equals("grow")) {
				garden.grow(scanny.nextInt());
			} else if (command.equals("stats")) {
				garden.stats();
			} else if (command.equals("eat")) {
				garden.eat(scanny.next().toLowerCase());
			} else if (command.equals("pick")) {
				garden.pick(scanny.next().toLowerCase());
			} else if (command.equals("paper")) {
				garden.paper(scanny.next().toLowerCase());
			} else {
				System.err.println("Invalid command.");
			}
		} 
	}
}
