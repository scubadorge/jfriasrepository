//Jorge Frias (jfrias5@toromail.csudh.edu
import java.util.ArrayList;

public class CarOwner {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Car> cars;

    
    public CarOwner(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cars = new ArrayList<>();
    }
    

  
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the car owner.
     *
     * @param name The new name of the car owner.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the car owner.
     *
     * @return The address of the car owner.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the car owner.
     *
     * @param address The new address of the car owner.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the phone number of the car owner.
     *
     * @return The phone number of the car owner.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the car owner.
     *
     * @param phoneNumber The new phone number of the car owner.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the list of cars owned by the car owner.
     *
     * @return The list of cars owned by the car owner.
     */
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**
     * Adds a new car to the list of cars owned by the car owner.
     *
     * @param newCar The new car to add.
     */
    public void addCar(Car newCar) {
        this.cars.add(newCar);
    }	

    @Override
    public String toString() {
        return "CarOwner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cars=" + cars +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CarOwner carOwner = (CarOwner) obj;

        if (!name.equals(carOwner.name)) return false;
        if (!address.equals(carOwner.address)) return false;
        return phoneNumber.equals(carOwner.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (cars != null ? cars.hashCode() : 0);
        return result;
    }
}//class
