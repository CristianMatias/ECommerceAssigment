package Control;

import Model.Bill.Bill;
import Model.Model;
import Model.Product.Product;
import Model.User.User;
import java.util.List;

/**
 * 
 * @author Cristian
 */
public class ControlImpl implements Control {
    private final Model model;

    public ControlImpl(Model model) {
        this.model = model;
    }

    @Override
    public boolean signUpUser(User user) {
        return model.signUpUser(user);
    }

    @Override
    public boolean logInUser(User user) {
        return model.logInUser(user);
    }

    @Override
    public boolean insertDefaultProducts() {
        return model.loadDefaultProducts();
    }

    @Override
    public List<Product> getAllProducts() {
        return model.getAllProducts();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return model.getProductsByName(name);
    }

    @Override
    public boolean addItemsToShoppingCart(User user) {
        return model.addItemsToShoppingCart(user);
    }

    @Override
    public List<Bill> getAllBills() {
        return model.getAllBills();
    }

    @Override
    public boolean createNewBill(Bill bill) {
        return model.createNewBill(bill);
    }

    @Override
    public boolean validateAllBills(Bill bill) {
        return model.validateAllBills(bill);
    }
    
    
}
