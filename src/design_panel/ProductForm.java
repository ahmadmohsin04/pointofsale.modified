package design_panel;

import entities.Product;
import entities.Store;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductForm extends javax.swing.JFrame {

    /**
     * Creates new form UserSignUpForm
     */
    public ProductForm() {
        initComponents();
        this.setLocation(150, 45);
      //  Store.dummyProducts();
        setTableValues();
    }
    
    public void resetfields(){
        prd_id.setText("");
        prd_name.setText("");
        prd_category.setSelectedIndex(0);
        prd_r_price.setText("");
        prd_w_sale_price.setText("");
        prd_stock.setText("");
    }
    
    //setTable content
    void setTableValues(){
        ArrayList<Product> products = Store.getAllProducts();
        if(products!=null){
            DefaultTableModel model =  (DefaultTableModel) product_List.getModel();
            model.setRowCount(0);
            for (int i = 0; i < products.size(); i++) {
                //columns arrays
                Object [] cols = new Object[6];
                cols[0] = products.get(i).getPid();
                cols[1] = products.get(i).getName();
                cols[2] = products.get(i).getCategory();
                cols[3] = products.get(i).getStock();
                cols[4] = products.get(i).getW_sale_price();
                cols[5] = products.get(i).getR_price();
                model.addRow(cols);
                resetfields();
                // one row
            }
        }        
    }

    void setSingleItemTable(Product p) {
        DefaultTableModel model = (DefaultTableModel) product_List.getModel();
        model.setRowCount(0);
        //columns arrays
        Object[] cols = new Object[6];
        cols[0] = p.getPid();
        cols[1] = p.getName();
        cols[2] = p.getCategory();
        cols[3] = p.getStock();
        cols[4] = p.getW_sale_price();
        cols[5] = p.getR_price();
        model.addRow(cols);
        // one row
    }


    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prd_name = new javax.swing.JTextField();
        prd_w_sale_price = new javax.swing.JTextField();
        prd_r_price = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        back = new javax.swing.JButton();
        prd_category = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        product_List = new javax.swing.JTable();
        prd_search_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        prd_stock = new javax.swing.JTextField();
        prd_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Registration");
        setBackground(new java.awt.Color(255, 255, 51));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Id *");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("whole sale price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Retail Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        prd_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prd_name.setToolTipText("Enter Student ID ");
        prd_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(prd_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 230, -1));

        prd_w_sale_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prd_w_sale_price.setToolTipText("Full Name of student");
        prd_w_sale_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(prd_w_sale_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 160, -1));

        prd_r_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prd_r_price.setToolTipText("Enter Section(e.g: A1)");
        prd_r_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(prd_r_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 210, -1));

        save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        save.setText("Add");
        save.setToolTipText("Click here to save data");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back.setText("Back");
        back.setToolTipText("Go Back LogIn");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        prd_category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Snacks", "Fruits", "Dairy ", "Baking", "sea Food", "Toys ", " ", " " }));
        prd_category.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(prd_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 230, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        product_List.setAutoCreateRowSorter(true);
        product_List.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        product_List.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Category", "Stock", "Whole Sale Price", "Retail Price"
            }
        ));
        product_List.setToolTipText("Student List");
        product_List.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                product_ListFocusGained(evt);
            }
        });
        product_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_ListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(product_List);
        product_List.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 550, 370));

        prd_search_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prd_search_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prd_search_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prd_search_nameKeyPressed(evt);
            }
        });
        getContentPane().add(prd_search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 550, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Name to Search");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        delete.setText("Remove");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        prd_stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prd_stock.setToolTipText("Enter Student ID ");
        prd_stock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(prd_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 230, -1));

        prd_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prd_id.setToolTipText("Enter Student ID ");
        prd_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(prd_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 230, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Stock");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Portal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 6, 412, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/java3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        setSize(new java.awt.Dimension(1000, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:        
    }//GEN-LAST:event_formWindowClosed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handlissng code here:           
        if(!prd_id.getText().isEmpty()&&
           !prd_category.getSelectedItem().toString().isEmpty()&&
           !prd_name.getText().isEmpty()&&
           !prd_r_price.getText().isEmpty()&&
           !prd_w_sale_price.getText().isEmpty()&&
           !prd_stock.getText().isEmpty()){
            Product p = new Product();
            p.setPid(Integer.parseInt(prd_id.getText()));
            p.setName(prd_name.getText());
            p.setW_sale_price(Double.parseDouble(prd_w_sale_price.getText()));
            p.setR_price(Double.parseDouble(prd_r_price.getText()));
            p.setCategory(prd_category.getSelectedItem().toString());
            p.setStock(Integer.parseInt(prd_stock.getText()));
            Store.addProduct(p);
            //insert a product
            setTableValues();            
        }
        else
            JOptionPane.showMessageDialog(null, "fill the required fields");
        
    }//GEN-LAST:event_saveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        //TODO add your handling code here:        
        this.setVisible(false);
        this.dispose();        

    }//GEN-LAST:event_backActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(!prd_id.getText().isEmpty()&&
           !prd_category.getSelectedItem().toString().isEmpty()&&
           !prd_name.getText().isEmpty()&&
           !prd_r_price.getText().isEmpty()&&
           !prd_w_sale_price.getText().isEmpty()&&
           !prd_stock.getText().isEmpty()){
            Product p = new Product();
            p.setPid(Integer.parseInt(prd_id.getText()));
            p.setName(prd_name.getText());
            p.setW_sale_price(Double.parseDouble(prd_w_sale_price.getText()));
            p.setR_price(Double.parseDouble(prd_r_price.getText()));
            p.setCategory(prd_category.getSelectedItem().toString());
            p.setStock(Integer.parseInt(prd_stock.getText()));
            Store.updateProduct(p.getPid(), p);
            resetfields();
            setTableValues();
        }
        else{
            Store.showErrorMessage("fill the required fields");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        if(!prd_id.getText().isEmpty()&&
           !prd_category.getSelectedItem().toString().isEmpty()&&
           !prd_name.getText().isEmpty()&&
           !prd_r_price.getText().isEmpty()&&
           !prd_w_sale_price.getText().isEmpty()&&
           !prd_stock.getText().isEmpty()){
            Product p = new Product();
            p.setPid(Integer.parseInt(prd_id.getText()));
            p.setName(prd_name.getText());
            p.setW_sale_price(Double.parseDouble(prd_w_sale_price.getText()));
            p.setR_price(Double.parseDouble(prd_r_price.getText()));
            p.setCategory(prd_category.getSelectedItem().toString());
            p.setStock(Integer.parseInt(prd_stock.getText()));
            Store.deleteProduct(p);
            resetfields();
            setTableValues();
        }
        else
            Store.showErrorMessage("fill the required fields");

    }//GEN-LAST:event_deleteActionPerformed

    private void product_ListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_product_ListFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_product_ListFocusGained

    private void prd_search_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prd_search_nameKeyPressed
        // TODO add your handling code here:
        if (!prd_search_name.getText().isEmpty()
                && evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Product p = Store.searchProductByName(prd_search_name.getText());
            setSingleItemTable(p);            
        }
        else{
            setTableValues();
        }
        
    }//GEN-LAST:event_prd_search_nameKeyPressed

    private void product_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_ListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) product_List.getModel();
        int index = product_List.getSelectedRow();
        prd_id.setText(model.getValueAt(index, 0).toString());
        prd_category.setSelectedItem(model.getValueAt(index, 2));
        System.out.println(model.getValueAt(index, 2));
        prd_name.setText(model.getValueAt(index, 1).toString());
        prd_stock.setText(model.getValueAt(index, 3).toString());
        prd_w_sale_price.setText(model.getValueAt(index, 4).toString());
        prd_r_price.setText(model.getValueAt(index, 5).toString());
                
        
    }//GEN-LAST:event_product_ListMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox prd_category;
    private javax.swing.JTextField prd_id;
    private javax.swing.JTextField prd_name;
    private javax.swing.JTextField prd_r_price;
    private javax.swing.JTextField prd_search_name;
    private javax.swing.JTextField prd_stock;
    private javax.swing.JTextField prd_w_sale_price;
    private javax.swing.JTable product_List;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
