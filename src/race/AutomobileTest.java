package race;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AutomobileTest {

	@Test
	public void shouldFindRangeAtTopSpeedForHybrid() {

		int fuelEcomonyMpg = 45;
		int tankCapacityG = 10;

		Automobile underTest = new Automobile(fuelEcomonyMpg, tankCapacityG, -1);
		// act
		int range = underTest.range();
		// assert
		Assert.assertEquals(450, range);
	}

	@Test
	public void shouldFindRangeForEscalade() {
		Automobile underTest = new Automobile(10, 30, -1);
		int range = underTest.range();
		assertEquals(300, range);
	}

	@Test
	public void shouldKnowTopSpeedWhenLimitIsHigher() {
		int topSpeed = 45;
		Automobile underTest = new Automobile(-1, -1, topSpeed);

		int speedLimit = 60;
		int speed = underTest.maxSpeed(speedLimit);

		assertEquals(45, speed);
	}
	
	@Test
	public void shouldKnowTopSpeedWhenLimitIsLower() {
		int topSpeed = 100;
		Automobile underTest = new Automobile(-1, -1, topSpeed);

		int speedLimit = 60;
		int speed = underTest.maxSpeed(speedLimit);

		assertEquals(70, speed);
	}
}
