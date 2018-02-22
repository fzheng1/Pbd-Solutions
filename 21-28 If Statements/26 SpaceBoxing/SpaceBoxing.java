import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter you current earth weight: ");
		String weightS = input.nextLine();
		int weight = Integer.parseInt(weightS);
		
		System.out.println("I have information for the following planets:");
		System.out.println("   1. Venus   2. Mars    3. Jupiter");
		System.out.println("   4. Saturn  5. Uranus  6. Neptune\n");

		System.out.print("What planet are you visiting? ");
		String numS = input.nextLine();
		int num = Integer.parseInt(numS);
		
		// venus
		if (num == 1) {
		
			double newWeight = weight*0.78;
			System.out.println("\nYour weight will be " + newWeight + " pounds on that planet.");
		}

		// Mars
		else if (num == 2) {
		
			double newWeight = weight * 0.39;
			System.out.println("Your weight will be " + newWeight + " pounds on that planet.");
		}

		// Jupiter		
		else if (num == 3) {
		
			double newWeight = weight * 2.65;
			System.out.println("Your weight will be " + newWeight + " pounds on that planet.");
		}

		// Saturn
		else if (num == 4) {
		
			double newWeight = weight * 1.17;
			System.out.println("Your weight will be " + newWeight + " pounds on that planet.");
		
		}

		// Uranus
		else if (num == 5) {
		
			double newWeight = weight * 1.05;
			System.out.println("Your weight will be " + newWeight + " pounds on that planet.");
		
		}

		// neptune
		else if (num == 6) {
		
			double newWeight = weight * 1.23;
			System.out.println("Your weight will be " + newWeight + " pounds on that planet.");
		
		}

		// if not a planet
		else {
			System.out.println("That's not a planet");
		}
		
		
		
		
	}	
}		