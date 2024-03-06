//jfrias5@toromail.csudh.edu
 
/**
 * A class representing a lion, which is a subclass of the Animal class.
 *
 * @author Jorge Frias (jfrias5@toromail.csudh.edu)
 */
public class Lion extends Animal {
	
	/** The sound that a lion makes. */
	private String sound = "Roar";
	
	/**
	 * Constructs a new Lion object with the given name, age, weight, and diet.
	 *
	 * @param name the name of the lion
	 * @param age the age of the lion
	 * @param weight the weight of the lion
	 * @param diet the diet of the lion
	 */
	public Lion(String name, int age, double weight, String diet) {
		super(name,age,weight,diet);
	}
	
	/**
	 * Makes the lion hunt for prey.
	 */
	public void hunt() {
        System.out.println("The lion is hunting for prey.");
    }
	
	/**
	 *
	 * @return the sound that a lion makes
	 */
	@Override
    public String makeSound() {
        return this.sound;
    }
	
}//class
