public class Main {
    public static void main(String[] args) {
        // Create an LG Washing Machine using polymorphism
        Appliance lg = new WashingMachine("LG");
        operate(lg);
        
        System.out.println(); // Prints a blank line between outputs
        
        // Create a Panasonic Refrigerator using polymorphism
        Appliance panasonic = new Refrigerator("Panasonic");
        operate(panasonic);
    }

    // Helper method demonstrating polymorphism to run any appliance
    public static void operate(Appliance appliance) {
        appliance.displayStatus();
        appliance.turnOn();
        appliance.operate();
        appliance.turnOff();
    }
}