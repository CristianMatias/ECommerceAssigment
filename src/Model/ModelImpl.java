package Model;

import Model.Bill.Bill;
import Model.Bill.BillQuery;
import Model.Bill.BillQueryImpl;
import Model.Product.Product;
import Model.Product.ProductQuery;
import Model.Product.ProductQueryImpl;
import Model.User.QueryUser;
import Model.User.QueryUserImpl;
import Model.User.User;
import java.util.List;

/**
 * 
 * @author Cristian
 */
public class ModelImpl implements Model {
    private final QueryUser userQuery;
    private final ProductQuery productQuery;
    private final BillQuery billQuery;

    public ModelImpl() {
        this.userQuery = new QueryUserImpl();
        this.productQuery = new ProductQueryImpl();
        this.billQuery = new BillQueryImpl();
    }
    
    @Override
    public boolean signUpUser(User user) {
        return userQuery.signUpUser(user);
    }

    @Override
    public User logInUser(User user) {
        return userQuery.logInUser(user);
    }

    @Override
    public boolean loadDefaultProducts() {
        return productQuery.insertProducts();
    }

    @Override
    public List<Product> getAllProducts() {
        return productQuery.getAllProducts();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return productQuery.getProductsByName(name);
    }

    @Override
    public boolean addItemsToShoppingCart(User user) {
        return userQuery.addItemsToShoppingCart(user);
    }

    @Override
    public List<Bill> getAllBills() {
        return billQuery.getAllBills();
    }

    @Override
    public boolean createNewBill(Bill bill) {
        return billQuery.createNewBill(bill);
    }

    @Override
    public boolean validateAllBills(Bill bill) {
        return billQuery.validateBills(bill);
    }

    @Override
    public boolean updateUser(User user) {
        return userQuery.updateUser(user);
    }
    
}
