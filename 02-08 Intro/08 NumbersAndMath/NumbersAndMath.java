// floating point number is a number with decimals
public class NumbersAndMath
{
	public static void main( String[] args )
	{
		// description of task
		System.out.println( "I will now count my chickens:" );
		
		//number of hens	
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		
		//number of roosters
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
		
		// description of task
		System.out.println( "Now I will count the eggs:" );

		// number of eggs
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );

		// question to be tested
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

		// check if statement is true or false
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );

		// sum of 3 and 2 and print answer
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );

		//5 minus 7 and print answer
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
		
		// statement of suprise and revelation because 5 is in fact greater than -2
		System.out.println( "Oh, that's why it's false." );

		// statement asking for a deeper understanding of 5 > -2
		System.out.println( "How about some more." );

		// check if 5 is greater than -2
		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );

		// check if 5 is greater or equal to -2
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );

		// check if 5 is less than or equal to -2
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}