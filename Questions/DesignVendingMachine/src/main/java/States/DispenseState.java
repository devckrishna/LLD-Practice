package States;

import Vending.Product;
import Vending.VendingMachine;

public class DispenseState implements State {
    private final VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product already selected");
    }

    @Override
    public void dispense() {
        if(vendingMachine.getTotalPayment() >= vendingMachine.getSelectedProduct().getPrice()) {
            System.out.println("Here is your product -> " + vendingMachine.getSelectedProduct().getName());
            vendingMachine.setReturnChangeState();
        } else {
            System.out.println("Not enough money added");
            vendingMachine.resetProduct();
            vendingMachine.setIdleState();
        }
    }

    @Override
    public void returnChange() {
        System.out.println("Recieve product first");
    }
}
