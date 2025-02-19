package Vending;

public enum Coin {
    PENNY(1.0),
    NIKLE(5.0),
    DIME(10.0),
    QUATER(2.5);

    private final double value;

    Coin(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

}
