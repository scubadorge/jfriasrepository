//jfrias5@toromail.csudh.edu

/**
 * A class representing a horse, which is a subclass of the Animal class.
 *
 * @author Jorge Frias (jfrias5@toromail.csudh.edu)
 */
public class Horse extends Animal {
	
	/** The color of the horse. */
	private String color;
	
	/** The sound that a horse makes. */
	private String sound = "Neigh";
	
	/**
	 * Constructs a new Horse object with the given name, age, weight, diet, color, and sound.
	 *
	 * @param name the name of the horse
	 * @param age the age of the horse
	 * @param weight the weight of the horse
	 * @param diet the diet of the horse
	 * @param color the color of the horse
	 */
	public Horse(String name, int age, double weight, String diet, String color) {
		super(name, age, weight, diet);
		this.color = color;
	}
	
	/**
	 * Gets the color of the horse.
	 *
	 * @return the color of the horse
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Sets the color of the horse.
	 *
	 * @param color the color of the horse
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * @return the sound that a horse makes
	 */
	@Override
    public String makeSound() {
        return this.sound;
    }
	
}//class