package Model.Bill;

import Model.Product.Product;
import Model.User.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Cristian
 */
@Entity
public class Bill implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String dateCreation;

    @Basic
    private double totalPrice;
    
    @Basic
    private String directionBuyer;
    
    @Basic
    private String paymentMethod;

    @OneToOne
    private User user;

    @OneToMany
    private List<Product> products;

    public Bill() {
        this.dateCreation = Calendar.YEAR+"-"+Calendar.MONTH+"-"+Calendar.DAY_OF_MONTH;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public void setDirectionBuyer(String directionBuyer) {
        this.directionBuyer = directionBuyer;
    }

    public String getDirectionBuyer() {
        return directionBuyer;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    

    
}