package org.erp111.modelos;
// Generated 25/09/2018 14:25:04 by Hibernate Tools 4.3.1



/**
 * DetalleVenta generated by hbm2java
 */
public class DetalleVenta  implements java.io.Serializable {


     private Integer codigoDetalleVenta;
     private Producto producto;
     private Venta venta;
     private double cantidad;
     private double precioUnitario;
     private double precio;
     private double importe;

    public DetalleVenta() {
    }

    public DetalleVenta(Producto producto, Venta venta, double cantidad, double precioUnitario, double precio, double importe) {
       this.producto = producto;
       this.venta = venta;
       this.cantidad = cantidad;
       this.precioUnitario = precioUnitario;
       this.precio = precio;
       this.importe = importe;
    }
   
    public Integer getCodigoDetalleVenta() {
        return this.codigoDetalleVenta;
    }
    
    public void setCodigoDetalleVenta(Integer codigoDetalleVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Venta getVenta() {
        return this.venta;
    }
    
    public void setVenta(Venta venta) {
        this.venta = venta;
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
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getImporte() {
        return this.importe;
    }
    
    public void setImporte(double importe) {
        this.importe = importe;
    }




}


