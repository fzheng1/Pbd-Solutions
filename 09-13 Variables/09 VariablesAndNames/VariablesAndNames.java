public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

	// number of cars
        cars = 100;

	//number of people who can fit in the car
        space_in_a_car = 4.0;

	// number of available drivers
        drivers = 30;
	
	// number of passengers
        passengers = 90;
	
	// unused cars because not enough drivers
        cars_not_driven = cars - drivers;

	// used cars, 1 driver per car
        cars_driven = drivers;

	// maximum number of people who can be driven
        carpool_capacity = cars_driven * space_in_a_car;

	// average number of people per car to transport all passengers
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}