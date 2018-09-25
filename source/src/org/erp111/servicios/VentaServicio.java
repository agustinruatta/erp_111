/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.servicios;

import java.util.ArrayList;
import org.erp111.modelos.Producto;
import org.erp111.repositorios.VentaRepositorio;

/**
 *
 * @author Linkero
 */
public class VentaServicio {
    
    private VentaRepositorio ventaRepositorio;
    
    public VentaServicio(){
        this.ventaRepositorio = new VentaRepositorio();
    }
    
    public ArrayList<Producto> getListaProductos(){
        return this.ventaRepositorio.getListaProductos();
    }
    
}
