import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {

		Scanner inputman = new Scanner(System.in);

		String name;
		int age;

		System.out.print("Hello. What is your name? ");
		name = inputman.next();

		System.out.print("\nHi " + name + "! How old are you? ");
		age = inputman.nextInt();

		System.out.println("\nDid you know that in five years you will be " + (age + 5) + " years old?");
		System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
	}
}