package Model;

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
}
