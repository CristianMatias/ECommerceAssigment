package Model.User;

/**
 *
 * @author Cristian
 */
public interface QueryUser {
    public boolean signUpUser(User user);
    public User logInUser(User user);
    public boolean addItemsToShoppingCart(User user);
    public boolean updateUser(User user);
    public void beginTransaction();
    public boolean endTransaction();
}
