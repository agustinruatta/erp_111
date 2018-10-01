/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.presentadores;

import javax.swing.JOptionPane;
import org.erp111.vistas.proveedores.VistaProveedores;
import org.erp111.modelos.Proveedores;
import org.erp111.servicios.ServicioProveedores;

/**
 *
 * @author lucas
 */
public class PresentadorProveedores {
    private VistaProveedores vistaProveedores;
    private ServicioProveedores servicioProveedores;
    
    public PresentadorProveedores (VistaProveedores vistaProveedores){
        this.vistaProveedores = vistaProveedores;
    }
    
    public void botonBuscarApretado(){
        
    }
    
    public void botonEditarApretado(){
        
    }
    
    public void botonDarDeBajaApretado(){
        
    }
    
    public void botonGuardarApretado(){
        //Tomo los datos ingresados por el usuario
        String nombre = this.vistaProveedores.getNombreTextField().getText();
        String apellido = this.vistaProveedores.getApellidoTextField().getText();
        String cuit = this.vistaProveedores.getCuitTextField().getText();
        String telefono = this.vistaProveedores.getTelefonoTextField().getText();
        String email = this.vistaProveedores.getEmailTextField().getText();
        String direccion = this.vistaProveedores.getDireccionTextField().getText();
        String ciudad = this.vistaProveedores.getCiudadTextField().getText();
        String provincia = this.vistaProveedores.getCiudadTextField().getText();
        
        //Intento guardar los datos, para ello debo validarlos
        try {
            this.servicioProveedores.guardarProveedor(nombre, apellido, cuit, telefono,email, direccion, ciudad, provincia);
        } catch (IllegalArgumentException exceptionValidarDatos) {
            JOptionPane.showMessageDialog(null ,exceptionValidarDatos.getMessage());
        }

        //Limpiar Campos
            this.vistaProveedores.getNombreTextField().setText("");
            this.vistaProveedores.getApellidoTextField().setText("");
            this.vistaProveedores.getCuitTextField().setText("");
            this.vistaProveedores.getTelefonoTextField().setText("");
            this.vistaProveedores.getEmailTextField().setText("");
            this.vistaProveedores.getDireccionTextField().setText("");
            this.vistaProveedores.getCiudadTextField().setText("");
            this.vistaProveedores.getProvinciaTextField().setText("");
   }
    
    public void botonCancelarEdicionApretado(){
        
    }
}
