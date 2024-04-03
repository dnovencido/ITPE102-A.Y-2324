import java.util.ArrayList;

public class AnimalsReference {
	public static void main(String[] args) {
		ArrayList<Animals> animalsList = new ArrayList<Animals>();
		
		Animals animalRef;

		animalRef = new Dog("Bruno");
		animalsList.add(animalRef);

		animalRef = new Cow("Cowy");
		animalsList.add(animalRef);

		animalRef = new Snake("Snaky");
		animalsList.add(animalRef);

	    for(Animals animal: animalsList) {
	       animal.speak();
	    }
	}
}