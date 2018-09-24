/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.modelos;

import java.util.Date;

/**
 *
 * @author Joa
 */
public class Compra{
    private int numero;
    private float monto_total;
    private Proveedor proveedor;
    private Date fecha;
    
    public Compra(int numero,float monto_total,Proveedor proveedor,Date fecha){
       this.numero=numero;
       this.monto_total=monto_total;
       this.proveedor=proveedor;
       this.fecha=fecha;
    }
    
    public int getNumero(){
        return numero;
    }
    public float getMontoTotal(){
        return monto_total;
    }
    public Proveedor getProveedor(){
        return proveedor;
    }
    public Date getFecha(){
        return fecha;
    }
}
