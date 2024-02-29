//Jorge Frias (jfrias5@toromail.csudh.edu
public class Tires {
    /**
     * The type of tire (e.g., "radial", " bias", "performance").
     */
    private String tireType;

    /**
     * The size of the tire (e.g., 225/50R16).
     */
    private int size;

    /**
     * The tread pattern of the tire (e.g., "cross", "dot", "arrow").
     */
    private String treadPattern;

    /**
     * The depth of the tread grooves (in millimeters).
     */
    private double treadDepth;

    /**
     * The pressure of the tire (in psi).
     */
    private double pressure;

    /**
     * Creates a new Tires object with the specified attributes.
     *
     * @param tireType      The type of tire.
     * @param tireSize      The size of the tire.
     * @param treadPattern  The tread pattern of the tire.
     * @param treadDepth    The depth of the tread grooves (in millimeters).
     * @param pressure      The pressure of the tire (in psi).
     */
    public Tires(String tireType, int tireSize, String treadPattern, double treadDepth, double pressure) {
        this.tireType = tireType;
        this.size = tireSize;
        this.treadPattern = treadPattern;
        this.treadDepth = treadDepth;
        this.pressure = pressure;
    }

    /**
     * Returns the type of tire.
     *
     * @return The type of tire.
     */
    public String getTireType() {
        return tireType;
    }

    /**
     * Sets the type of tire.
     *
     * @param tireType  The new type of tire.
     */
    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    /**
     * Returns the size of the tire.
     *
     * @return The size of the tire.
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the size of the tire.
     *
     * @param tireSize  The new size of the tire.
     */
    public void setSize(int tireSize) {
        this.size = tireSize;
    }

    /**
     * Returns the tread pattern of the tire.
     *
     * @return The tread pattern of the tire.
     */
    public String getTreadPattern() {
        return treadPattern;
    }

    /**
     * Sets the tread pattern of the tire.
     *
     * @param treadPattern  The new tread pattern of the tire.
     */
    public void setTreadPattern(String treadPattern) {
        this.treadPattern = treadPattern;
    }

    /**
     * Returns the depth of the tread grooves (in millimeters).
     *
     * @return The depth of the tread grooves (in millimeters).
     */
    public double getTreadDepth() {
        return treadDepth;
    }

    /**
     * Sets the depth of the tread grooves (in millimeters).
     *
     * @param treadDepth  The new depth of the tread grooves (in millimeters).
     */
    public void setTreadDepth(double treadDepth) {
        this.treadDepth = treadDepth;
    }

    /**
     * Returns the pressure of the tire (in psi).
     *
     * @return The pressure of the tire (in psi).
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * Sets the pressure of the tire (in psi).
     *
     * @param pressure  The new pressure of the tire
     */
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Tires{" +
                "tireType='" + tireType + '\'' +
                ", size=" + size +
                ", treadPattern='" + treadPattern + '\'' +
                ", treadDepth=" + treadDepth +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Tires tires = (Tires) obj;

        if (!tireType.equals(tires.tireType)) return false;
        if (size != tires.size) return false;
        if (!treadPattern.equals(tires.treadPattern)) return false;
        if (Double.compare(tires.treadDepth, treadDepth) != 0) return false;
        return Double.compare(tires.pressure, pressure) == 0;
    }
    
}//class
