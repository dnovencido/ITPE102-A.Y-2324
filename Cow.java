public class Cow extends Animals {

	public Cow(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(name + " says Moo!");
	}
}