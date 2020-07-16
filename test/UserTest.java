/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void signUpTest() throws Exception{
        User user = new User();
        user.setUserName("Admin2");
        user.setPassword("1234");
        user.setRole("Admin");
        assertTrue(new QueryUserImpl().signUpUser(user));
    }
    
    @Test
    public void logInTest() throws Exception{
        User user = new User();
        user.setUserName("prueba");
        user.setPassword("1234");
        assertTrue(new QueryUserImpl().logInUser(user));
        
    }
    
    @Test
    public void logInFailedTest() throws Exception{
        User user = new User();
        user.setUserName("prueba");
        user.setPassword("12345");
        assertFalse(new QueryUserImpl().logInUser(user));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
