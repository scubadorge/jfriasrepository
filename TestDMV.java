
public class TestDMV {

	public static void main(String[] args) {
        // Create an engine
        Engine engine = new Engine("Gas", 300, 6, "Regular", "V6");

        // Create tires
        Tires tires = new Tires("Radial", 225, "Cross", 8.0, 32.0);

        // Create a car owner
        CarOwner carOwner = new CarOwner("John Doe", "123 Main St", "555-1234");

        // Create a car
        Car car = new Car("Toyota", "Camry", 2022, "Red", engine, tires, carOwner);

        // Set the owner for the car
        carOwner.addCar(car);

        // Create a DMV office
        DMV dmv = new DMV();
        dmv.setName("Local DMV");
        dmv.setAddress("456 Elm St");
        dmv.setPhoneNumber("555-5678");

        // Register the car at the DMV office
        dmv.addRegisteredCar(car);

        // Schedule an appointment at the DMV office
        dmv.addAppointment("Car registration renewal");

        // Print DMV information
        System.out.println("DMV Information:");
        System.out.println(dmv);

        // Print Car information
        System.out.println("\nCar Information:");
        System.out.println(car);

        // Print Car Owner information
        System.out.println("\nCar Owner Information:");
        System.out.println(carOwner);

        // Test equality of two cars
        Car car2 = new Car("Toyota", "Camry", 2022, "Red", engine, tires, carOwner);
        System.out.println("\nAre the cars equal? " + car.equals(car2));
    }

}
