package vehicle;

public class Vehicle {
    protected String licencePlate;
    protected VehicleType vehicleType;

    public Vehicle(String licencePlate, VehicleType vehicleType) {
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
    }

    public VehicleType getType() {
        return vehicleType;
    }
}
