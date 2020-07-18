
package Model.Product;

import Model.Connection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class ProductQueryImpl implements ProductQuery {
    private final EntityManager connection;
    private Query query;

    public ProductQueryImpl() {
        this.connection = Connection.getConection();
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
    public boolean insertProducts() {
        boolean state = false;
        try {
            Product[] products = readDefaultProducts();
            for (Product product : products) state = insertProduct(product);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductQueryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return state;
    }
    
    private boolean insertProduct(Product product){
        beginTransaction();
        connection.persist(product);
        return endTransaction();
    }
    
    private Product[] readDefaultProducts() throws FileNotFoundException{
        Gson gson = new GsonBuilder().create();
        BufferedReader readJson = new BufferedReader(new FileReader("src/products.json"));
        return gson.fromJson(readJson, Product[].class);
    }

    @Override
    public List<Product> getAllProducts() {
        try{
            query = connection.createQuery("SELECT p FROM Product p");
            return query.getResultList();
        }catch(Exception ex){
            insertProducts();
            return getAllProducts();
        }
    }

    @Override
    public List<Product> getProductsByName(String name) {
        query = connection.createQuery("SELECT p FROM Product p WHERE p.productName like '%"+name+"%'");
        return query.getResultList();
    }
    
}
