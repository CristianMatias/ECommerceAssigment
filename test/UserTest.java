/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Product.Product;
import Model.Product.ProductQueryImpl;
import Model.User.QueryUserImpl;
import Model.User.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian
 */
public class UserTest {
    
    public UserTest() {
    }
    
//    @Test
//    public void signUpTest() throws Exception{
//        User user = new User();
//        user.setUserName("Admin2");
//        user.setPassword("1234");
//        user.setRole("Admin");
//        assertTrue(new QueryUserImpl().signUpUser(user));
//    }
    
    @Test(expected = NullPointerException.class)
    public void logInTest() throws Exception{
        User user = new User();
        user.setUserName("User");
        user.setPassword("1234");
        assertNotEquals(null, new QueryUserImpl().logInUser(user).getUserName());
        
    }
    
    @Test
    public void logInFailedTest() throws Exception{
        User user = new User();
        user.setUserName("prueba");
        user.setPassword("12345");
        assertEquals(null,new QueryUserImpl().logInUser(user));
    }
    
    @Test
    public void fixBugDontSaveProducts(){
        User user = new QueryUserImpl().getUser("User");
        Product p = new ProductQueryImpl().getAllProducts().get(0);
        user.addProduct(p);
        new QueryUserImpl().addItemsToShoppingCart(user);
        assertEquals(6, new QueryUserImpl().getUser("User").getProducts().size());
    }
}
