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
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author brzig
 */
public class ProveedorRepositorio extends RepositorioBase<Proveedor>{

    public ArrayList<Proveedor> obtenerProveedores(String filtro, String consulta) {
        String filtroCorrecto = new String("");
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<Proveedor> proveedor = null;
        try {
            tx = session.beginTransaction();
            if(consulta.equals("Escriba el proveedor que desea buscar")){
                Query consultaHQL;
                if(filtro.equals("inactivos")){
                    consultaHQL = session.createQuery("FROM Proveedor p WHERE p.estado = \"baja\"");
                }
                else{
                    consultaHQL = session.createQuery("FROM Proveedor p ");
                }
                proveedor = (ArrayList<Proveedor>) consultaHQL.list();
            }
            else{
                filtroCorrecto = filtroSeleccionado(filtro);
                Query consultaHQL = session.createQuery(filtroCorrecto);
                consultaHQL.setParameter("consulta", "%" + consulta + "%");
                proveedor = (ArrayList<Proveedor>) consultaHQL.list();
            }            
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

    private String filtroSeleccionado(String filtro){
        String filtroCorrecto = new String("");
        if (filtro.equals("nombre")) {
                filtroCorrecto = new String("FROM Proveedor p WHERE p.nombre LIKE :consulta");                
            }
            else if (filtro.equals("apellido")) {
                filtroCorrecto = new String("FROM Proveedor p WHERE p.apellido LIKE :consulta");                
            }
            else if (filtro.equals("cuit")) {
                filtroCorrecto = new String("FROM Proveedor p WHERE p.cuit LIKE :consulta");                
            }
            else if (filtro.equals("telefono")) {
                filtroCorrecto = new String("FROM Proveedor p WHERE p.telefono LIKE :consulta");                
            }
            else if (filtro.equals("email")) {
                filtroCorrecto = new String("FROM Proveedor p WHERE p.email LIKE :consulta");                
            }
            else if (filtro.equals("direccion")) {
                filtroCorrecto = new String("FROM Proveedor p WHERE p.direccion LIKE :consulta");                
            }
            else if (filtro.equals("localidad")) {
                filtroCorrecto = new String("FROM Proveedor p WHERE p.localidad LIKE :consulta");                
            }
            else if (filtro.equals("provincia")) {
                filtroCorrecto = new String("FROM Proveedor p WHERE p.provincia LIKE :consulta");               
            }
            else {
                throw new IllegalArgumentException("Filtro inválido: " + filtro);
            }
        return filtroCorrecto;
    }
    
    public Proveedor obtenerProveedor(String id) {
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = null;
        Proveedor proveedor = null;

        try {
            tx = session.beginTransaction();
            Query consultaHQL = session.createQuery("FROM Proveedor p WHERE p.codigoProveedor = :id");
            consultaHQL.setParameter("id", id);
            proveedor = (Proveedor) consultaHQL.uniqueResult();
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
