/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.erp111.modelos.Cliente;
import org.erp111.modelos.Proveedor;
import org.erp111.modelos.Venta;
import org.erp111.servicios.ServicioHibernate;
import org.erp111.vistas.VistaVenta;
import org.erp111.vistas.proveedores.VistaProveedor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author agu
 */
public class Erp111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProveedor().setVisible(true);
            }
        });
    }
    

}
