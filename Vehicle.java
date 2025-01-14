public abstract class Vehicle {
	private String powerSource;
	private int wheels;
	protected double price;

	public Vehicle(String powerSource, int wheels) {
		setPowerSource(powerSource);
		setWheels(wheels);
		setPrice();
	}
	
	public String getPowerSource() {
		return powerSource;
	}

	public int getWheels() {
		return wheels;
	}

	public double getPrice() {
		return price;
	}

	public void setPowerSource(String source) {
		powerSource = source;
	}

	public void setWheels(int numWheels) {
		wheels = numWheels;
	}

	public abstract void setPrice();

}