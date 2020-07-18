package Model.User;

import Model.Connection;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * 
 * @author Cristian
 */
public class QueryUserImpl implements QueryUser {
    private final EntityManager connection;
    private Query query;

    public QueryUserImpl() {
        this.connection = Connection.getConection();
    }
    
    @Override
    public boolean signUpUser(User user) {
        beginTransaction();
        connection.persist(user);
        return endTransaction();
    }

    @Override
    public User logInUser(User user) {
        try{
            query = connection.createQuery("SELECT u from User u WHERE u.userName = \""+user.getUserName()+"\"");
            User actualUser = (User) query.getSingleResult();
            if(actualUser.getPassword().equals(user.getPassword())) return actualUser;
            else return null;
        }catch(Exception ex){
            return null;
        }
    }

    @Override
    public void beginTransaction() {
        connection.getTransaction().begin();
    }

    @Override
    public boolean endTransaction() {
        try{
            connection.getTransaction().commit();
            return true;
        }catch(Exception ex){
            connection.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean addItemsToShoppingCart(User user) {
        beginTransaction();
        connection.persist(user);
        return endTransaction();
    }
    
    public User getUser(String name){
        query = connection.createQuery("SELECT u FROM User u WHERE u.userName = \""+name+"\"");
        return (User) query.getSingleResult();
    }

    @Override
    public boolean updateUser(User user) {
        return signUpUser(user);
    }
    
}
