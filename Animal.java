//jfrias5@toromail.csudh.edu

/**
 * A class representing an animal with properties such as name, age, weight, diet, and sound.
 *
 * @author Jorge Frias (jfrias5@toromail.csudh.edu)
 */
public class Animal {
	
	/** The name of the animal. */
	private String name;
	
	/** The age of the animal in years. */
	private int age;
	
	/** The weight of the animal in kilograms. */
	private double weight;
	
	/** The diet of the animal. */
	private String diet;
	
	/** The sound that the animal makes. */
	private String sound;
	
	/**
	 * Constructs a new Animal object with the given name, age, weight, and diet.
	 *
	 * @param name the name of the animal
	 * @param age the age of the animal
	 * @param weight the weight of the animal
	 * @param diet the diet of the animal
	 */
	public Animal(String name, int age, double weight, String diet) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.diet = diet;
	}
	
	/**
	 * Constructs a new Animal object with the given name, age, weight, diet, and sound.
	 *
	 * @param name the name of the animal
	 * @param age the age of the animal
	 * @param weight the weight of the animal
	 * @param diet the diet of the animal
	 * @param sound the sound that the animal makes
	 */
	public Animal(String name, int age, double weight, String diet, String sound) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.diet = diet;
		this.sound = sound;
	}
	
	/**
	 * Gets the name of the animal.
	 *
	 * @return the name of the animal
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the animal.
	 *
	 * @param name the name of the animal
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the age of the animal.
	 *
	 * @return the age of the animal
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * @return the diet
	 */
	public String getDiet() {
		return diet;
	}

	/**
	 * @param diet the diet to set
	 */
	public void setDiet(String diet) {
		this.diet = diet;
	}
	
	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * @return bull for now
	 */
	public String makeSound() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void eat() {
        System.out.println(this.name + " is eating.");
    }
	
}//class
