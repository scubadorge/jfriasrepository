//Jorge Frias (jfrias5@toromail.csudh.edu
import java.util.ArrayList;

/**
 * Represents a Department of Motor Vehicles (DMV) office, which manages registered cars and appointments.
 */
public class DMV {
    /**
     * The name of the DMV office.
     */
    private String name;
    /**
     * The address of the DMV office.
     */
    private String address;
    /**
     * The phone number of the DMV office.
     */
    private String phoneNumber;
    /**
     * The list of cars registered at the DMV office.
     */
    private ArrayList<Car> registeredCars;
    /**
     * The list of appointments at the DMV office.
     */
    private ArrayList<String> appointments;

    /**
     * Constructs a DMV object with the given attributes.
     */
    public DMV() {
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
        this.registeredCars = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    /**
     * Returns the name of the DMV office.
     *
     * @return The name of the DMV office.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the DMV office.
     *
     * @param name The new name of the DMV office.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the DMV office.
     *
     * @return The address of the DMV office.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the DMV office.
     *
     * @param address The new address of the DMV office.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the phone number of the DMV office.
     *
     * @return The phone number of the DMV office.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the DMV office.
     *
     * @param phoneNumber The new phone number of the DMV office.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the list of cars registered at the DMV office.
     *
     * @return The list of cars registered at the DMV office.
     */
    public ArrayList<Car> getRegisteredCars() {
        return registeredCars;
    }

    /**
     * Adds a car to the list of registered cars.
     *
     * @param newCar The car to add to the list of registered cars.
     */
    public void addRegisteredCar(Car newCar) {
        this.registeredCars.add(newCar);
    }

    /**
     * Returns the list of appointments at the DMV office.
     *
     * @return The list of appointments at the DMV office.
     */
    public ArrayList<String> getAppointments() {
        return appointments;
    }

    /**
     * Adds a new appointment to the list of appointments.
     *
     * @param newAppointment The new appointment to add to the list of appointments.
     */
    public void addAppointment(String newAppointment) {
        this.appointments.add(newAppointment);
    }

    @Override
    public String toString() {
        return "DMV{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", registeredCars=" + registeredCars +
                ", appointments=" + appointments +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        DMV dmv = (DMV) obj;

        if (!name.equals(dmv.name)) return false;
        if (!address.equals(dmv.address)) return false;
        if (!phoneNumber.equals(dmv.phoneNumber)) return false;
        if (!registeredCars.equals(dmv.registeredCars)) return false;
        return appointments.equals(dmv.appointments);
    }
    
}//class
