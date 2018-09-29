/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        List<Producto> listaResultado = this.ventaRepositorio.getListaProductos();
        ArrayList<Producto> productos = new ArrayList<>();
        for(Producto producto : listaResultado){
            System.out.println(producto.toString());
            productos.add(producto);
        }
        return productos;
    }
    
    public boolean esNumero(String cadena){
    Pattern patron = Pattern.compile("^[0-9]+(.[0-9]+)?$");
    Matcher comparador = patron.matcher(cadena);
    if(comparador.matches()){
        return true;
    }else{
        return false;

}
    }
    
}
