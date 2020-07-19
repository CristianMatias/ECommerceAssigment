package Model.Bill;

import Model.GenericQuery;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface BillQuery extends GenericQuery{
    public boolean createNewBill(Bill bill);
    public List<Bill> getAllBills();
    public boolean validateBills(Bill bill);
}
