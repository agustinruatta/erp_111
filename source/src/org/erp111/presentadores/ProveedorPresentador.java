/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.presentadores;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.erp111.modelos.Proveedor;
import org.erp111.vistas.proveedores.VistaProveedor;
import org.erp111.servicios.ServicioProveedor;
import org.erp111.vistas.proveedores.ModeloTablaProveedor;

/**
 *
 * @author lucas
 */
public class ProveedorPresentador {
    private VistaProveedor vistaProveedores;
    private ServicioProveedor servicioProveedor;
    
    public ProveedorPresentador (VistaProveedor vistaProveedores){
        this.vistaProveedores = vistaProveedores;
        this.servicioProveedor = new ServicioProveedor();
    }
    
    public void botonBuscarApretado(JComboBox proveedorBox, JTextField consultaField){
        String filtro = proveedorBox.getSelectedItem().toString();
        String consulta = consultaField.getText();
        
        ArrayList<Proveedor> proveedores = this.servicioProveedor.getProveedores(filtro, consulta);
        
        this.rellenarTablaProveedores(proveedores);
    }
    
    public void rellenarTablaProveedores(ArrayList<Proveedor> proveedores) {
        
        ModeloTablaProveedor modeloTablaProveedor = new ModeloTablaProveedor(proveedores);
        this.vistaProveedores.getProveedorTable().setModel(modeloTablaProveedor);
    }
    
    public void botonEditarApretado(){
        int filaSeleccionada = this.vistaProveedores.getProveedorTable().getSelectedRow();
        ModeloTablaProveedor modelo = (ModeloTablaProveedor) this.vistaProveedores.getProveedorTable().getModel();
        Proveedor proveedorSeleccionado = modelo.getProveedorSeleccionado(filaSeleccionada);
        this.vistaProveedores.getIdTextField().setText(Integer.toString(proveedorSeleccionado.getCodigoProveedor()));
        this.vistaProveedores.getNombreTextField().setText(proveedorSeleccionado.getNombre());
        this.vistaProveedores.getApellidoTextField().setText(proveedorSeleccionado.getApellido());
        this.vistaProveedores.getCuitTextField().setText(proveedorSeleccionado.getCuit());
        this.vistaProveedores.getTelefonoTextField().setText(proveedorSeleccionado.getTelefono());
        this.vistaProveedores.getEmailTextField().setText(proveedorSeleccionado.getEmail());
        this.vistaProveedores.getDireccionTextField().setText(proveedorSeleccionado.getDireccion());
        this.vistaProveedores.getCiudadTextField().setText(proveedorSeleccionado.getLocalidad());
        this.vistaProveedores.getProvinciaTextField().setText(proveedorSeleccionado.getProvincia());
    }
    
    public void botonDarDeBajaApretado(){
        int filaSeleccionada = this.vistaProveedores.getProveedorTable().getSelectedRow();
        
        ModeloTablaProveedor modelo = (ModeloTablaProveedor) this.vistaProveedores.getProveedorTable().getModel();
        
        Proveedor proveedorSeleccionado = modelo.getProveedorSeleccionado(filaSeleccionada);
        
        this.servicioProveedor.darBaja(proveedorSeleccionado);
        
        JOptionPane.showMessageDialog(null, "Proveedor dado de baja!");
    }
    
    public void botonGuardarApretado(){
        //Tomo los datos ingresados por el usuario
        String idString = this.vistaProveedores.getIdTextField().getText();
        String nombre = this.vistaProveedores.getNombreTextField().getText();
        String apellido = this.vistaProveedores.getApellidoTextField().getText();
        String cuit = this.vistaProveedores.getCuitTextField().getText();
        String telefono = this.vistaProveedores.getTelefonoTextField().getText();
        String email = this.vistaProveedores.getEmailTextField().getText();
        String direccion = this.vistaProveedores.getDireccionTextField().getText();
        String localidad = this.vistaProveedores.getCiudadTextField().getText();
        String provincia = this.vistaProveedores.getProvinciaTextField().getText();
        
        //Intento guardar los datos, para ello debo validarlos
        try {
            this.servicioProveedor.guardarProveedorRepositorio(idString,nombre, apellido, cuit, telefono,email, direccion, localidad, provincia);
            JOptionPane.showMessageDialog(null, "Guardado con éxito!");
            //Limpiar Campos
            this.vistaProveedores.getIdTextField().setText("");
            this.vistaProveedores.getNombreTextField().setText("");
            this.vistaProveedores.getApellidoTextField().setText("");
            this.vistaProveedores.getCuitTextField().setText("");
            this.vistaProveedores.getTelefonoTextField().setText("");
            this.vistaProveedores.getEmailTextField().setText("");
            this.vistaProveedores.getDireccionTextField().setText("");
            this.vistaProveedores.getCiudadTextField().setText("");
            this.vistaProveedores.getProvinciaTextField().setText("");
        } catch (IllegalArgumentException exceptionValidarDatos) {
            JOptionPane.showMessageDialog(null ,exceptionValidarDatos.getMessage());
        }

        
   }
    
    public void botonCancelarEdicionApretado(){
            this.vistaProveedores.getIdTextField().setText("");
            this.vistaProveedores.getNombreTextField().setText("");
            this.vistaProveedores.getApellidoTextField().setText("");
            this.vistaProveedores.getCuitTextField().setText("");
            this.vistaProveedores.getTelefonoTextField().setText("");
            this.vistaProveedores.getEmailTextField().setText("");
            this.vistaProveedores.getDireccionTextField().setText("");
            this.vistaProveedores.getCiudadTextField().setText("");
            this.vistaProveedores.getProvinciaTextField().setText("");
    }
}
