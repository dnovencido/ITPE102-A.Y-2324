public class DemoVehicle {
	public static void main(String[] args) {
		Sailboat boat = new Sailboat();
		boat.setLength(10);
		boat.price = 20000;

		System.out.println("Boat description: " + boat.toString());

		Bicycle bike = new Bicycle();
		bike.price = 2000;
		System.out.println("Bicycle description: " + bike.toString());
	}
}