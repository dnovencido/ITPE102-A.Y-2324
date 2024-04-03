public class Snake extends Animals {

	public Snake(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(name + " says Sssss!");
	}
}