/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.presentadores;

import com.sun.org.omg.CORBA.ExceptionDescription;
import javax.swing.JOptionPane;
import org.erp111.servicios.ServiciosClientes;
import org.erp111.vistas.VistaClientes;

/**
 *
 * @author Laboratorio
 */
public class PresentadorCliente {
    
    private VistaClientes vistaClientes;
    private ServiciosClientes serviciosClientes;

    public PresentadorCliente(VistaClientes vistaClientes) {
        this.vistaClientes=vistaClientes;
        
        this.serviciosClientes = new ServiciosClientes();
        
    }
    public void GuardarClientes(){
        //Obtenemos los datos
        String Nombre = this.vistaClientes.getNombreTextField().getText();
        String Apellido = this.vistaClientes.getApellidoTextField().getText();
        String Telefono = this.vistaClientes.getTelefonoTextField().getText();
        String Direccion = this.vistaClientes.getDireccion().getText();
        String Localidad = this.vistaClientes.getLocalidad().getText();
        String CUIT = this.vistaClientes.getCUIT().getText();
        
        try{
            //intenta guardar los datos
            this.serviciosClientes.GuardarDatosClientes(Nombre,Apellido,Telefono,Direccion,Localidad,CUIT);
            
       //limpia los campos
        this.vistaClientes.getNombreTextField().setText("");
        this.vistaClientes.getApellidoTextField().setText("");
        this.vistaClientes.getTelefonoTextField().setText("");
        this.vistaClientes.getDireccion().setText("");
        this.vistaClientes.getLocalidad().setText("");
        this.vistaClientes.getCUIT().setText("");
        
            JOptionPane.showMessageDialog(null,"Guardado con exito");
                            
        }
        catch(IllegalArgumentException excepcion){
            JOptionPane.showMessageDialog(null,excepcion.getMessage());
        }
        
    }
    
    
}
