/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfomazon.UI;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author sleon
 */
public class TablaUI extends DefaultTableCellRenderer {

    private ImageIcon _botonIcon;

    @Override
    public Component getTableCellRendererComponent(JTable tabla, Object valor,
            boolean seleccionado, boolean hasFocus, int fila, int columna) {
        _botonIcon = new ImageIcon(ClassLoader.getSystemResource("cenfomazon/UI/Imagenes/editarTabla.png"));
        setHorizontalAlignment(SwingConstants.CENTER);
        if (valor instanceof JButton) {
            JButton boton = (JButton) valor;
            if (!seleccionado) {
                boton.setForeground(tabla.getSelectionForeground());
                boton.setIcon(_botonIcon);
            }
            return boton;
        }

        return super.getTableCellRendererComponent(tabla, valor, seleccionado,
                hasFocus, fila, columna);
    }

}
