/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.presentadores;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.erp111.modelos.Producto;
import org.erp111.servicios.VentaServicio;
import org.erp111.vistas.VistaVenta;

/**
 *
 * @author Linkero
 */
public class VentaPresentador {
    private VistaVenta vistaVenta;
    private VentaServicio ventaServicio;
    
    public VentaPresentador(VistaVenta vistaVenta){
        this.vistaVenta = vistaVenta;
        this.ventaServicio = new VentaServicio();
        
    }
    
    //Llena la lista de productos en la vista de ventas
    public void llenarListaProductos(){
        DefaultListModel modeloLista = new DefaultListModel();
        
        try{
          ArrayList<Producto> productos = this.ventaServicio.getListaProductos();
        
            //TO DO: ACA PODRIA ORDENARLO POR NOMBRE AL ARRAY
        
            for(Producto producto: productos){
                modeloLista.addElement(producto);
            }
            
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            modeloLista.clear();
            
        }finally{
            this.vistaVenta.setModeloListaProductos(modeloLista);
        }
    }
    
    public void mostrarInformacionProducto(){
        Producto producto = (Producto)this.vistaVenta.getProductosList().getSelectedValue();
        this.vistaVenta.getNombreProductoLabel().setText(producto.getNombre());
        this.vistaVenta.getCodigoProductoLabel().setText(producto.getCodigoProducto().toString());
        this.vistaVenta.getCostoUnitarioProductoLabel().setText(String.valueOf(producto.getCosto()));
        this.vistaVenta.getUnidadProductoLabel().setText(producto.getUnidad());
        
        this.vistaVenta.getMontoProductoLabel().setText("0");
    }
     
}
