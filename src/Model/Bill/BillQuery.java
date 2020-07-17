package Model.Bill;

import java.util.List;

/**
 *
 * @author Cristian
 */
public interface BillQuery {
    public void beginTransaction();
    public boolean endTransaction();
    public boolean createNewBill(Bill bill);
    public List<Bill> getAllBills();
    public boolean validateBills(Bill bill);
}
