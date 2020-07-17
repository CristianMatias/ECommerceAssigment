package View;

import Control.Control;
import Model.Product.Product;
import Model.User.User;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian
 */
public class ViewImpl extends javax.swing.JFrame implements View{
    private final Control control;
    private User currentUser = null;
    
    /**
     * Creates new form ViewImpl
     * @param control
     */
    public ViewImpl(Control control) {
        initComponents();
        this.control = control;
        readAllItems();
    }
    
    public ViewImpl(Control control, User user){
        initComponents();
        this.control = control;
        this.currentUser = user;
        fillUserData();
        readAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        shoppingButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        nameSearch = new javax.swing.JTextField();
        loadProducts = new javax.swing.JButton();
        addItem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signButton.setText("Sign Up/In");
        signButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButtonActionPerformed(evt);
            }
        });

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Description", "Category", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProducts);
        if (tableProducts.getColumnModel().getColumnCount() > 0) {
            tableProducts.getColumnModel().getColumn(0).setResizable(false);
            tableProducts.getColumnModel().getColumn(1).setResizable(false);
            tableProducts.getColumnModel().getColumn(3).setResizable(false);
            tableProducts.getColumnModel().getColumn(4).setResizable(false);
        }

        shoppingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/shopping-cart.png"))); // NOI18N
        shoppingButton.setText("(0)");
        shoppingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingButtonActionPerformed(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        nameSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nameSearchCaretUpdate(evt);
            }
        });

        loadProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/product.png"))); // NOI18N
        loadProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadProductsActionPerformed(evt);
            }
        });

        addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/buy.png"))); // NOI18N
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(nameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton)
                        .addGap(18, 18, 18)
                        .addComponent(loadProducts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(signButton)
                        .addGap(18, 18, 18)
                        .addComponent(shoppingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(signButton)
                            .addComponent(shoppingButton)
                            .addComponent(loadProducts)
                            .addComponent(addItem))
                        .addComponent(nameSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButtonActionPerformed
        this.setVisible(false);
        new LoginView(control).setVisible(true);
    }//GEN-LAST:event_signButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        prepareTable(control.getProductsByName(nameSearch.getText()), (DefaultTableModel) tableProducts.getModel());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void loadProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadProductsActionPerformed
        prepareTable(control.getAllProducts(), (DefaultTableModel) tableProducts.getModel());
    }//GEN-LAST:event_loadProductsActionPerformed

    private void nameSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nameSearchCaretUpdate
        if(nameSearch.getText() != null) searchButtonActionPerformed(new ActionEvent(evt, WIDTH, ""));
    }//GEN-LAST:event_nameSearchCaretUpdate

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        Product product = new Product();
        
        product.setId((int) tableProducts.getValueAt(tableProducts.getSelectedRow(), 0));
        product.setProductName((String) tableProducts.getValueAt(tableProducts.getSelectedRow(), 1));
        product.setDescription((String) tableProducts.getValueAt(tableProducts.getSelectedRow(), 2));
        product.setCategory((String) tableProducts.getValueAt(tableProducts.getSelectedRow(), 3));
        product.setPrice((double) tableProducts.getValueAt(tableProducts.getSelectedRow(), 4));
        
        currentUser.addProduct(product);
        System.out.println("Add: "+control.addItemsToShoppingCart(currentUser));
        fillUserData();
        
    }//GEN-LAST:event_addItemActionPerformed

    private void shoppingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingButtonActionPerformed
        if(currentUser == null) {
            JOptionPane.showMessageDialog(null, "You have to LogIn first");
            new LoginView(control).setVisible(true);
            this.setVisible(false);
        }
        else if(currentUser.getProducts().isEmpty()){
            JOptionPane.showMessageDialog(null, "Select at least one product first");
        }
        else {
            new ShopView(control, currentUser).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_shoppingButtonActionPerformed

    private void fillUserData(){
        this.signButton.setText(currentUser.getUserName());
        this.shoppingButton.setText("("+getSizeList()+")");
    }
    
    private int getSizeList(){
        if(currentUser.getProducts().isEmpty()) {
            return 0;
        }
        else return currentUser.getProducts().size();
    }
    
    private void prepareTable(List<Product> products, DefaultTableModel modelTable){
        deleteRows(modelTable.getRowCount(), modelTable);
        products.forEach((product) -> {
            Object[] row = new Object[5];
            row[0] = product.getId();
            row[1] = product.getProductName();
            row[2] = product.getDescription();
            row[3] = product.getCategory();
            row[4] = product.getPrice();
            
            modelTable.addRow(row);
        });
        
        tableProducts.setModel(modelTable);
    }
    
    private static void deleteRows(int rows, DefaultTableModel model){
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    @Override
    public void start() {
        this.setVisible(true);
    }
    
    @Override
    public void readAllItems() {
        prepareTable(control.getAllProducts(), (DefaultTableModel) tableProducts.getModel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadProducts;
    private javax.swing.JTextField nameSearch;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton shoppingButton;
    private javax.swing.JButton signButton;
    private javax.swing.JTable tableProducts;
    // End of variables declaration//GEN-END:variables

    
}
