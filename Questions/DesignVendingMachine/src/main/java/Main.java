import Vending.Coin;
import Vending.Product;
import Vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        Product coke = new Product("Coke", 10.0);
        Product chocolate = new Product("Chocolate", 5.0);
        Product iceCream = new Product("Ice Cream", 15.0);

        VendingMachine vendingMachine = VendingMachine.getInstance();
        vendingMachine.add(coke, 1);
        vendingMachine.add(chocolate, 2);
        vendingMachine.add(iceCream, 3);

        // Get First Coke
        vendingMachine.selectProduct(coke);

        vendingMachine.insertCoin(Coin.NIKLE);
        vendingMachine.insertCoin(Coin.NIKLE);
        vendingMachine.insertCoin(Coin.PENNY);

        vendingMachine.dispense();

        vendingMachine.returnChange();


        // Select Coke although it's unavailable
        vendingMachine.selectProduct(coke);

        vendingMachine.insertCoin(Coin.NIKLE);
        vendingMachine.insertCoin(Coin.NIKLE);
        vendingMachine.insertCoin(Coin.PENNY);

        vendingMachine.dispense();

        vendingMachine.returnChange();

        // Get ice cream
        vendingMachine.selectProduct(iceCream);

        vendingMachine.insertCoin(Coin.NIKLE);

        vendingMachine.dispense();

        vendingMachine.returnChange();

        // Get ice cream but money not enough
        vendingMachine.selectProduct(iceCream);

        vendingMachine.insertCoin(Coin.QUATER);

        vendingMachine.dispense();

        vendingMachine.returnChange();
    }
}
