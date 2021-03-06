package org.erp111.modelos;
// Generated 24/10/2018 16:01:50 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer codigoProducto;
     private String nombre;
     private String tipo;
     private String unidad;
     private double costo;
     private double ganancia;
     private double stockActual;
     private double stockMinimo;
     private String detalle;
     private Set compras = new HashSet(0);
     private Set detalleVentas = new HashSet(0);
     private Set detalleCompras = new HashSet(0);

    public Producto() {
    }

	
    public Producto(String nombre, String tipo, String unidad, double costo, double ganancia, double stockActual, double stockMinimo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.unidad = unidad;
        this.costo = costo;
        this.ganancia = ganancia;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
    }
    public Producto(String nombre, String tipo, String unidad, double costo, double ganancia, double stockActual, double stockMinimo, String detalle, Set compras, Set detalleVentas, Set detalleCompras) {
       this.nombre = nombre;
       this.tipo = tipo;
       this.unidad = unidad;
       this.costo = costo;
       this.ganancia = ganancia;
       this.stockActual = stockActual;
       this.stockMinimo = stockMinimo;
       this.detalle = detalle;
       this.compras = compras;
       this.detalleVentas = detalleVentas;
       this.detalleCompras = detalleCompras;
    }
   
    public Integer getCodigoProducto() {
        return this.codigoProducto;
    }
    
    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public double getCosto() {
        return this.costo;
    }
    
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public double getGanancia() {
        return this.ganancia;
    }
    
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    public double getStockActual() {
        return this.stockActual;
    }
    
    public void setStockActual(double stockActual) {
        this.stockActual = stockActual;
    }
    public double getStockMinimo() {
        return this.stockMinimo;
    }
    
    public void setStockMinimo(double stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
    public String getDetalle() {
        return this.detalle;
    }
    
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public Set getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set compras) {
        this.compras = compras;
    }
    public Set getDetalleVentas() {
        return this.detalleVentas;
    }
    
    public void setDetalleVentas(Set detalleVentas) {
        this.detalleVentas = detalleVentas;
    }
    public Set getDetalleCompras() {
        return this.detalleCompras;
    }
    
    public void setDetalleCompras(Set detalleCompras) {
        this.detalleCompras = detalleCompras;
    }




}


