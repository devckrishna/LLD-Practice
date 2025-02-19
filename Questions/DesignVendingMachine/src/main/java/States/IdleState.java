package States;

import Vending.Product;
import Vending.VendingMachine;

public class IdleState implements State {
    private final VendingMachine vendingMachine;
    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        if(vendingMachine.inventory.get(product) > 0) {
            vendingMachine.setSelectedProduct(product);
            vendingMachine.inventory.put(product, vendingMachine.inventory.getOrDefault(product, 0) - 1);
            vendingMachine.setDispenseState();
            System.out.println(product.getName() + " Selected");
        } else {
            System.out.println("Product not available");
        }

    }

    @Override
    public void dispense() {
        System.out.println("Select Product first");
    }

    @Override
    public void returnChange() {
        System.out.println("Select product first");
    }
}
