/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cenfomazon.UI;

import cenfomazon.Gestor;
import cenfomazon.Model.DetalleProforma.DetalleProforma;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuesto;
import cenfomazon.Model.Proforma.Proforma;
import cenfomazon.Model.Repuesto.RepuestoC;
import cenfomazon.Model.Usuario.Usuario;
import cenfomazon.Comportamiento.Memento.Gestor_Memento;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author rociomontero
 */
public class MenuProforma extends javax.swing.JFrame {

    /**
     * Creates new form MenuProforma
     */
    public MenuProforma() {
        initComponents();
        llenarMarcas();
        llenarVendedor();
        Lbl_NoProforma.setText(String.valueOf(codigoProforma()));
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Agregar = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_Repuesto = new javax.swing.JList<>();
        btn_Add = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        cbo_VendedorList = new javax.swing.JComboBox<>();
        cbo_marcaRepuesto = new javax.swing.JComboBox<>();
        Lbl_NoProforma = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Artifakt Element Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Proforma");

        btn_Volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_Volver.setFont(new java.awt.Font("Artifakt Element Light", 0, 12)); // NOI18N
        btn_Volver.setForeground(new java.awt.Color(0, 102, 204));
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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Volver)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Volver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Proforma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Artifakt Element Light", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel2.setText("Proforma No.:");

        jLabel3.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel3.setText("Seleccionar Vendedor:");

        jLabel4.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel4.setText("Marca Repuesto:");

        jLabel5.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel5.setText("Agregar a proforma:");

        jLabel6.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jLabel6.setText("Lista de repuestos:");

        jList_Agregar.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jList_Agregar.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { "No se ha agregado respuestos" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList_Agregar.setToolTipText("");
        jScrollPane1.setViewportView(jList_Agregar);

        jList_Repuesto.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        jList_Repuesto.setModel(new javax.swing.AbstractListModel<Object>() {
            String[] strings = { "Selecciona Marca Repuesto" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList_Repuesto);

        btn_Add.setText(">>");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_remover.setText("<<");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        cbo_VendedorList.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        cbo_VendedorList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_VendedorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_VendedorListActionPerformed(evt);
            }
        });

        cbo_marcaRepuesto.setFont(new java.awt.Font("Artifakt Element Light", 0, 14)); // NOI18N
        cbo_marcaRepuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_marcaRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_marcaRepuestoActionPerformed(evt);
            }
        });

        Lbl_NoProforma.setFont(new java.awt.Font("Artifakt Element Light", 1, 14)); // NOI18N
        Lbl_NoProforma.setText("####");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_marcaRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lbl_NoProforma, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_VendedorList, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Add, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_remover, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cbo_VendedorList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_NoProforma))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_marcaRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_remover)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btn_Guardar.setText("Guardar");
        btn_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_GuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VolverMouseClicked
        // TODO add your handling code here:
        MenuClientes volver = new MenuClientes();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_VolverMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cbo_marcaRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_marcaRepuestoActionPerformed
        // TODO add your handling code here:

       if (cbo_marcaRepuesto.getSelectedItem()== null){
         System.out.println("Inicializar");
       }else{
           Object marcaRepuesto = cbo_marcaRepuesto.getSelectedItem();
           MarcaRepuesto marcaR = (MarcaRepuesto) marcaRepuesto;
          
           llenarRepuestos(marcaR.getIdMarcaRepuesto());
       }
       

    }//GEN-LAST:event_cbo_marcaRepuestoActionPerformed
    
    private void btn_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarMouseClicked
        // TODO add your handling code here:
        Gestor gestor = new Gestor();
        
        int vendedorC = 0;
        if (cbo_VendedorList.getSelectedItem() == ""){
            vendedorC = gestor.codigoVendedor();
            System.out.println(vendedorC); 
           
        } else {          
          
          Object vendedorCode = cbo_VendedorList.getSelectedItem();
           Usuario vendedor = (Usuario) vendedorCode;
           vendedorC = vendedor.getId_usuario();
           System.out.println(vendedorC);
        }
        Usuario user = Login.getusuario();
        int idCliente = user.getId_usuario();
        Proforma pProforma = new Proforma(idCliente,vendedorC,"Nueva");        
        gestor.crearProforma(pProforma);
        
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(MenuProforma.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i=0; i <dlm.getSize() ;i++) {
          System.out.println(codigoProforma());
          int codigoProforma = codigoProforma()-1;
          RepuestoC repuesto = (RepuestoC) dlm.get(i);
          int repuestoC = repuesto.getIdRepuesto();
          DetalleProforma DP = new DetalleProforma(codigoProforma,repuestoC); 

          gestor.registrarDetalleProforma(DP);
        }
        
        MenuClientes abrir = new MenuClientes();
        abrir.setVisible(true);
        this.setVisible(false);
  
        
    }//GEN-LAST:event_btn_GuardarMouseClicked
    private DefaultListModel<Object> dlm = new DefaultListModel();
 
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        
       
        Object repuestoS = jList_Repuesto.getSelectedValue();        
        RepuestoC repuesto = (RepuestoC) repuestoS;

        
        jList_Agregar.setModel(dlm);
        dlm.add(0,repuesto);
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        int index = jList_Agregar.getSelectedIndex();
        dlm.removeElementAt(index);

        
    }//GEN-LAST:event_btn_removerActionPerformed

    private void cbo_VendedorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_VendedorListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_VendedorListActionPerformed


    /**
     * @param args the command line arguments
     */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProforma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_NoProforma;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton btn_remover;
    private javax.swing.JComboBox<Object> cbo_VendedorList;
    private javax.swing.JComboBox<Object> cbo_marcaRepuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<Object> jList_Agregar;
    private javax.swing.JList<Object> jList_Repuesto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void llenarMarcas() {
        Gestor gestor = new Gestor();
        ArrayList<MarcaRepuesto> listaMarcaR = gestor.listaMarcaR();

        cbo_marcaRepuesto.removeAllItems();
        
        for (int i=0; i <listaMarcaR.size();i++) {
           cbo_marcaRepuesto.addItem(listaMarcaR.get(i));
           
        }
    }

    private void llenarVendedor() {
       Gestor gestor = new Gestor();
            ArrayList<Usuario> listaVendedores = gestor.listarVendedor();
            cbo_VendedorList.removeAllItems();
            cbo_VendedorList.addItem("");

         for (int i=0; i <listaVendedores.size();i++) {
            //cbo_VendedorList.addItem(listaVendedores.get(i).getNombre()+" "+listaVendedores.get(i).getApellido1());
            cbo_VendedorList.addItem(listaVendedores.get(i));
       }
    }

    private void llenarRepuestos(int codigo) {
            Gestor gestor = new Gestor();         
            ArrayList<RepuestoC> listaRepuesto = gestor.listarRepuestos(codigo);
            DefaultListModel listModel = new DefaultListModel();
            for(int i=0; i<listaRepuesto.size(); i++) {
                //Añadir cada elemento del ArrayList en el modelo de la lista
                //listModel.add(i, listaRepuesto.get(i).getNombre());
                listModel.addElement(listaRepuesto.get(i));
             
            }
            jList_Repuesto.setModel(listModel);
    }

    private int codigoProforma() {
        Gestor gestor = new Gestor();
        int codigo = gestor.codigoProfroma();
        return codigo;
    }


}
