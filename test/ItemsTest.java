/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Product.Product;
import Model.Product.ProductQueryImpl;
import java.util.List;
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
public class ItemsTest {
    
    public ItemsTest() {
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
    
    //@Test
    public void insertDefaultProductsTest(){
        assertTrue(new ProductQueryImpl().insertProducts());
    }
    
    @Test
    public void searchItemsTest(){
        String expected = "Product{id=39, productName=profe, price=12.0, description=prueba, category=ORO, users=null}";
        List<Product> products = new ProductQueryImpl().getProductsByName("profe");
        
        assertEquals(expected, products.get(0).toString());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
