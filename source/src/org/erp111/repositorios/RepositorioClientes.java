/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.repositorios;

import org.erp111.modelos.ModeloClientes;
/**
 *
 * @author Laboratorio
 */
public class RepositorioClientes {
    
    private static ModeloClientes ClienteGuardado;
    private static ModeloClientes ClienteEditado;
    private static ModeloClientes ClienteBorrado;
    
    public void guardar(ModeloClientes modeloClientes){
        
        this.ClienteGuardado = modeloClientes;
    }
    public void Editar(ModeloClientes modeloClientes){
        
        this.ClienteEditado = modeloClientes;
    }
    public void Eliminar(ModeloClientes modeloClientes){
        
        this.ClienteBorrado=modeloClientes;
    }
    
    
}
