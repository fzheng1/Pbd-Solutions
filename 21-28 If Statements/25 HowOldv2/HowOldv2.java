import java.util.Scanner;

public class HowOldv2 {

	public static void main(String[] args) {

		Scanner inputman = new Scanner(System.in);
		
		System.out.println("Hey, What's your name? (Sorry, I keep forgetting.) ");
		String name = inputman.nextLine();

		System.out.println("Ok, " + name + ", how old are you? ");
		String ageS = inputman.nextLine();
		int age = Integer.parseInt(ageS);

		if (age < 16) {
			System.out.println("You can't drive, " + name + ".");
		}
		
		else if (age <= 17) {
			System.out.println("You can drive but not vote, " + name + ".");
		}
		
		
		else if (age <= 24) {
			System.out.println("You can vote but not rent a car, " + name + ".");
		}
		
		else {
			System.out.println("You can do pretty much anything, " + name + ".");
		}
	}
}