package Model.User;

import Model.Product.Product;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import Main.RC4;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * @author Cristian
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Basic
    private String userName;

    @Basic
    private String password;
    
    @Basic
    private String role;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Product> products;
    
    public static final String KEY = "MHPSOFTWARE";

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() throws Exception {
        return RC4.decrypt(password, KEY);
    }

    public void setPassword(String password) throws Exception {
        this.password = RC4.encrypt(password, KEY);
    }

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<>();
        }
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        getProducts().add(product);
    }

    public void removeProduct(Product product) {
        getProducts().remove(product);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    

}