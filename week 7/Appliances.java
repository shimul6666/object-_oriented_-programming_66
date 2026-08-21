// Abstract base class representing a generic home appliance
abstract class Appliance {
    protected String brand;

    // Constructor to initialize the appliance brand
    public Appliance(String brand) {
        this.brand = brand;
    }

    // Method to display the brand status
    public void displayStatus() {
        System.out.println("Brand: " + this.brand);
    }

    // Common action to turn the appliance on
    public void turnOn() {
        System.out.println("Power ON");
    }

    // Common action to turn the appliance off
    public void turnOff() {
        System.out.println("Power OFF");
    }

    // Abstract method to be implemented by specific appliances
    public abstract void operate();
}

// Subclass 1: Washing Machine
class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes...");
    }
}

// Subclass 2: Refrigerator
class Refrigerator extends Appliance {
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Store food & beverages...");
    }
}