package States;

import Vending.Product;
import Vending.VendingMachine;

public class ReturnChangeState implements State{
    private final VendingMachine vendingMachine;
    public ReturnChangeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectProduct(Product product) {
        System.out.println("Product already give");
    }

    @Override
    public void dispense() {
        System.out.println("Product already given");
    }

    @Override
    public void returnChange() {
        double change = vendingMachine.getTotalPayment() - vendingMachine.getSelectedProduct().getPrice();
        if(change == 0) {
            System.out.println("No change applicable");
        } else {
            System.out.println("Here is your change: " + change);
        }
        vendingMachine.setIdleState();
        vendingMachine.resetProduct();
    }
}
