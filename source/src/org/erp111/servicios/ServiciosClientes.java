/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.servicios;

import org.erp111.repositorios.RepositorioClientes;
import org.erp111.modelos.Cliente;
/**
 *
 * @author Laboratorio
 */
public class ServiciosClientes {
    
    private RepositorioClientes repositorioClientes;
    
    public ServiciosClientes(){
        this.repositorioClientes = new RepositorioClientes();
    }
    
    public void ValidarNombre(String Nombre){
        if(Nombre.length()==0)
        {
            throw new IllegalArgumentException("El nombre esta vacio");
        }       
    }
    public void ValidarApellido(String Apellido){
        if(Apellido.length()==0)
        {
            throw new IllegalArgumentException("El apellido esta vacio");
        }
    }
         public void ValidarTelefono(String Telefono){
        if(Telefono.length()==0)
        {
            throw new IllegalArgumentException("El telefono esta vacio");
        }       
    }
      public void ValidarDireccion(String Direccion){
        if(Direccion.length()==0)
        {
            throw new IllegalArgumentException("La direccion esta vacia");
        }       
    }
       public void ValidarLocalidad(String Localidad){
        if(Localidad.length()==0)
        {
            throw new IllegalArgumentException("La localidad esta vacia");
        }      
    }
        public void ValidarCUIT(String CUIT){
        if(CUIT.length()==0)
        {
            throw new IllegalArgumentException("El CUIT esta vacio");
        }       
    }
        public void GuardarDatosClientes(String Nombre,String Apellido,String Telefono,String Direccion,String Localidad,String CUIT)
        {
            this.ValidarNombre(Nombre);
            this.ValidarApellido(Apellido);
            this.ValidarDireccion(Direccion);
            this.ValidarLocalidad(Localidad);
            this.ValidarTelefono(Telefono);
            this.ValidarCUIT(CUIT);
                       
            Cliente clientes = new Cliente(Nombre,Apellido, Telefono, Direccion, Localidad, CUIT);
            
            this.repositorioClientes.guardar(clientes);
        }
        
        
    
}
