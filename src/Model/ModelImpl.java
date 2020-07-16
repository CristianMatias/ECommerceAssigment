package Model;

import Model.User.QueryUser;
import Model.User.QueryUserImpl;
import Model.User.User;

/**
 * 
 * @author Cristian
 */
public class ModelImpl implements Model {
    private final QueryUser userQuery;

    public ModelImpl() {
        this.userQuery = new QueryUserImpl();
    }
    
    @Override
    public boolean signUpUser(User user) {
        return userQuery.signUpUser(user);
    }

    @Override
    public boolean logInUser(User user) {
        return userQuery.logInUser(user);
    }
    
}
