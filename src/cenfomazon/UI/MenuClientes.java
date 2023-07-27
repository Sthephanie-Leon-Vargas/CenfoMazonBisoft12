/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfomazon.UI;

import cenfomazon.Gestor;
import cenfomazon.Model.Usuario.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author sleon
 */
public class MenuClientes extends javax.swing.JFrame {

    /**
     * Creates new form MenuClientes
     */
    Gestor gestor = new Gestor();
    public MenuClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_NombreUsuario.setText(getUserName());
    }
    
     public String getUserName() {
        String name = "";
 
        Usuario user = Login.getusuario();
        name = user.getNombre();
        return name;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        txt_NombreUsuario = new javax.swing.JLabel();
        txt_Bienvenido1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_CrearProforma = new javax.swing.JPanel();
        btn_crearProforma = new javax.swing.JButton();
        btn_RegistrarNaves = new javax.swing.JButton();
        btn_ListaInventario = new javax.swing.JButton();
        btn_RegistrarNaves1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        txt_NombreUsuario.setFont(new java.awt.Font("Artifakt Element Light", 1, 18)); // NOI18N
        txt_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_NombreUsuario.setText("Nombre Usuario");

        txt_Bienvenido1.setFont(new java.awt.Font("Artifakt Element Light", 1, 18)); // NOI18N
        txt_Bienvenido1.setForeground(new java.awt.Color(255, 255, 255));
        txt_Bienvenido1.setText("Bienvenido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txt_Bienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Bienvenido1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setLayout(new java.awt.GridBagLayout());

        btn_CrearProforma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Artifakt Element Light", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        btn_crearProforma.setFont(new java.awt.Font("Artifakt Element Light", 0, 12)); // NOI18N
        btn_crearProforma.setText("Crear proforma");
        btn_crearProforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearProformaActionPerformed(evt);
            }
        });

        btn_RegistrarNaves.setFont(new java.awt.Font("Artifakt Element Light", 0, 12)); // NOI18N
        btn_RegistrarNaves.setText("Registrar naves");
        btn_RegistrarNaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarNavesActionPerformed(evt);
            }
        });

        btn_ListaInventario.setFont(new java.awt.Font("Artifakt Element Light", 0, 12)); // NOI18N
        btn_ListaInventario.setText("Ver proformas");
        btn_ListaInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaInventarioActionPerformed(evt);
            }
        });

        btn_RegistrarNaves1.setFont(new java.awt.Font("Artifakt Element Light", 0, 12)); // NOI18N
        btn_RegistrarNaves1.setText("Listar Naves");
        btn_RegistrarNaves1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarNaves1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_CrearProformaLayout = new javax.swing.GroupLayout(btn_CrearProforma);
        btn_CrearProforma.setLayout(btn_CrearProformaLayout);
        btn_CrearProformaLayout.setHorizontalGroup(
            btn_CrearProformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_CrearProformaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_RegistrarNaves, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_RegistrarNaves1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_crearProforma, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btn_ListaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        btn_CrearProformaLayout.setVerticalGroup(
            btn_CrearProformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_CrearProformaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_CrearProformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_CrearProformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_crearProforma)
                        .addComponent(btn_ListaInventario)
                        .addComponent(btn_RegistrarNaves1))
                    .addComponent(btn_RegistrarNaves))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btn_CrearProforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btn_CrearProforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 113;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel3.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearProformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearProformaActionPerformed
        MenuProforma abrir = new MenuProforma();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_crearProformaActionPerformed

    private void btn_ListaInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaInventarioActionPerformed
      ListarProformas lstProforma= new ListarProformas();
      lstProforma.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_btn_ListaInventarioActionPerformed

    private void btn_RegistrarNavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarNavesActionPerformed
       RegistroNaves rNaves = new RegistroNaves();
        rNaves.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_RegistrarNavesActionPerformed
ListarNaves naves;
    private void btn_RegistrarNaves1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarNaves1ActionPerformed
       if (naves != null) {//si existe una ventana, la cierra.
            naves.dispose();
        }
        naves = new ListarNaves(2);
        naves.setVisible(true);
        this.setResizable(true);
    }//GEN-LAST:event_btn_RegistrarNaves1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new MenuClientes().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MenuClientes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MenuClientes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MenuClientes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MenuClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_CrearProforma;
    private javax.swing.JButton btn_ListaInventario;
    private javax.swing.JButton btn_RegistrarNaves;
    private javax.swing.JButton btn_RegistrarNaves1;
    private javax.swing.JButton btn_crearProforma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt_Bienvenido1;
    private javax.swing.JLabel txt_NombreUsuario;
    // End of variables declaration//GEN-END:variables
}
