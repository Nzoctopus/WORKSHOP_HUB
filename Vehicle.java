public class Vehicle {
    String Brand;
    String Model;
    int Year;
    public Vehicle(String brand, String model, int year) {
        Brand = brand;
        Model = model;
        Year = year;
    }
    public void Accelerate() {
        System.out.printf("I'm putting the pedal to the metal! (Let's hope the car doesnt explode)\n");
    }
    public void Brake() {
        System.out.printf("Woah! Slow down boy!\n");
    }
    public void Describe() {
        System.out.printf("I'm a %s %s made in %d\n", Brand, Model, Year);
    }
}
