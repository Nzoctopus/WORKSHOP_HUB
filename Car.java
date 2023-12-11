public class Car extends Vehicle{
    public Car(String Brand, String Model, int Year, int Weight, int Wheels) {
        super(Brand, Model, Year, Weight, Wheels);
    }
    public void Describe() {
        System.out.printf("I'm a %s %s made in %d\n", Brand, Model, Year);
        System.out.printf("I'm a Car, I weight %d kg and I have %d Wheels\n", Weight, Wheels);
    }
    public void Accelerate() {
        System.out.printf("My %s goes like this: VROOOooooooom!\n", Brand);
    }
    public void Brake() {
        System.out.printf("My %s is slowing :(\n", Brand);
    }
}
