package race;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolarPoweredCarTest {

	@Test
	public void shouldHaveRangeLimitedByMaintenance() {
		int topSpeedMph = 70;
		int maintenanceIntervalMiles = 500;
		Vehicle underTest = new SolarPoweredCar(topSpeedMph, maintenanceIntervalMiles);

		assertEquals(500, underTest.range());
	}

	@Test
	public void shouldBeAVehicle() {
		Automobile underTest = new Automobile(-1, -1, -1);

		assertTrue(underTest instanceof Vehicle);
	}
	
	@Test
	public void shouldKnowTopSpeedWhenLimitIsHigher() {
		int topSpeed = 45;
		Vehicle underTest = new Automobile(-1, -1, topSpeed);

		int speedLimit = 60;
		int speed = underTest.maxSpeed(speedLimit);

		assertEquals(45, speed);
	}
}
