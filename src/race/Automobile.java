package race;

public class Automobile extends Vehicle {

	int fuelEcomonyMpg;
	int tankCapacityG;

	public Automobile(int fuelEcomonyMpg, int tankCapacityG, int topSpeedMph) {
		super(topSpeedMph);
		this.fuelEcomonyMpg = fuelEcomonyMpg;
		this.tankCapacityG = tankCapacityG;
	}

	@Override
	public int range() {
		return fuelEcomonyMpg * tankCapacityG;
	}

	

}
