//Jorge Frias (jfrias5@toromail.csudh.edu)
import java.util.ArrayList;

public class Car {
	
	/**
     * The make of the car.
     */
    private String make;
    /**
     * The model of the car.
     */
    private String model;
    /**
     * The year of the car.
     */
    private int year;
    /**
     * The color of the car.
     */
    private String color;
    /**
     * The engine of the car.
     */
    private Engine engine;
    /**
     * The tires of the car.
     */
    private Tires tires;
    /**
     * The owner of the car.
     */
    private CarOwner owner;
    

    public Car(String make, String model, int year, String color, Engine engine, Tires tires, CarOwner owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.tires = tires;
    }

    /**
     * Returns the make of the car.
     *
     * @return The make of the car.
     */
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tires getTires() {
        return tires;
    }
    
    public void setOwner(CarOwner owner) {
        this.owner = owner;
        this.owner.addCar(this);
    }

    public CarOwner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", tires=" + tires +
                ", owner=" + owner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (!make.equals(car.make)) return false;
        if (!model.equals(car.model)) return false;
        if (!engine.equals(car.engine)) return false;
        if (!tires.equals(car.tires)) return false;
        return owner != null ? owner.equals(car.owner) : car.owner == null;
    }

}//class

