package Strategy;

public class NormalStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("This is a normal vehicle");
    }
}
