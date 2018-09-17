/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.modelos;

/**
 *
 * @author Laboratorio
 */
public class ModeloClientes {
    
    private String NombreApellido;
    private String Telefono;
    private String Direccion;
    private String Localidad;
    private String Cuit;
       

public ModeloClientes(String NombreApellido, String Telefono, String Direccion, String Localidad, String Cuil){

    this.NombreApellido = NombreApellido;
    this.Telefono = Telefono;
    this.Direccion = Direccion;
    this.Localidad = Localidad;
    this.Cuit = Cuit;

    }

}

