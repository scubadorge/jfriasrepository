//jfrias5@toromail.csudh.edu

/**
 * A class representing a cat, which is a subclass of the Animal class.
 *
 * @author Jorge Frias (jfrias5@toromail.csudh.edu)
 */
public class Cat extends Animal {
	
	/** The color of the cat. */
	private String color;
	
	/** The sound that a cat makes. */
	private String sound = "Meow";
	
	/**
	 * Constructs a new Cat object with the given name, age, weight, diet, and color.
	 *
	 * @param name the name of the cat
	 * @param age the age of the cat
	 * @param weight the weight of the cat
	 * @param diet the diet of the cat
	 * @param color the color of the cat
	 */
	public Cat(String name, int age, double weight, String diet, String color) {
		super(name, age, weight, diet);
		this.color = color;
	}
	
	/**
	 * Gets the color of the cat.
	 *
	 * @return the color of the cat
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Sets the color of the cat.
	 *
	 * @param color the color of the cat
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 *
	 * @return the sound that a cat makes
	 */
	@Override
    public String makeSound() {
        return this.sound;
    }
	
}//class
