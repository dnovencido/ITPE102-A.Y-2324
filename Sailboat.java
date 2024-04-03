public class Sailboat extends Vehicle {
	private int length;

	public Sailboat() {
		super("wind", 0);
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void setPrice() {
		final int MAX = 100_000;

		if(price > MAX)
			price = MAX;
	}

	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		return ("The " + length) + " foot sailboat is powered by "
			+ getPowerSource() + "; it has " + getWheels() + " wheels and costs " +
			getPrice());
	}
}