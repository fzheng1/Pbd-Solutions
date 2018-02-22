import java.util.Scanner;

public class TheForgetfulMachine {

	public static void main(String[] args) {

		Scanner inputman = new Scanner(System.in);
		System.out.println("Give me a word!");
		inputman.next();
		System.out.println("Give me a second word");
		inputman.next();
		System.out.println();
		System.out.println("Great, now your favorite number?");
		inputman.next();
		System.out.println("And your second favorite number...");
		inputman.next();
		System.out.println();
		System.out.println("Whew! Wasn't that fun?");
	}
}