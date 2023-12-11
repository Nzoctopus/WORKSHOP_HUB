public class Truck extends Vehicle {
    public Truck(String Brand, String Model, int Year, int Weight, int Wheels) {
        super(Brand, Model, Year, Weight, Wheels);
    }
    public void Describe() {
        System.out.printf("I'm a %s %s made in %d\n", Brand, Model, Year);
        System.out.printf("I'm a Truck, I weight %d kg and I have %d Wheels\n", Weight, Wheels);
    }
    public void Accelerate() {
        System.out.printf("My %s goes like this: broooooaaaaaAAAAAAARRRR!\n", Brand);
    }
    public void Brake() {
        System.out.printf("My %s is slowing :(\n", Brand);
    }
}
