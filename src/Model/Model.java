package Model;

import Model.User.User;

/**
 *
 * @author Cristian
 */
public interface Model {
    public boolean signUpUser(User user);
    public boolean logInUser(User user);
}
