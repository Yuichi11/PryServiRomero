package gui;

import coneccion.MySQL;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import libreria.SeleccionRenderer;
import org.jdesktop.swingx.prompt.PromptSupport;

public class inventarioGUI extends javax.swing.JInternalFrame {

    String sql_query = "SELECT * FROM v_productos ";
    String sql_count = "SELECT COUNT(*) as count FROM v_productos ";
    String most_res, where;
    int paginas, pagina_actual;

    public inventarioGUI() {
        initComponents();
        setVisible(true);
        setPromts();
        setRendererCombos();
        cabecera_tooltip();
        actualizar_inventario();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        cmp_filtro = new javax.swing.JPanel();
        txt_busq_pro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbo_pres_caja = new javax.swing.JComboBox();
        txt_stock_uni_pro_max = new javax.swing.JTextField();
        txt_stock_uni_pro_min = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbo_unid_med = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txt_prec_uni_pro_max = new javax.swing.JTextField();
        txt_prec_uni_pro_min = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_prec_tot_pro_max = new javax.swing.JTextField();
        txt_prec_tot_pro_min = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_stock_tot_pro_max = new javax.swing.JTextField();
        txt_stock_tot_pro_min = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_prec_ven_pro_max = new javax.swing.JTextField();
        txt_prec_ven_pro_min = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cboOrderBy = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        cboModOrder = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cbo_most_res = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        lblPages = new javax.swing.JLabel();
        btnLast = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("jMenu1");

        jLabel1.setText("Filtros de búsqueda: ");

        cmp_filtro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_busq_pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_busq_proKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busq_proKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_busq_proKeyTyped(evt);
            }
        });

        jLabel3.setText("Presentación: ");

        cbo_pres_caja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..", "Caja", "Unidad" }));
        cbo_pres_caja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_pres_cajaItemStateChanged(evt);
            }
        });

        txt_stock_uni_pro_max.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stock_uni_pro_max.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stock_uni_pro_maxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stock_uni_pro_maxKeyTyped(evt);
            }
        });

        txt_stock_uni_pro_min.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stock_uni_pro_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stock_uni_pro_minKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stock_uni_pro_minKeyTyped(evt);
            }
        });

        jLabel6.setText("- ");

        jLabel7.setText("Stock unitario: ");

        cbo_unid_med.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..", "Litros", "Galones", "Unidad" }));
        cbo_unid_med.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_unid_medItemStateChanged(evt);
            }
        });
        cbo_unid_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_unid_medActionPerformed(evt);
            }
        });

        jLabel8.setText("Unidad de medida: ");

        txt_prec_uni_pro_max.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_prec_uni_pro_max.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prec_uni_pro_maxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prec_uni_pro_maxKeyTyped(evt);
            }
        });

        txt_prec_uni_pro_min.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_prec_uni_pro_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prec_uni_pro_minKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prec_uni_pro_minKeyTyped(evt);
            }
        });

        jLabel9.setText("- S/.");

        jLabel10.setText("Precio de compra unitario:");

        jLabel11.setText("Precio de compra total:");

        jLabel12.setText("- S/.");

        txt_prec_tot_pro_max.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_prec_tot_pro_max.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prec_tot_pro_maxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prec_tot_pro_maxKeyTyped(evt);
            }
        });

        txt_prec_tot_pro_min.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_prec_tot_pro_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prec_tot_pro_minKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prec_tot_pro_minKeyTyped(evt);
            }
        });

        jLabel13.setText("S/.");

        jLabel14.setText("S/.");

        jLabel15.setText("Stock total: ");

        txt_stock_tot_pro_max.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stock_tot_pro_max.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stock_tot_pro_maxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stock_tot_pro_maxKeyTyped(evt);
            }
        });

        txt_stock_tot_pro_min.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stock_tot_pro_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stock_tot_pro_minKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stock_tot_pro_minKeyTyped(evt);
            }
        });

        jLabel16.setText("- ");

        jLabel20.setText("Precio de venta:");

        jLabel21.setText("- S/.");

        jLabel22.setText("S/.");

        txt_prec_ven_pro_max.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_prec_ven_pro_max.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prec_ven_pro_maxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prec_ven_pro_maxKeyTyped(evt);
            }
        });

        txt_prec_ven_pro_min.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_prec_ven_pro_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prec_ven_pro_minKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prec_ven_pro_minKeyTyped(evt);
            }
        });

        jLabel18.setText("Ordenar por ");

        cboOrderBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Producto", "Presentación", "Unidad de medida", "Precio de venta", "Precio de compra unitario", "Precio de compra total", "Stock unitario", "Stock total" }));

        jLabel19.setText("de manera");

        cboModOrder.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Descendente", "Ascendente" }));

        javax.swing.GroupLayout cmp_filtroLayout = new javax.swing.GroupLayout(cmp_filtro);
        cmp_filtro.setLayout(cmp_filtroLayout);
        cmp_filtroLayout.setHorizontalGroup(
            cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cmp_filtroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_busq_pro)
                    .addGroup(cmp_filtroLayout.createSequentialGroup()
                        .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(cmp_filtroLayout.createSequentialGroup()
                                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cmp_filtroLayout.createSequentialGroup()
                                        .addComponent(txt_stock_uni_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_stock_uni_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cmp_filtroLayout.createSequentialGroup()
                                        .addComponent(txt_stock_tot_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_stock_tot_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(cmp_filtroLayout.createSequentialGroup()
                                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbo_pres_caja, 0, 113, Short.MAX_VALUE)
                                    .addComponent(cbo_unid_med, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cmp_filtroLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(153, 153, 153))
                            .addGroup(cmp_filtroLayout.createSequentialGroup()
                                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cmp_filtroLayout.createSequentialGroup()
                                        .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(cmp_filtroLayout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_prec_ven_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_prec_ven_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(cmp_filtroLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_prec_uni_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_prec_uni_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(cmp_filtroLayout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_prec_tot_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_prec_tot_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(cmp_filtroLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboModOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        cmp_filtroLayout.setVerticalGroup(
            cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cmp_filtroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_busq_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_prec_ven_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(txt_prec_ven_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbo_pres_caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_unid_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(txt_prec_uni_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_prec_uni_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cmp_filtroLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(cmp_filtroLayout.createSequentialGroup()
                        .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_prec_tot_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(txt_prec_tot_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_stock_uni_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(txt_stock_uni_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cmp_filtroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_stock_tot_pro_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(txt_stock_tot_pro_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(cmp_filtroLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(cboModOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cmp_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(cboOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Resultado de búsqueda: ");

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROD.", "SERIE", "PRES.", "U.  M.", "P. V.", "P. C. U.", "P. C. T.", "S. U.", "S. T."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventario);

        jLabel4.setText("Mostrar");

        cbo_most_res.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "25", "50" }));
        cbo_most_res.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_most_resItemStateChanged(evt);
            }
        });

        jLabel5.setText("resultados.");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        jLabel17.setToolTipText("");

        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnFirst.setText("Primero");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        lblPages.setText("Página 1 de 2");

        btnLast.setText("Ultimo");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
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
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_most_res, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmp_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(btnFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPages)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLast)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmp_filtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(cbo_most_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnFirst)
                    .addComponent(lblPages)
                    .addComponent(btnLast))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_unid_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_unid_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_unid_medActionPerformed

    private void txt_busq_proKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busq_proKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_busq_proKeyReleased

    private void txt_busq_proKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busq_proKeyPressed

    }//GEN-LAST:event_txt_busq_proKeyPressed

    private void txt_busq_proKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busq_proKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }//GEN-LAST:event_txt_busq_proKeyTyped

    private void cbo_pres_cajaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_pres_cajaItemStateChanged
        actualizar_inventario();
    }//GEN-LAST:event_cbo_pres_cajaItemStateChanged

    private void cbo_unid_medItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_unid_medItemStateChanged
        actualizar_inventario();
    }//GEN-LAST:event_cbo_unid_medItemStateChanged

    private void txt_stock_uni_pro_minKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_uni_pro_minKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_stock_uni_pro_minKeyReleased

    private void txt_stock_uni_pro_minKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_uni_pro_minKeyTyped
        if (!is_int(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_stock_uni_pro_minKeyTyped

    private void txt_stock_uni_pro_maxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_uni_pro_maxKeyTyped
        if (!is_int(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_stock_uni_pro_maxKeyTyped

    private void txt_stock_tot_pro_minKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_tot_pro_minKeyTyped
        if (!is_int(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_stock_tot_pro_minKeyTyped

    private void txt_stock_tot_pro_maxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_tot_pro_maxKeyTyped
        if (!is_int(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_stock_tot_pro_maxKeyTyped

    private void txt_prec_ven_pro_minKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_ven_pro_minKeyTyped
        if (!is_decimal(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_prec_ven_pro_minKeyTyped

    private void txt_prec_ven_pro_maxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_ven_pro_maxKeyTyped
        if (!is_decimal(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_prec_ven_pro_maxKeyTyped

    private void txt_prec_uni_pro_minKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_uni_pro_minKeyTyped
        if (!is_decimal(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_prec_uni_pro_minKeyTyped

    private void txt_prec_uni_pro_maxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_uni_pro_maxKeyTyped
        if (!is_decimal(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_prec_uni_pro_maxKeyTyped

    private void txt_prec_tot_pro_minKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_tot_pro_minKeyTyped
        if (!is_decimal(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_prec_tot_pro_minKeyTyped

    private void txt_prec_tot_pro_maxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_tot_pro_maxKeyTyped
        if (!is_decimal(evt)) {
            evt.setKeyChar('\0');
        }
    }//GEN-LAST:event_txt_prec_tot_pro_maxKeyTyped

    private void cbo_most_resItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_most_resItemStateChanged
        actualizar_inventario();
    }//GEN-LAST:event_cbo_most_resItemStateChanged

    private void txt_stock_uni_pro_maxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_uni_pro_maxKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_stock_uni_pro_maxKeyReleased

    private void txt_stock_tot_pro_minKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_tot_pro_minKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_stock_tot_pro_minKeyReleased

    private void txt_stock_tot_pro_maxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_tot_pro_maxKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_stock_tot_pro_maxKeyReleased

    private void txt_prec_ven_pro_minKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_ven_pro_minKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_prec_ven_pro_minKeyReleased

    private void txt_prec_ven_pro_maxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_ven_pro_maxKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_prec_ven_pro_maxKeyReleased

    private void txt_prec_uni_pro_minKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_uni_pro_minKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_prec_uni_pro_minKeyReleased

    private void txt_prec_uni_pro_maxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_uni_pro_maxKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_prec_uni_pro_maxKeyReleased

    private void txt_prec_tot_pro_minKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_tot_pro_minKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_prec_tot_pro_minKeyReleased

    private void txt_prec_tot_pro_maxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prec_tot_pro_maxKeyReleased
        actualizar_inventario();
    }//GEN-LAST:event_txt_prec_tot_pro_maxKeyReleased

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        pagina_actual++;
        lblPages.setText("Página " + pagina_actual + " de " + paginas);
        int take = (pagina_actual * Integer.parseInt(most_res));
        int skip = take - Integer.parseInt(most_res);
        actualizar_inventario(skip, take);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        pagina_actual = 1;
        lblPages.setText("Página " + pagina_actual + " de " + paginas);
        int take = (pagina_actual * Integer.parseInt(most_res));
        int skip = take - Integer.parseInt(most_res);
        actualizar_inventario(skip, take);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        pagina_actual--;
        lblPages.setText("Página " + pagina_actual + " de " + paginas);
        int take = (pagina_actual * Integer.parseInt(most_res));
        int skip = take - Integer.parseInt(most_res);
        actualizar_inventario(skip, take);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        pagina_actual = paginas;
        lblPages.setText("Página " + pagina_actual + " de " + paginas);
        int take = (pagina_actual * Integer.parseInt(most_res));
        int skip = take - Integer.parseInt(most_res);
        actualizar_inventario(skip, take);

    }//GEN-LAST:event_btnLastActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JComboBox cboModOrder;
    private javax.swing.JComboBox cboOrderBy;
    private javax.swing.JComboBox cbo_most_res;
    private javax.swing.JComboBox cbo_pres_caja;
    private javax.swing.JComboBox cbo_unid_med;
    public static javax.swing.JPanel cmp_filtro;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPages;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txt_busq_pro;
    private javax.swing.JTextField txt_prec_tot_pro_max;
    private javax.swing.JTextField txt_prec_tot_pro_min;
    private javax.swing.JTextField txt_prec_uni_pro_max;
    private javax.swing.JTextField txt_prec_uni_pro_min;
    private javax.swing.JTextField txt_prec_ven_pro_max;
    private javax.swing.JTextField txt_prec_ven_pro_min;
    private javax.swing.JTextField txt_stock_tot_pro_max;
    private javax.swing.JTextField txt_stock_tot_pro_min;
    private javax.swing.JTextField txt_stock_uni_pro_max;
    private javax.swing.JTextField txt_stock_uni_pro_min;
    // End of variables declaration//GEN-END:variables

    public void cabecera_tooltip() {
        String[] toolTipStr = {"PRODUCTO", "SERIE", "PRESENTACIÓN", "UNIDAD DE MEDIDA", "PRECIO DE VENTA", "PRECIO DE COMPRA UNITARIO", "PRECIO DE COMPRA TOTAL", "STOCK UNITARIO", "STOCK TOTAL"};
        ToolTipHeader header = new ToolTipHeader(tblInventario.getColumnModel());
        header.setToolTipStrings(toolTipStr);
        tblInventario.setTableHeader(header);
    }

    private void setPromt(String text, JTextField field) {
        PromptSupport.setPrompt(text, field);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, field);
    }

    private void setPromts() {
        setPromt("Ingrese nombre o serie de producto", txt_busq_pro);
        setPromt("Min", txt_stock_uni_pro_min);
        setPromt("Max", txt_stock_uni_pro_max);
        setPromt("Min", txt_stock_tot_pro_min);
        setPromt("Max", txt_stock_tot_pro_max);
        setPromt("Min", txt_prec_ven_pro_min);
        setPromt("Max", txt_prec_ven_pro_max);
        setPromt("Min", txt_prec_uni_pro_min);
        setPromt("Max", txt_prec_uni_pro_max);
        setPromt("Min", txt_prec_tot_pro_min);
        setPromt("Max", txt_prec_tot_pro_max);
    }

    private void setRendererCombos() {
        SeleccionRenderer renderer = new SeleccionRenderer();
        cbo_pres_caja.setRenderer(renderer);
        cbo_unid_med.setRenderer(renderer);
    }

    private void actualizar_inventario() {
        String busq_pro = txt_busq_pro.getText();
        String pres_pro = cbo_pres_caja.getSelectedItem().toString().toUpperCase();
        String unid_med = cbo_unid_med.getSelectedItem().toString().toUpperCase();
        String stock_uni_min = txt_stock_uni_pro_min.getText();
        String stock_uni_max = txt_stock_uni_pro_max.getText();
        String stock_tot_min = txt_stock_tot_pro_min.getText();
        String stock_tot_max = txt_stock_tot_pro_max.getText();
        String prec_ven_min = txt_prec_ven_pro_min.getText();
        String prec_ven_max = txt_prec_ven_pro_max.getText();
        String prec_uni_min = txt_prec_uni_pro_min.getText();
        String prec_uni_max = txt_prec_uni_pro_max.getText();
        String prec_tot_min = txt_prec_tot_pro_min.getText();
        String prec_tot_max = txt_prec_tot_pro_max.getText();
        most_res = cbo_most_res.getSelectedItem().toString();
        String orderby = "";
        /*switch (cboOrderBy.getSelectedItem().toString()) {
            case "":
                ;
                break;
            case valor2:
                ;
                break
            default:
                sentencias;
                break;
        }*/

        // Consultas
        sql_query = "SELECT * FROM v_productos ";
        sql_count = "SELECT *, COUNT(*) as contador FROM v_productos ";

        where = "";
        // Nombre o serie
        where += "WHERE (nomb_pro LIKE '%" + busq_pro + "%' OR seri_pro LIKE '%" + busq_pro + "%') ";
        // Presentación
        if (!pres_pro.equals("SELECCIONE..")) {
            where += "AND pres_pro = '" + pres_pro + "' ";
        }
        // Presentación
        if (!unid_med.equals("SELECCIONE..")) {
            where += "AND unme_pro = '" + unid_med + "' ";
        }
        // Mínimo stock unitario
        if (!stock_uni_min.equals("")) {
            where += "AND stun_pro >= " + stock_uni_min + " ";
        }
        // Máximo stock unitario
        if (!stock_uni_max.equals("")) {
            where += "AND stun_pro <= " + stock_uni_max + " ";
        }
        // Mínimo stock total
        if (!stock_tot_min.equals("")) {
            where += "AND stto_pro >= " + stock_tot_min + " ";
        }
        // Máximo stock total
        if (!stock_tot_max.equals("")) {
            where += "AND stto_pro <= " + stock_tot_max + " ";
        }
        // Mínimo precio de venta
        if (!prec_ven_min.equals("")) {
            where += "AND prev_pro >= " + prec_ven_min + " ";
        }
        // Máximo precio de venta
        if (!prec_ven_max.equals("")) {
            where += "AND prev_pro <= " + prec_ven_max + " ";
        }
        // Mínimo precio de compra unitario
        if (!prec_uni_min.equals("")) {
            where += "AND prcu_pro >= " + prec_uni_min + " ";
        }
        // Máximo precio de compra unitario
        if (!prec_uni_max.equals("")) {
            where += "AND prcu_pro <= " + prec_uni_max + " ";
        }
        // Mínimo precio de compra total
        if (!prec_tot_min.equals("")) {
            where += "AND prct_pro >= " + prec_tot_min + " ";
        }
        // Máximo precio de compra total
        if (!prec_tot_max.equals("")) {
            where += "AND prct_pro <= " + prec_tot_max + " ";
        }

        // Mostrar X resultados
        //sql += "LIMIT " + most_res;
        try {
            Connection Conexion = MySQL.getInstance().getConnection();

            PreparedStatement ps_count = Conexion.prepareStatement(sql_count + where);
            ResultSet rsCount = ps_count.executeQuery();

            rsCount.first();
            int count = rsCount.getInt(12);

            paginas = ((int) count / Integer.parseInt(most_res)) + 1;

            pagina_actual = 1;

            set_btn_pages_changed();

            PreparedStatement ps_query = Conexion.prepareStatement(sql_query + where + "LIMIT 0," + most_res);
            ResultSet rs = ps_query.executeQuery();

            DefaultTableModel odm = (DefaultTableModel) tblInventario.getModel();
            while (odm.getRowCount() > 0) {
                odm.removeRow(0);
            }
            rs.first();
            do {
                Object[] registro = {
                    rs.getString(2),
                    rs.getString(10),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(9),
                    rs.getString(8),
                    rs.getString(7)
                };
                odm.addRow(registro);
            } while (rs.next());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void actualizar_inventario(int skip, int take) {
        try {
            Connection Conexion = MySQL.getInstance().getConnection();

            PreparedStatement ps_query = Conexion.prepareStatement(sql_query + where + "LIMIT " + skip + "," + take);
            ResultSet rs = ps_query.executeQuery();

            DefaultTableModel odm = (DefaultTableModel) tblInventario.getModel();
            while (odm.getRowCount() > 0) {
                odm.removeRow(0);
            }
            rs.first();
            do {
                Object[] registro = {
                    rs.getString(2),
                    rs.getString(10),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(9),
                    rs.getString(8),
                    rs.getString(7)
                };
                odm.addRow(registro);
            } while (rs.next());
            set_btn_pages();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean is_int(KeyEvent evt) {
        try {
            int d = Integer.parseInt(String.valueOf(evt.getKeyChar()));
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean is_decimal(KeyEvent evt) {
        try {
            double d = Double.parseDouble(String.valueOf(evt.getKeyChar()));
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private void set_btn_pages_changed() {
        pagina_actual = 1;
        if (paginas <= 0) {
            pagina_actual = -1;
            lblPages.setText("Página 0 de 0");
            btnFirst.setEnabled(false);
            btnLast.setEnabled(false);
            btnPrevious.setEnabled(false);
            btnNext.setEnabled(false);
        } else if (paginas <= 1) {
            lblPages.setText("Página 1 de 1");
            btnFirst.setEnabled(false);
            btnLast.setEnabled(false);
            btnPrevious.setEnabled(false);
            btnNext.setEnabled(false);
        } else if (paginas > 1) {
            lblPages.setText("Página 1 de " + paginas);
            btnFirst.setEnabled(false);
            btnLast.setEnabled(true);
            btnPrevious.setEnabled(false);
            btnNext.setEnabled(true);
        }
    }

    private void set_btn_pages() {
        if (pagina_actual == paginas) {
            btnLast.setEnabled(false);
            btnNext.setEnabled(false);
            btnFirst.setEnabled(true);
            btnPrevious.setEnabled(true);
        } else if (pagina_actual == 1) {
            btnFirst.setEnabled(false);
            btnPrevious.setEnabled(false);
            btnLast.setEnabled(true);
            btnNext.setEnabled(true);
        } else if (pagina_actual > 1 && pagina_actual < paginas) {
            btnFirst.setEnabled(true);
            btnPrevious.setEnabled(true);
            btnLast.setEnabled(true);
            btnNext.setEnabled(true);
        }
    }

    class ToolTipHeader extends JTableHeader {

        String[] toolTips;

        public ToolTipHeader(TableColumnModel model) {
            super(model);
        }

        public String getToolTipText(MouseEvent e) {
            int col = columnAtPoint(e.getPoint());
            int modelCol = getTable().convertColumnIndexToModel(col);
            String retStr;
            try {
                retStr = toolTips[modelCol];
            } catch (NullPointerException ex) {
                retStr = "";
            } catch (ArrayIndexOutOfBoundsException ex) {
                retStr = "";
            }
            if (retStr.length() < 1) {
                retStr = super.getToolTipText(e);
            }
            return retStr;
        }

        public void setToolTipStrings(String[] toolTips) {
            this.toolTips = toolTips;
        }
    }

}
