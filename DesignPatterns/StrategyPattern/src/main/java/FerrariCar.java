import Strategy.SportsStrategy;

public class FerrariCar extends Vehicle{

    FerrariCar() {
        super(new SportsStrategy());
    }
}
