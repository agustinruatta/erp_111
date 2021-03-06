package org.erp111.modelos;
// Generated 24/10/2018 16:01:50 by Hibernate Tools 4.3.1



/**
 * DetalleCompra generated by hbm2java
 */
public class DetalleCompra  implements java.io.Serializable {


     private Integer codigoDetalleCompra;
     private Compra compra;
     private Producto producto;
     private double cantidad;
     private double precioUnitario;

    public DetalleCompra() {
    }

    public DetalleCompra(Compra compra, Producto producto, double cantidad, double precioUnitario) {
       this.compra = compra;
       this.producto = producto;
       this.cantidad = cantidad;
       this.precioUnitario = precioUnitario;
    }
   
    public Integer getCodigoDetalleCompra() {
        return this.codigoDetalleCompra;
    }
    
    public void setCodigoDetalleCompra(Integer codigoDetalleCompra) {
        this.codigoDetalleCompra = codigoDetalleCompra;
    }
    public Compra getCompra() {
        return this.compra;
    }
    
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public double getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }




}


