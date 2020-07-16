package Model.User;

import Model.Product.Product;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Cristian
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String userName;

    @Basic
    private String password;

    @ManyToMany(mappedBy = "users")
    private List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

}