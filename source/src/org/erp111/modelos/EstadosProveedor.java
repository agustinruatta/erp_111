/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.modelos;

/**
 *
 * @author agu
 */
public enum EstadosProveedor {
    ACTIVO("activo"), 
    BAJA("baja");
    
    private String estado;

    private EstadosProveedor(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.estado;
    }
}
