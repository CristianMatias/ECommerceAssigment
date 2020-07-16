package Model.Product;

import Model.User.User;
import java.io.Serializable;
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
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Basic
    private String productName;

    @Basic
    private double price;
    
    @Basic
    private String description;
    
    @Basic
    private String category;

    @ManyToMany
    private List<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<User> getUsers() {
        if (users == null) {
            users = new ArrayList<>();
        }
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        getUsers().add(user);
        user.getProducts().add(this);
    }

    public void removeUser(User user) {
        getUsers().remove(user);
        user.getProducts().remove(this);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName=" + productName + ", price=" + price + ", description=" + description + ", category=" + category + ", users=" + users + '}';
    }

    
}