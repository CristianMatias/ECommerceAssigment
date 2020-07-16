package Control;

import Model.Product.Product;
import Model.User.User;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface Control {
    public boolean signUpUser(User user);
    public boolean logInUser(User user);
    public boolean insertDefaultProducts();
    public List<Product> getAllProducts();
}
