//jfrias5@toromail.csudh.edu

/**
 * A class representing a dog, which is a subclass of the Animal class.
 *
 * @author Jorge Frias (jfrias5@toromail.csudh.edu)
 */
public class Dog extends Animal {
	
	/** The breed of the dog. */
	private String breed;
	
	/** The sound that a dog makes. */
	private String sound = "Bark";
	
	/**
	 * Constructs a new Dog object with the given name, age, weight, diet, and breed.
	 *
	 * @param name the name of the dog
	 * @param age the age of the dog
	 * @param weight the weight of the dog
	 * @param diet the diet of the dog
	 * @param breed the breed of the dog
	 */
	public Dog(String name, int age, double weight, String diet, String breed) {
		super(name, age, weight, diet);
		this.breed = breed;
	}
	
	/**
	 * Gets the breed of the dog.
	 *
	 * @return the breed of the dog
	 */
	public String getBreed() {
		return breed;
	}
	
	/**
	 * Sets the breed of the dog.
	 *
	 * @param breed the breed of the dog
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * @return the sound that a dog makes
	 */
	@Override
    public String makeSound() {
        return this.sound;
    }
	
}//class
