/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.vistas.proveedores;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import org.erp111.modelos.Proveedor;

/**
 *
 * @author lucas
 */
public class ProveedorCellRenderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        ModeloTablaProveedor modeloTablaProveedor = (ModeloTablaProveedor) table.getModel();
        
        Proveedor proveedor = modeloTablaProveedor.getProveedorSeleccionado(row);
        
        if (proveedor.estaDadoDeBaja()) {
            
            setBackground(new Color(255,80,80));
            setForeground(Color.black);
        }
        else{
            setBackground(Color.WHITE);
            setForeground(Color.black);
        }
        
        
        setText(value !=null ? value.toString() : "");
        final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        return c;
        //return this;
    }

    
    
    
}
