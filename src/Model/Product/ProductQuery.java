package Model.Product;

import Model.GenericQuery;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface ProductQuery extends GenericQuery{
    public boolean insertProducts();
    public List<Product> getAllProducts();
    public List<Product> getProductsByName(String name);
}
