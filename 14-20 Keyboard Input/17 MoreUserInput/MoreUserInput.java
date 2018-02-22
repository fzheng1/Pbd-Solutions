import java.util.Scanner;	

public class MoreUserInput {
	
	public static void main(String[] args) {
		
		Scanner inputman = new Scanner(System.in);
		
		String firstName, lastName, studentID, login;
		int grade;
		double gpa;
		
		System.out.println("Please enter the following information so I can sell it for a profit! \n");
		// System.out.println();

		System.out.print("First name: ");
		firstName = inputman.next();

		System.out.print("Last name: ");
		lastName = inputman.next();

		System.out.print("Grade (9-12): ");		
		grade = inputman.nextInt();		

		System.out.print("Student ID: ");
		studentID = inputman.next();

		System.out.print("Login: ");
		login = inputman.next();

		System.out.print("GPA (0.0-4.0): ");
		gpa = inputman.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("\t Login: " + login);
		System.out.println("\t ID:    " + studentID);
		System.out.println("\t Name:  " + firstName + ", " + lastName);
		System.out.println("\t GPA:   " + gpa);
		System.out.println("\t Grade: " + grade);
	}
}
