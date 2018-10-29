/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.vistas.proveedores;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import org.erp111.modelos.Proveedor;

/**
 *
 * @author brzig
 */
public class ModeloTablaProveedor extends AbstractTableModel{
    private static final int COLUMNA_NOMBRE = 0;
    private final int COLUMNA_APELLIDO = 1;
    private final int COLUMNA_CUIT = 2;
    private final int COLUMNA_TELEFONO = 3;
    private final int COLUMNA_EMAIL = 4;
    private final int COLUMNA_DIRECCION = 5;
    private final int COLUMNA_LOCALIDAD = 6;
    private final int COLUMNA_PROVINCIA = 7;
    private final int COLUMNA_ESTADO = 8;
    
    private ArrayList<Proveedor> proveedorAMostrar;

    public ModeloTablaProveedor(ArrayList<Proveedor> proveedorAMostrar) {
        this.proveedorAMostrar = proveedorAMostrar;
    }
    
    public Proveedor getProveedorSeleccionado(int filaSeleccionada){
        return proveedorAMostrar.get(filaSeleccionada);
    }

    @Override
    public int getRowCount() {
        return this.proveedorAMostrar.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case COLUMNA_NOMBRE:
                return this.proveedorAMostrar.get(rowIndex).getNombre();
            case COLUMNA_APELLIDO:
                return this.proveedorAMostrar.get(rowIndex).getApellido();
            case COLUMNA_CUIT:
                return this.proveedorAMostrar.get(rowIndex).getCuit();
            case COLUMNA_TELEFONO:
                return this.proveedorAMostrar.get(rowIndex).getTelefono();
            case COLUMNA_EMAIL:
                return this.proveedorAMostrar.get(rowIndex).getEmail();
            case COLUMNA_DIRECCION:
                return this.proveedorAMostrar.get(rowIndex).getDireccion();
            case COLUMNA_LOCALIDAD:
                return this.proveedorAMostrar.get(rowIndex).getLocalidad();
            case COLUMNA_PROVINCIA:
                return this.proveedorAMostrar.get(rowIndex).getProvincia();
            case COLUMNA_ESTADO:
                return this.proveedorAMostrar.get(rowIndex).getEstado();
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case COLUMNA_NOMBRE:
                return "Nombre";
            case COLUMNA_APELLIDO:
                return "Apellido";
            case COLUMNA_CUIT:
                return "Cuit";
            case COLUMNA_TELEFONO:
                return "Telefono";
            case COLUMNA_EMAIL:
                return "email";
            case COLUMNA_DIRECCION:
                return "Direccion";
            case COLUMNA_LOCALIDAD:
                return "Localidad";
            case COLUMNA_PROVINCIA:
                return "Provincia";
            case COLUMNA_ESTADO:
                return "Estado";
            default:
                throw new IllegalArgumentException();
        }
    }
    
    
    
    
}
