package Model;

/**
 *
 * @author Cristian
 */
public interface GenericQuery {
    public void beginTransaction();
    public boolean endTransaction();
}
