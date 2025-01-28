public class Client {
    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[3];
        cars[0] = new SwiftCar();
        cars[1] = new FerrariCar();
        cars[2] = new SwiftCar();
        for(int i = 0; i < 3; i++) {
            cars[i].drive();
        }
    }
}
