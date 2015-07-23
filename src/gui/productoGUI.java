package gui;

import dao.productoDAO;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import to.productoTO;

public class ProductoGUI extends javax.swing.JInternalFrame {

    DefaultTableModel objTabla_prod;
    productoDAO objProductoDAO;
    ResultSet rsProductos;
    static DefaultListModel modelo = new DefaultListModel();
    boolean Button = false;

    public ProductoGUI() {
        initComponents();
        setVisible(true);
        setLocation(70, 50);
        tblProductos.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 12));
        objTabla_prod = (DefaultTableModel) tblProductos.getModel();
        cboUnidadMedida();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPresentacion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodi_pro = new javax.swing.JTextField();
        txtNomb_pro = new javax.swing.JTextField();
        txtPrev_pro = new javax.swing.JTextField();
        txtStun_pro = new javax.swing.JTextField();
        txtSeri_pro = new javax.swing.JTextField();
        radPres_pro_caja = new javax.swing.JRadioButton();
        radPres_pro_unidad = new javax.swing.JRadioButton();
        txtPrcu_pro = new javax.swing.JTextField();
        txtStto_pro = new javax.swing.JTextField();
        txtPrct_pro = new javax.swing.JTextField();
        cboUnme_pro = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListModelos = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        btnNuevo_prod = new javax.swing.JButton();
        btnRegistrar_prod = new javax.swing.JButton();
        btnActualizar_prod = new javax.swing.JButton();
        btnCancelar_prod = new javax.swing.JButton();
        btnEliminar_prod = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtBuscar_prod = new javax.swing.JTextField();

        setTitle("Gestionar producto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Presentación:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Precio venta:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Unidad de medida:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel7.setText("Precio compra Unitario:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel8.setText("Stock total:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel9.setText("Stock unitario:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel10.setText("Precio compra Total:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Serie:");

        txtCodi_pro.setEnabled(false);

        txtNomb_pro.setEnabled(false);

        txtPrev_pro.setEnabled(false);

        txtStun_pro.setEnabled(false);

        txtSeri_pro.setEnabled(false);

        buttonGroupPresentacion.add(radPres_pro_caja);
        radPres_pro_caja.setText("Caja");
        radPres_pro_caja.setEnabled(false);

        buttonGroupPresentacion.add(radPres_pro_unidad);
        radPres_pro_unidad.setText("Unidad");
        radPres_pro_unidad.setEnabled(false);

        txtPrcu_pro.setEnabled(false);

        txtStto_pro.setEnabled(false);

        txtPrct_pro.setEnabled(false);

        cboUnme_pro.setEnabled(false);

        jButton1.setText("Agregar Modelos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(ListModelos);

        jButton2.setText("Quitar");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radPres_pro_caja)
                                .addGap(18, 18, 18)
                                .addComponent(radPres_pro_unidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                            .addComponent(txtCodi_pro)
                            .addComponent(txtNomb_pro)
                            .addComponent(txtPrev_pro, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStun_pro)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrcu_pro)
                    .addComponent(txtStto_pro, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(cboUnme_pro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSeri_pro, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(txtPrct_pro, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodi_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeri_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboUnme_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtNomb_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(radPres_pro_caja)
                                    .addComponent(radPres_pro_unidad)
                                    .addComponent(txtPrcu_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPrev_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStto_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtStun_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addComponent(txtPrct_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnNuevo_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo24.png"))); // NOI18N
        btnNuevo_prod.setText("Nuevo");
        btnNuevo_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo_prodActionPerformed(evt);
            }
        });

        btnRegistrar_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Registrar24.png"))); // NOI18N
        btnRegistrar_prod.setText("Registrar");
        btnRegistrar_prod.setEnabled(false);
        btnRegistrar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_prodActionPerformed(evt);
            }
        });

        btnActualizar_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Editar24.png"))); // NOI18N
        btnActualizar_prod.setText("Actualizar");

        btnCancelar_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancelar24.png"))); // NOI18N
        btnCancelar_prod.setText("Cancelar");
        btnCancelar_prod.setEnabled(false);
        btnCancelar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_prodActionPerformed(evt);
            }
        });

        btnEliminar_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar24.png"))); // NOI18N
        btnEliminar_prod.setText("Eliminar");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel11.setText("Lista de productos");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Presentación", "Precio venta", "Stock U.", "Serie", "Unidad de M.", "Precio compra U.", "Stock total", "Precio compra T."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel12.setText("Producto a buscar:");

        txtBuscar_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscar_prodKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscar_prodKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegistrar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnActualizar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBuscar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_prodActionPerformed
        try {
            productoTO objProductoTO = new productoTO();
            if (Button == true) {
                objProductoTO.setNomb_pro(txtNomb_pro.getText().toUpperCase());
                objProductoTO.setPres_pro(SeleccionarPresentacion());
                objProductoTO.setUnme_pro(SeleccionarUnidadMedida());
                objProductoTO.setPrev_pro(Double.parseDouble(txtPrev_pro.getText()));
                objProductoTO.setPrcu_pro(Double.parseDouble(txtPrcu_pro.getText()));
                objProductoTO.setStto_pro(Integer.parseInt(txtStto_pro.getText()));
                objProductoTO.setStun_pro(Integer.parseInt(txtStun_pro.getText()));
                objProductoTO.setPrct_pro(Double.parseDouble(txtPrct_pro.getText()));
                objProductoTO.setSeri_pro(txtSeri_pro.getText().toUpperCase());
                objProductoDAO = new productoDAO();
                objProductoDAO.InsertProducto(objProductoTO);
                JOptionPane.showMessageDialog(rootPane, "Se registro correctamene el producto");
            } else {
                objProductoTO.setCodi_pro(Integer.parseInt(txtCodi_pro.getText()));
                objProductoTO.setPres_pro(SeleccionarPresentacion());
                objProductoTO.setUnme_pro(SeleccionarUnidadMedida());
                objProductoTO.setPrev_pro(Double.parseDouble(txtPrev_pro.getText()));
                objProductoTO.setPrcu_pro(Double.parseDouble(txtPrcu_pro.getText()));
                objProductoTO.setStto_pro(Integer.parseInt(txtStto_pro.getText()));
                objProductoTO.setStun_pro(Integer.parseInt(txtStun_pro.getText()));
                objProductoTO.setPrct_pro(Double.parseDouble(txtPrct_pro.getText()));
                objProductoTO.setSeri_pro(txtSeri_pro.getText().toUpperCase());
                objProductoDAO = new productoDAO();
                objProductoDAO.UpdateProducto(objProductoTO);
                JOptionPane.showMessageDialog(rootPane, "Se actualizó correctamene el producto");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRegistrar_prodActionPerformed

    private void btnNuevo_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo_prodActionPerformed
        try {
            Button = true;
            PresionaNuevo();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNuevo_prodActionPerformed

    private void btnCancelar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_prodActionPerformed
        try {
            PresionaCancelar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelar_prodActionPerformed

    private void txtBuscar_prodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar_prodKeyReleased
        try {
            String Nombre = txtBuscar_prod.getText();
            BuscarProducto(Nombre);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscar_prodKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ModelosGUI objModelosGUI = new ModelosGUI(null, true);
            objModelosGUI.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int pos = ListModelos.getSelectedIndex();
            System.out.println("Posición: " + pos);
            
            String Modelo = modelo.getElementAt(pos).toString();
            String Item = ListModelos.getSelectedValue().toString();
            
            System.out.println("Modelo del model: " + Modelo + " modelo de la lista: " + Item);
            if(Modelo.equals(Item)){
                modelo.removeElementAt(pos);
            }
//            

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtBuscar_prodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar_prodKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar_prodKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JList ListModelos;
    private javax.swing.JButton btnActualizar_prod;
    private javax.swing.JButton btnCancelar_prod;
    private javax.swing.JButton btnEliminar_prod;
    private javax.swing.JButton btnNuevo_prod;
    private javax.swing.JButton btnRegistrar_prod;
    private javax.swing.ButtonGroup buttonGroupPresentacion;
    private javax.swing.JComboBox cboUnme_pro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radPres_pro_caja;
    private javax.swing.JRadioButton radPres_pro_unidad;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscar_prod;
    private javax.swing.JTextField txtCodi_pro;
    private javax.swing.JTextField txtNomb_pro;
    private javax.swing.JTextField txtPrct_pro;
    private javax.swing.JTextField txtPrcu_pro;
    private javax.swing.JTextField txtPrev_pro;
    private javax.swing.JTextField txtSeri_pro;
    private javax.swing.JTextField txtStto_pro;
    private javax.swing.JTextField txtStun_pro;
    // End of variables declaration//GEN-END:variables

    private void PresionaNuevo() {
        /*Botones*/
        btnRegistrar_prod.setEnabled(true);
        btnCancelar_prod.setEnabled(true);
        btnNuevo_prod.setEnabled(false);
        btnActualizar_prod.setEnabled(false);
        btnEliminar_prod.setEnabled(false);
        /*Inputs y otros*/
        txtNomb_pro.setEnabled(true);
        txtNomb_pro.requestFocus();
        radPres_pro_caja.setEnabled(true);
        radPres_pro_unidad.setEnabled(true);
        txtPrev_pro.setEnabled(true);
        txtStun_pro.setEnabled(true);
        txtSeri_pro.setEnabled(true);
        cboUnme_pro.setEnabled(true);
        txtPrcu_pro.setEnabled(true);
        txtStto_pro.setEnabled(true);
        txtPrct_pro.setEnabled(true);

    }

    private void PresionaCancelar() {
        btnCancelar_prod.setEnabled(false);
        btnNuevo_prod.setEnabled(true);
        btnRegistrar_prod.setEnabled(false);
        btnActualizar_prod.setEnabled(true);
        btnEliminar_prod.setEnabled(true);

    }

    private void cboUnidadMedida() {
        cboUnme_pro.addItem("Litros");
        cboUnme_pro.addItem("Galones");
        cboUnme_pro.addItem("Unidad");

    }

    private void BuscarProducto(String Nombre) {
        try {
            if (txtBuscar_prod.getText().isEmpty()) {
                LimpiarTabla();
            } else {
                LimpiarTabla();
                objProductoDAO = new productoDAO();
                rsProductos = objProductoDAO.BuscarProducto(Nombre);
                while (rsProductos.next()) {
                    Object[] Registros = {rsProductos.getString(2), rsProductos.getString(3), rsProductos.getDouble(5),
                        rsProductos.getString(8), rsProductos.getString(10),
                        rsProductos.getString(4), rsProductos.getDouble(6),
                        rsProductos.getString(7), rsProductos.getDouble(9)
                    };
                    objTabla_prod.addRow(Registros);
                }

            }
        } catch (Exception e) {
        }
    }

    private void LimpiarTabla() {
        try {
            while (objTabla_prod.getRowCount() > 0) {
                objTabla_prod.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el metodo de limpia tabla");
        }
    }

    private void radPresentacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String SeleccionarPresentacion() {
        String Presentación = "";
        if (radPres_pro_caja.isSelected()) {
            Presentación = "CAJA";
        } else {
            if (radPres_pro_unidad.isSelected()) {
                Presentación = "UNIDAD";
            }
        }
        return Presentación.toUpperCase();
    }

    private String SeleccionarUnidadMedida() {
        String Unidad_medida = "";
        if (cboUnme_pro.getSelectedItem().equals("UNIDAD")) {
            Unidad_medida = cboUnme_pro.getSelectedItem().toString();
        } else {
            if (cboUnme_pro.getSelectedItem().equals("LITROS")) {
                Unidad_medida = cboUnme_pro.getSelectedItem().toString();
            } else {
                Unidad_medida = cboUnme_pro.getSelectedItem().toString();
            }
        }
        return Unidad_medida.toUpperCase();
    }
}
