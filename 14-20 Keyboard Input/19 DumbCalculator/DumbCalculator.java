import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {

		Scanner inputman = new Scanner(System.in);

		double no1, no2, no3;

		System.out.print("What is your first number? ");
		no1 = inputman.nextDouble();

		System.out.print("What is your second number? ");
		no2 = inputman.nextDouble();

		System.out.print("What is your third number? ");
		no3 = inputman.nextDouble();

		System.out.println("\n( " + no1 + " + " + no2 + " + " + no3 +" ) / 2 is... " + (no1 + no2 + no3)/2);
	}
}