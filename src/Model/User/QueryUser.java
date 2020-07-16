package Model.User;

/**
 *
 * @author Cristian
 */
public interface QueryUser {
    public boolean signUpUser(User user);
    public boolean logInUser(User user);
    public boolean addItemsToShoppingCart(User user);
    public void beginTransaction();
    public boolean endTransaction();
}
