//Jorge Frias (jfrias5@toromail.csudh.edu)
/**
 * Represents an engine with various attributes.
 */
public class Engine {
    /**
     * The type of the engine.
     */
    private String type;
    /**
     * The horsepower of the engine.
     */
    private int horsepower;
    /**
     * The number of cylinders in the engine.
     */
    private int cylinders;
    /**
     * The fuel type used by the engine.
     */
    private String fuelType;
    /**
     * The model of the engine.
     */
    private String model;

    /**
     * Constructs an Engine object with the given attributes.
     *
     * @param type        The type of the engine.
     * @param horsePower  The horsepower of the engine.
     * @param cylinders   The number of cylinders in the engine.
     * @param fuelType    The fuel type used by the engine.
     * @param model       The model of the engine.
     */
    public Engine(String type, int horsePower, int cylinders, String fuelType, String model) {
        this.type = type;
        this.horsepower = horsePower;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
        this.model = model;
    }

    /**
     * Returns the type of the engine.
     *
     * @return The type of the engine.
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the horsepower of the engine.
     *
     * @return The horsepower of the engine.
     */
    public int getHorsePower() {
        return horsepower;
    }

    /**
     * Returns the number of cylinders in the engine.
     *
     * @return The number of cylinders in the engine.
     */
    public int getCylinders() {
        return cylinders;
    }

    /**
     * Returns the fuel type used by the engine.
     *
     * @return The fuel type used by the engine.
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Returns the model of the engine.
     *
     * @return The model of the engine.
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns a string representation of the engine.
     *
     * @return A string representation of the engine.
     */
    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsepower=" + horsepower +
                ", cylinders=" + cylinders +
                ", fuelType='" + fuelType + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    /**
     * Compares this object to the given object for equality.
     *
     * @param obj The object to compare to.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Engine engine = (Engine) obj;

        if (!type.equals(engine.type)) return false;
        if (horsepower != engine.horsepower) return false;
        if (cylinders != engine.cylinders) return false;
        if (!fuelType.equals(engine.fuelType)) return false;
        return model.equals(engine.model);
    }
    
}//class