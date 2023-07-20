
package cenfomazon.UI;

import cenfomazon.Gestor;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuesto;
import cenfomazon.Model.Usuario.Usuario;
import cenfomazon.Model.Repuesto.RepuestoC;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class MenuProforma extends javax.swing.JFrame {
    DefaultListModel miModel = new DefaultListModel();  
    
    public MenuProforma() {
        initComponents();
        llenarMarcas();
        llenarVendedor();
        lst_Repuestos.setModel(miModel);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_idproforma = new javax.swing.JLabel();
        cbo_VendedorList = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbo_marcaRepuesto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_Repuestos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Artifakt Element Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Proforma");

        btn_Volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_Volver.setFont(new java.awt.Font("Artifakt Element Light", 2, 14)); // NOI18N
        btn_Volver.setForeground(new java.awt.Color(51, 153, 255));
        btn_Volver.setText("Volver");
        btn_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Volver)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Volver))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de proforma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Artifakt Element Light", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel2.setText("Seleccionar vendedor:");

        jLabel3.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel3.setText("Proforma No.:");

        txt_idproforma.setFont(new java.awt.Font("Artifakt Element Light", 1, 14)); // NOI18N
        txt_idproforma.setText("Número");

        cbo_VendedorList.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        cbo_VendedorList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel4.setText("Lista de repuestos:");

        cbo_marcaRepuesto.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        cbo_marcaRepuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
<<<<<<< HEAD
        cbo_marcaRepuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_marcaRepuestoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbo_marcaRepuestoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbo_marcaRepuestoMouseReleased(evt);
=======
        cbo_marcaRepuesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_marcaRepuestoItemStateChanged(evt);
>>>>>>> master
            }
        });
        cbo_marcaRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_marcaRepuestoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel5.setText("Marca de repuesto:");

        jScrollPane2.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N

        lst_Repuestos.setFont(new java.awt.Font("Artifakt Element Light", 0, 12)); // NOI18N
        lst_Repuestos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Elige marca de repuesto" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lst_Repuestos);

        jScrollPane3.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jLabel6.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel6.setText("Agregar a proforma:");

        jButton2.setText("<<");

        jButton3.setText(">>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idproforma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_VendedorList, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_marcaRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(249, 249, 249)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idproforma)
                    .addComponent(cbo_VendedorList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_marcaRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(96, 96, 96)))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(164, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addGap(145, 145, 145)))
        );

        jButton1.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jButton1.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void btn_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VolverMouseClicked
        MenuClientes volver = new MenuClientes();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverMouseClicked

    private void cbo_marcaRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_marcaRepuestoActionPerformed
<<<<<<< HEAD
        System.out.println(cbo_marcaRepuesto.getSelectedItem());
        //MarcaRepuesto marcaRepuesto =  (MarcaRepuesto) cbo_marcaRepuesto.getSelectedItem();
        Gestor gestor = new Gestor();                
        ArrayList<RepuestoC> listaRepuestos = gestor.listarRepuestos(1);
            
            for (int i=0; i <listaRepuestos.size();i++) {
               miModel.addElement(listaRepuestos.get(i).getNombre());
            }
    }//GEN-LAST:event_cbo_marcaRepuestoActionPerformed

    private void cbo_marcaRepuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_marcaRepuestoMouseClicked
        
    }//GEN-LAST:event_cbo_marcaRepuestoMouseClicked

    private void cbo_marcaRepuestoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_marcaRepuestoMouseReleased
        
    }//GEN-LAST:event_cbo_marcaRepuestoMouseReleased

    private void cbo_marcaRepuestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_marcaRepuestoMouseExited
        
      
        
    }//GEN-LAST:event_cbo_marcaRepuestoMouseExited
=======

        //get select value
        //String marcaSeleccionda = cbo_marcaRepuesto.getSelectedItem().toString();
        //txt_idproforma.setText(marcaSeleccionda);        
    }//GEN-LAST:event_cbo_marcaRepuestoActionPerformed

    private void cbo_marcaRepuestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_marcaRepuestoItemStateChanged

    }//GEN-LAST:event_cbo_marcaRepuestoItemStateChanged
>>>>>>> master


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
            java.util.logging.Logger.getLogger(MenuProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProforma().setVisible(true);
            }
        });
    }
    
    
    private void llenarMarcas(){
   
        Gestor gestor = new Gestor();
        ArrayList<MarcaRepuesto> listaMarcaR = gestor.listaMarcaR();

        cbo_marcaRepuesto.removeAllItems();
        cbo_marcaRepuesto.addItem("");

        for (int i=0; i <listaMarcaR.size();i++) {
           cbo_marcaRepuesto.addItem(listaMarcaR.get(i).getMarca());
    }
     
   
 }
    
    private void llenarVendedor(){
   
            Gestor gestor = new Gestor();
            ArrayList<Usuario> listaVendedores = gestor.listarVendedor();
            cbo_VendedorList.removeAllItems();
            cbo_VendedorList.addItem("");

         for (int i=0; i <listaVendedores.size();i++) {
            cbo_VendedorList.addItem(listaVendedores.get(i).getNombre()+" "+listaVendedores.get(i).getApellido1());
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cbo_VendedorList;
    private javax.swing.JComboBox<String> cbo_marcaRepuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lst_Repuestos;
    private javax.swing.JLabel txt_idproforma;
    // End of variables declaration//GEN-END:variables
}


