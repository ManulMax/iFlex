/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.ResultSet;
import DB.DB;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kesh
 */
public class ProductManagement extends javax.swing.JPanel {

    /**
     * Creates new form ProductManagement
     */
    private String searchproductid;

    public ProductManagement() {
        initComponents();

        loadDate();
        loadProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ProductBrand = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PCategory = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Description = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        UPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Product Management");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product name", "Product brand", "Product category", "Description", "Unit price", "Quantity", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(0, 102, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Product name:");

        ProductName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Product brand:");

        ProductBrand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProductBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductBrandActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Product category:");

        PCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Quantity:");

        Description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Description:");

        UPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Unit price:");

        Quantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Date:");

        Date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add new product");
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductName)
                            .addComponent(ProductBrand)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date)
                            .addComponent(UPrice)
                            .addComponent(Quantity)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Description, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PCategory))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jButton1.setOpaque(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Enter product ID:");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(51, 153, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setText("iFlex Pvt. Ltd");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RES/company-logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(418, 418, 418))))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameActionPerformed

    private void ProductBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductBrandActionPerformed

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            ResultSet products = DB.search("SELECT id FROM product");
            String pid = "";
            while (products.next()) {
                pid = products.getString(1);

            }
            String newpid = "";
            if (pid.equals("")) {
                newpid = "P1";
            } else {

                int proid = Integer.parseInt(pid.split("P")[1]);
                int newpno = proid + 1;
                newpid = "P" + newpno;

            }
            String productName = ProductName.getText();
            String productBrand = ProductBrand.getText();
            String category = PCategory.getText();
            String des = Description.getText();
            double price = Double.parseDouble(UPrice.getText());
            double qty = Double.parseDouble(Quantity.getText());
            String date = Date.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date d = sdf.parse(date);
            java.sql.Date da = new java.sql.Date(d.getTime());
            System.out.println(date);
            System.out.println(da);

            DB.iud("INSERT INTO product(id, name, brand, category,description,unit_price,qty,date,status)VALUES('" + newpid + "', '" + productName + "','" + productBrand + "','" + category + "','" + des + "','" + price + "','" + qty + "','" + da + "','" + 1 + "')");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Invalid Input");
            
        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            loadProducts();
            clearFields();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String searchproduct = jTextField8.getText();
        try {
            DefaultTableModel dt11 = (DefaultTableModel) Table.getModel();
            dt11.setRowCount(0);
            System.out.println(searchproduct);
            ResultSet searchall = DB.search("SELECT * FROM product WHERE id = '" + searchproduct + "'");

            if (searchall.next()) {

                searchproductid = searchall.getString(1);

                Vector v = new Vector();

                v.add(searchall.getString(1));
                v.add(searchall.getString(2));
                v.add(searchall.getString(3));
                v.add(searchall.getString(4));
                v.add(Double.toString(searchall.getDouble(5)));
                v.add(Double.toString(searchall.getDouble(6)));
                v.add(searchall.getString(7));
                v.add(searchall.getDate(8).toString());

                DefaultTableModel dt1 = (DefaultTableModel) Table.getModel();
                dt1.addRow(v);
                ProductName.setText(searchall.getString(1));
                ProductBrand.setText(searchall.getString(2));
                PCategory.setText(searchall.getString(3));
                Description.setText(searchall.getString(4));
                UPrice.setText(searchall.getString(5));
                Quantity.setText(searchall.getString(6));
                Date.setText(searchall.getString(7));

            } else {

                JOptionPane.showMessageDialog(this, "No results found");
                loadProducts();
                jTextField8.setText("");
                jTextField8.grabFocus();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!searchproductid.equals("")) {
            String searchproduct = searchproductid;
            String productName = ProductName.getText();
            String productBrand = ProductBrand.getText();
            String category = PCategory.getText();
            String des = Description.getText();
            double price = Double.parseDouble(UPrice.getText());
            double qty = Double.parseDouble(Quantity.getText());

            DefaultTableModel dt11 = (DefaultTableModel) Table.getModel();
            dt11.setRowCount(0);

            String update = searchproductid;
            try {
                DB.iud("UPDATE product SET name = '" + productName + "', brand = '" + productBrand + "',category = '" + category + "', description ='" + des + "', unit_price = '" + price + "', qty = '" + qty + "' WHERE id = '" + searchproduct + "'");
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    ResultSet searchall = DB.search("SELECT * FROM product WHERE id = '" + searchproduct + "'");

                    if (searchall.next()) {

                        Vector v = new Vector();

                        v.add(searchall.getString(1));
                        v.add(searchall.getString(2));
                        v.add(searchall.getString(3));
                        v.add(searchall.getString(4));
                        v.add(Double.toString(searchall.getDouble(5)));
                        v.add(Double.toString(searchall.getDouble(6)));
                        v.add(searchall.getString(7));
                        v.add(searchall.getDate(8).toString());

                        DefaultTableModel dt1 = (DefaultTableModel) Table.getModel();
                        dt1.addRow(v);

                    }

                    searchproductid = "";
                    resetWIndow();
                    loadProducts();
                    JOptionPane.showMessageDialog(this, "Updated successfully!");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } else {

            JOptionPane.showMessageDialog(this, "Search for a product first");

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!searchproductid.equals("")) {

            try {
                
//                DB.iud("DELETE FROM product WHERE id = '" + searchproductid + "'");
                DB.iud("UPDATE product SET   status = '" + 0 + "' WHERE id = '" + searchproductid + "'");
                JOptionPane.showMessageDialog(this, "Deleted successfully!");
                resetWIndow();
                loadProducts();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Search for a product first");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        resetWIndow();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void loadDate() {
        try {
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String date = sdf.format(d);

            Date.setText(date);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadProducts() {
        try {

            DefaultTableModel dt11 = (DefaultTableModel) Table.getModel();
            dt11.setRowCount(0);

            ResultSet allproducts = DB.search("SELECT * FROM product WHERE status = 1");
            while (allproducts.next()) {

                Vector v = new Vector();

                v.add(allproducts.getString(1));
                v.add(allproducts.getString(2));
                v.add(allproducts.getString(3));
                v.add(allproducts.getString(4));
                v.add(Double.toString(allproducts.getDouble(5)));
                v.add(Double.toString(allproducts.getDouble(6)));
                v.add(allproducts.getString(7));
                v.add(allproducts.getDate(8).toString());

                DefaultTableModel dt1 = (DefaultTableModel) Table.getModel();
                dt1.addRow(v);

            }
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void resetWIndow() {
        ProductName.setText("");
        ProductBrand.setText("");
        PCategory.setText("");
        Description.setText("");
        UPrice.setText("");
        Quantity.setText("");
        Date.setText("");
        loadDate();

        jTextField8.setText("");
        searchproductid = "";
        loadProducts();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Description;
    private javax.swing.JTextField PCategory;
    private javax.swing.JTextField ProductBrand;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTable Table;
    private javax.swing.JTextField UPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        ProductName.setText("");
        ProductBrand.setText("");
        PCategory.setText("");
        Description.setText("");
        UPrice.setText("");
        Quantity.setText("");
        Date.setText("");
        loadDate();

        jTextField8.setText("");
    }
}
