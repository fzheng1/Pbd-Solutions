import java.util.Scanner;

public class HowOld {
	
	public static void main(String[] args) {
	
		// add scanner
		Scanner inputman = new Scanner(System.in);
		
		// stored variables
		String name;
		int age;

		// get name from input
		System.out.print("Hey, what's your name? ");
		name = inputman.next();
		
		// get age from input
		System.out.print("\nOk, " + name + ", how old are you? ");
		age = inputman.nextInt();
		
		// can't drive if under 16
		if (age < 16) {
			System.out.println("\nYou can't drive, " + name + ".");
		}

		// can't vote if under 18
		if (age < 18) {
			System.out.println("\nYou can't vote, " + name + ".");
		}

		// can rent car if under 25
		if (age < 25) {
			System.out.println("\nYou can't rent a car, " + name + ".");
		}

		// if age is greater than 25 can do anything legal
		if (age >= 25) {
			System.out.println("You can do anything that's legal, " + name + ".");
		}

	}
}
