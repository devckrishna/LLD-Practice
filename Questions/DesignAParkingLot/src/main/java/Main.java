import vehicle.Bike;
import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 80));
        parkingLot.addLevel(new Level(2, 100));

        Vehicle car = new Car("123");
        Vehicle bike = new Bike("456");
        Vehicle truck = new Truck("678");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(truck);

        parkingLot.displayAvailability();

        parkingLot.unParkVehicle(car);
        parkingLot.unParkVehicle(truck);

        parkingLot.displayAvailability();
    }
}
