package Control;

import Model.Model;
import Model.User.User;

/**
 * 
 * @author Cristian
 */
public class ControlImpl implements Control {
    private final Model model;

    public ControlImpl(Model model) {
        this.model = model;
    }

    @Override
    public boolean signUpUser(User user) {
        return model.signUpUser(user);
    }

    @Override
    public boolean logInUser(User user) {
        return model.logInUser(user);
    }
    
    
}
