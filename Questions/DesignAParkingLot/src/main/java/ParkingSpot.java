import vehicle.Vehicle;
import vehicle.VehicleType;

public class ParkingSpot {
    private Vehicle parkedVehicle;
    private final VehicleType vehicleType;
    private final int spotNumber;

    public ParkingSpot(VehicleType vehicleType, int spotNumber) {
        this.vehicleType = vehicleType;
        this.spotNumber = spotNumber;
    }

    public synchronized boolean isAvailable() {
        return parkedVehicle == null;
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        if(isAvailable() && vehicle.getType() == vehicleType) {
            parkedVehicle = vehicle;
        } else {
            throw new IllegalArgumentException("Illegal vehicle type or spot already taken");
        }
    }

    public synchronized void unParkVehicle(Vehicle vehicle) {
        parkedVehicle = null;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
