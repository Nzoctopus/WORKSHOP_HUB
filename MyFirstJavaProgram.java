
public class MyFirstJavaProgram {
    public static void main(String []args) {
        Vehicle auto1 = new Vehicle("Volkswagen", "Scirocco", 2008, 1500, 24);
        auto1.Describe();
        auto1.Accelerate();
        System.out.printf("\n");
        Truck auto2 = new Truck("Scania", "Frostfire", 2022, 6000, 6);
        auto2.Describe();
        auto2.Accelerate();
        auto2.Brake();
        System.out.printf("\n");
        Car auto3 = new Car("Ferrari", "Testarossa", 1984, 1656, 4);
        auto3.Describe();
        auto3.Accelerate();
        auto3.Brake();
        System.out.printf("\n");
        Motorcycle auto4 = new Motorcycle("Kawazaki", "Ninja", 2013, 170, 2);
        auto4.Describe();
        auto4.Accelerate();
        auto4.Brake();
    }
}
