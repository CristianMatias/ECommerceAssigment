package Model.Product;

import java.util.List;

/**
 *
 * @author Cristian
 */
public interface ProductQuery {
    public void beginTransaction();
    public boolean endTransaction();
    public boolean insertProducts();
    public List<Product> getAllProducts();
}
