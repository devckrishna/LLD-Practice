package Vending;

import States.*;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private final State idleState;
    private final State dispenseState;
    private final State returnChangeState;
    private State currentState;
    private Product selectProduct;
    private double totalPayment;
    public Map<Product, Integer> inventory;

    private static VendingMachine instance;

    public synchronized static VendingMachine getInstance() {
        if(instance == null) {
            return new VendingMachine();
        }
        return instance;
    }

    private VendingMachine() {
        idleState = new IdleState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
        selectProduct = null;
        totalPayment = 0.0;
        inventory = new HashMap<>();
    }

    public void add(Product product, int qty) {
        inventory.putIfAbsent(product, 0);
        inventory.put(product, inventory.getOrDefault(product, 0) + 1);
        System.out.println("===== Product added: " + product.getName() + " ========");
    }

    public void selectProduct(Product product) {
        currentState.selectProduct(product);
    }

    public void setSelectedProduct(Product product) {
        selectProduct = product;
    }

    public void insertCoin(Coin coin) {
        totalPayment += coin.getValue();
        System.out.println("Rs. " + coin.getValue() + " Coin added");
    }

    public void insertNote(Note note) {
        totalPayment += note.getValue();
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public Product getSelectedProduct() {
        return selectProduct;
    }

    public void dispense() {
        currentState.dispense();
    }

    public void returnChange() {
        currentState.returnChange();
    }

    public void resetProduct() {
        selectProduct = null;
        totalPayment = 0.0;
    }

    public void setIdleState() {
        currentState = idleState;
    }

    public void setDispenseState() {
        currentState = dispenseState;
    }

    public void setReturnChangeState() {
        currentState = returnChangeState;
    }
}
