package org.erp111.modelos;
<<<<<<< HEAD
// Generated 25/09/2018 20:53:19 by Hibernate Tools 4.3.1
=======
// Generated 25/09/2018 14:25:04 by Hibernate Tools 4.3.1
>>>>>>> ea83eba1c5075aaf20137d56d6815ba56d7b0f1d


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Compra generated by hbm2java
 */
public class Compra  implements java.io.Serializable {


     private Integer codigoCompra;
     private Producto producto;
     private Proveedor proveedor;
     private double montoTotal;
     private Date fecha;
     private Set detalleCompras = new HashSet(0);

    public Compra() {
    }

	
    public Compra(Producto producto, Proveedor proveedor, double montoTotal, Date fecha) {
        this.producto = producto;
        this.proveedor = proveedor;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
    }
    public Compra(Producto producto, Proveedor proveedor, double montoTotal, Date fecha, Set detalleCompras) {
       this.producto = producto;
       this.proveedor = proveedor;
       this.montoTotal = montoTotal;
       this.fecha = fecha;
       this.detalleCompras = detalleCompras;
    }
   
    public Integer getCodigoCompra() {
        return this.codigoCompra;
    }
    
    public void setCodigoCompra(Integer codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public double getMontoTotal() {
        return this.montoTotal;
    }
    
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Set getDetalleCompras() {
        return this.detalleCompras;
    }
    
    public void setDetalleCompras(Set detalleCompras) {
        this.detalleCompras = detalleCompras;
    }




}


