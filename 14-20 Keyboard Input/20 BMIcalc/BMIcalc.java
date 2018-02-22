import java.util.Scanner;

public class BMIcalc {

	public static void main(String[] args) {

		Scanner inputman = new Scanner(System.in);

		int ft, inch, pound;
		
		double metricH, metricW, bmi;

		System.out.print("Your height (feet only): ");
		ft = inputman.nextInt();
		
		System.out.print("Your height (inches): ");
		inch = inputman.nextInt();

		System.out.print("Your weight in pounds: ");
		pound = inputman.nextInt();

		metricH = (ft * 0.3048) + (inch * 0.0254);
		metricW = pound * 0.453592;

		bmi = metricW/(metricH * metricH);

		System.out.println("Your BMI is " + bmi);


	}
}

