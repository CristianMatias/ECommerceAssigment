package Model.User;

import Main.RC4;
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
    public boolean logInUser(User user) {
        try{
            query = connection.createQuery("SELECT u.password from User u WHERE u.userName = \""+user.getUserName()+"\"");
            String password = RC4.decrypt((String) query.getSingleResult(), User.KEY);
            return password.equals(user.getPassword());
        }catch(Exception ex){
            return false;
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
    
}
