import java.util.Scanner;

public class AskingQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int feetH;
		int inchH;
		double weight;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.print("How many feet tall are you? ");
		feetH = keyboard.nextInt();
		
		System.out.print("How many inches? ");
		inchH = keyboard.nextInt();

		System.out.print("How much do you weigh? ");
		weight = keyboard.nextDouble();

		System.out.println("So you're " + age + " years old, " + feetH + "'" + inchH + "\" tall and " + weight + " pounds heavy.");
	}
}