package Model;

import Model.Bill.Bill;
import Model.Product.Product;
import Model.User.User;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface Model {
    public boolean signUpUser(User user);
    public boolean logInUser(User user);
    public boolean loadDefaultProducts();
    public List<Product> getAllProducts();
    public List<Product> getProductsByName(String name);
    public boolean addItemsToShoppingCart(User user);
    public List<Bill> getAllBills();
    public boolean createNewBill(Bill bill);
    public boolean validateAllBills(Bill bill);
}
