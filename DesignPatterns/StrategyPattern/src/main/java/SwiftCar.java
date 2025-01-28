import Strategy.DriveStrategy;
import Strategy.NormalStrategy;

public class SwiftCar extends Vehicle{

    SwiftCar() {
        super(new NormalStrategy());
    }
}
