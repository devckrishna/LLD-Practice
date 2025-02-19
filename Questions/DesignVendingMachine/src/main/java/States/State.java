package States;

import Vending.Product;

public interface State {
    public void selectProduct(Product product);

    public void dispense();

    public void returnChange();

}
