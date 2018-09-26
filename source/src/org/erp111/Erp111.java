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
                new VistaVenta().setVisible(true);
            }
        });
    }
    
     /*Cliente cliente = new Cliente("anda la bd", "bailone", "31321", "asdas 123", "adsasdas", "32132153");
        //Date date = new Date();
        //cliente.setCodigoCliente(7);
        //Venta venta = new Venta(cliente, 333.22,date , 333.33);
        //HashSet ventas = new HashSet();
        //ventas.add(venta);
        //cliente.setVentas(ventas);
        
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        try{
            session.persist(cliente);
            tx.commit();
            
            
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        
    }*/
}
