package Model.Product;

import Model.User.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUsers(User users) {
        this.user = users;
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
        return "Product{" + "id=" + id + ", productName=" + productName + ", price=" + price + ", description=" + description + ", category=" + category + ", users=" + user + '}';
    }

    
}