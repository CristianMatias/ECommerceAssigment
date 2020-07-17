package Model.Bill;

import Model.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * 
 * @author Cristian
 */
public class BillQueryImpl implements BillQuery {
    private final EntityManager connection;
    private Query query;

    public BillQueryImpl() {
        this.connection = Connection.getConection();
    }
    
    @Override
    public void beginTransaction() {
        connection.getTransaction().begin();
    }

    @Override
    public boolean endTransaction() {
        try{
            connection.getTransaction().commit();
            return true;
        }catch(Exception ex){
            connection.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean createNewBill(Bill bill) {
        beginTransaction();
        connection.persist(bill);
        return endTransaction();
    }

    @Override
    public List<Bill> getAllBills() {
        query = connection.createQuery("SELECT b FROM Bill b");
        return query.getResultList();
    }

    @Override
    public boolean validateBills(Bill bill) {
        beginTransaction();
        connection.detach(bill);
        return endTransaction();
    }
    
}
