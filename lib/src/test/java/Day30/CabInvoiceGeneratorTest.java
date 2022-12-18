package Day30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CabInvoiceGeneratorTest {

	@Test
	public void whenGivenDistanceAndTimeShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		CabInvoiceGenerator CIG = new CabInvoiceGenerator();
		double totalFare = CIG.calculateFare(distance, time);
		System.out.println("Total Fare is:" + totalFare);
		Assertions.assertEquals(25, totalFare, 0.0);
	}

	/**
	 * Method to calculate minimum fare for the given ride for that minimum fare we
	 * have taken distance as 0.1 and time is 2.
	 */
	@Test
	public void whenGivenLessDistanceOrTimeShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		CabInvoiceGenerator CIG = new CabInvoiceGenerator();

		double fare = CIG.calculateFare(distance, time);
		System.out.println("Minimum Fare = " + fare);
		Assertions.assertEquals(5, fare, 0.0);
	}

	@Test
	public void whenGivenMultipleRidesShouldReturnTotalFare() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		CabInvoiceGenerator CIG = new CabInvoiceGenerator();
		double totalFare = CIG.calculateTotalFare(rides);
		System.out.println("Total Fare = " + totalFare);
		Assertions.assertEquals(30, totalFare, 0.0);
	}
}
