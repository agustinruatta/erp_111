/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.repositorios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.erp111.modelos.Proveedor;
import org.erp111.servicios.ServicioHibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author brzig
 */
public class ProveedorRepositorio {
    
public void guardarProveedor(Proveedor proveedor){
    //Guardar proveedor en la base de datos
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(proveedor);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        JOptionPane.showMessageDialog(null, "Guardado con exito!");
}    

public ArrayList<Proveedor> obtenerProveedor(){
    Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<Proveedor> proveedor = null;

        try {
            tx = session.beginTransaction();
            proveedor = (ArrayList<Proveedor>) session.createQuery("FROM Proveedor").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return proveedor;
}

    
}
