package Model.User;

import Model.GenericQuery;

/**
 *
 * @author Cristian
 */
public interface QueryUser extends GenericQuery{
    public boolean signUpUser(User user);
    public User logInUser(User user);
    public boolean addItemsToShoppingCart(User user);
    public boolean updateUser(User user);
}
