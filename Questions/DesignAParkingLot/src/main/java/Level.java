import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final int levelNumber;
    private final List<ParkingSpot> parkingSpots;

    public Level(int levelNumber, int capacity) {
        this.levelNumber = levelNumber;
        parkingSpots = new ArrayList<>();

        int carsCapacity = (int) (0.5 * capacity);
        int bikesCapacity = (int)(0.4 * capacity);

        for(int i = 1; i <= carsCapacity; i++) {
            parkingSpots.add(new ParkingSpot(VehicleType.CAR, i));
        }

        for(int i = carsCapacity + 1; i <= bikesCapacity; i++) {
            parkingSpots.add(new ParkingSpot(VehicleType.BIKE, i));
        }

        for(int i = bikesCapacity + 1; i <= capacity; i++) {
            parkingSpots.add(new ParkingSpot(VehicleType.TRUCK, i));
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for(ParkingSpot spot: parkingSpots) {
            if(spot.isAvailable() && spot.getVehicleType() == vehicle.getType()) {
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unParkVehicle(Vehicle vehicle) {
        for(ParkingSpot spot: parkingSpots) {
            if(!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)) {
                spot.unParkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public void displayAvailablitiy() {
        System.out.println("Level " + levelNumber + " Avaiablitiy: ");
        for(ParkingSpot spot : parkingSpots) {
            System.out.println("Spot : " + spot.getSpotNumber() + " is " + (spot.isAvailable() ? "Available For"  : "Occupied By ")+" "+spot.getVehicleType());
        }
    }
}
