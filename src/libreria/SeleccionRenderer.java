package libreria;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;

public class SeleccionRenderer extends JLabel implements ListCellRenderer<Object> {

    public SeleccionRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.toString());
        if (isSelected) {
            setBackground(new java.awt.Color(57, 105, 138));
            setForeground(new java.awt.Color(255, 255, 255));
        } else {
            setBackground(new java.awt.Color(255, 255, 255));
            setForeground(new java.awt.Color(0, 0, 0));
        }
        if (value.toString().equals("Seleccione..")) {
            setFont(new java.awt.Font("Tahoma", 2, 11));
            if (isSelected) {
                setForeground(new java.awt.Color(255, 255, 255));
            } else {
                setForeground(new java.awt.Color(102, 102, 102));
            }
        } else {
            setFont(new java.awt.Font("Tahoma", 0, 11));
        }
        Border paddingBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(null, paddingBorder));
        return this;
    }
}
