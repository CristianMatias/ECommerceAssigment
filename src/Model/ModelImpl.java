package Model;

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

    public ModelImpl() {
        this.userQuery = new QueryUserImpl();
        this.productQuery = new ProductQueryImpl();
    }
    
    @Override
    public boolean signUpUser(User user) {
        return userQuery.signUpUser(user);
    }

    @Override
    public boolean logInUser(User user) {
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
    
}
