
public class ZooKeeper {

	public static void main(String[] args) {
		// Instantiate different animal objects
        Animal lion = new Lion("Simba", 5, 190.0, "carnivore");
        Animal dog = new Dog("Buddy", 3, 20.0, "omnivore", "Labrador");
        Animal cat = new Cat("Whiskers", 2, 5.0, "carnivore", "gray");
        Animal horse = new Horse("Spirit", 7, 500.0, "herbivore", "brown");

        // Call their methods to observe the output
        System.out.println("Lion: Name = " + lion.getName() + ", Age = " + lion.getAge() + ", Weight = " + lion.getWeight() + ", Diet = " + lion.getDiet() + ", Sound = " + lion.makeSound());
        lion.eat();
        System.out.println();

        System.out.println("Dog: Name = " + dog.getName() + ", Age = " + dog.getAge() + ", Weight = " + dog.getWeight() + ", Sound = " + dog.makeSound());
        dog.eat();
        System.out.println();

        System.out.println("Cat: Name = " + cat.getName() + ", Age = " + cat.getAge() + ", Weight = " + cat.getWeight() + ", Sound = " + cat.makeSound());
        cat.eat();
        System.out.println();

        System.out.println("Horse: Name = " + horse.getName() + ", Age = " + horse.getAge() + ", Weight = " + horse.getWeight() + ", Sound = " + horse.getSound());
        horse.eat();
        System.out.println();

        // Demonstrate polymorphism by using an Animal reference to holding different animal objects and calling their makeSound() method
        Animal[] animals = {lion, dog, cat, horse};
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

	}//main

}//class
