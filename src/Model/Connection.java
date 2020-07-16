package Model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Cristian
 */
public class Connection {
    private static EntityManagerFactory manager = null;
    private static EntityManager conexion = null;
    
    private Connection(){
        manager = Persistence.createEntityManagerFactory("ecommerce.odb");
        conexion = manager.createEntityManager();
    }
    
    public static EntityManager getConection(){
        if(conexion == null) new Connection();
        return conexion;
    }
}
