/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.modelos;

public class Proveedores {
    
    //Atributos de Proveedores//
    private String nombre;
    private String apellido;
    private String cuit;
    private String telefono;
    private String email;
    private String direccion;
    private String ciudad;

    //Constructor Proveedores//

    public Proveedores(String nombre, String apellido, String cuit, String telefono, String email, String direccion, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
  
    //Setters de Proveedores//

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRazonSocial(String cuit) {
        this.cuit = cuit;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    //Getters de Proveedores//

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRazonSocial() {
        return cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    
}
