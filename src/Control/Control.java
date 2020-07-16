package Control;

import Model.User.User;

/**
 *
 * @author Cristian
 */
public interface Control {
    public boolean signUpUser(User user);
    public boolean logInUser(User user);
}
