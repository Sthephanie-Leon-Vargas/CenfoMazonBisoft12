/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfomazon.UI;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author sleon
 */
public class TablaUIVedendedor extends DefaultTableCellRenderer {

//    private JButton botonAceptar;
//    private JButton botonCancelar;
    private ImageIcon iconoAceptar;
//    private ImageIcon iconoCancelar;
    
            
    @Override
    public Component getTableCellRendererComponent(JTable tabla, Object valor, boolean seleccionado, boolean hasFocus, int fila, int columna) {
//        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 2));
//        if (valor instanceof JButton) {
//            JButton boton = (JButton) valor;
//            
//            // Crear los botones de Aceptar y Cancelar
//            botonAceptar = new JButton("Aceptar");
//            botonCancelar = new JButton("Cancelar");
//            
//            // Agregar los botones al panel
//            panelBotones.add(botonAceptar);
//            panelBotones.add(botonCancelar);
//            
//            // Devolver el panel con los botones en lugar del botón original
//            return panelBotones;
//        }
        
        iconoAceptar = new ImageIcon(ClassLoader.getSystemResource("cenfomazon/UI/Imagenes/editarTabla.png"));

//        iconoCancelar = new ImageIcon(ClassLoader.getSystemResource("cenfomazon/UI/Imagenes/cancel.png"));
        setHorizontalAlignment(SwingConstants.CENTER);
        if (valor instanceof JButton) {
            JButton botonAceptar1 = (JButton) valor;
//            JButton botonCancelar1 = (JButton) valor;
            if (!seleccionado) {
                botonAceptar1.setForeground(tabla.getSelectionForeground());
                botonAceptar1.setIcon(iconoAceptar);
            }
        }

        return super.getTableCellRendererComponent(tabla, valor, seleccionado, hasFocus, fila, columna);
    }

}
