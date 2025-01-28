package Strategy;

public class SportsStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is a sports vehicle");
    }
}
