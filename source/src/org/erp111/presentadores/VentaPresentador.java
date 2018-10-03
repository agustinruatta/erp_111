/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.presentadores;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
    private final int COLUMNA_CODIGO = 0;
    private final int COLUMNA_NOMBRE = 1;
    private final int COLUMNA_PRECIO_UNITARIO = 2;
    private final int COLUMNA_CANTIDAD = 3;
    private final int COLUMNA_MONTO = 4;
    
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
    
    public void calcularMonto(){
        DecimalFormat df = new DecimalFormat("#.00");
        
        if(this.ventaServicio.esNumero(this.vistaVenta.getCantidadTextField().getText())){
            double costoUnitario = Double.valueOf(this.vistaVenta.getCostoUnitarioProductoLabel().getText());
            double cantidad = Double.valueOf(this.vistaVenta.getCantidadTextField().getText());
            
            String montoString = String.valueOf(df.format(costoUnitario*cantidad));
            this.vistaVenta.getMontoProductoLabel().setText(montoString);
            
        }else{
            this.vistaVenta.getMontoProductoLabel().setText("0");
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
    
    public void agregarProductoATabla(){
        TableModel modeloTabla = this.vistaVenta.getTableModel();
        Producto producto = (Producto)this.vistaVenta.getProductosList().getSelectedValue();
        //ver si no hay producto seleccionado
        
        modeloTabla.setValueAt(producto., COLUMNA_CODIGO, COLUMNA_CODIGO);
        
        
        
    }
    
}
