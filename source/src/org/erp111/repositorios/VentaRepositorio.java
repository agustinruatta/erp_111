/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.repositorios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.erp111.modelos.Cliente;
import org.erp111.modelos.Producto;
import org.erp111.modelos.Venta;
import org.erp111.servicios.ServicioHibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Linkero
 */
public class VentaRepositorio {
    private static final String QUERY_TODOS_LOS_PRODUCTOS = "from Producto";
    private static final String QUERY_BUSCAR_CLIENTES_POR_NOMBRE = "from Cliente C where C.nombre = :nombre_cliente%";
    private static final String QUERY_BUSCAR_CLIENTES_POR_APELLIDO = "from Cliente C where C.apellido = :apellido_cliente%";
    private static final String QUERY_BUSCAR_CLIENTES_POR_CUIL = "from Cliente C where C.cuil = :apellido_cuil%";
    
    public List getListaProductos(){
        List listaResultado = null;
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        try{
            Query query = session.createQuery(QUERY_TODOS_LOS_PRODUCTOS);
            listaResultado = query.list();
            tx.commit();
            
            
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return listaResultado;
    }
    
    
    public List buscarClientePorNombre(String nombreClienteBusqueda){
        List listaResultado = null;
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        try{
            Query query = session.createQuery(QUERY_BUSCAR_CLIENTES_POR_NOMBRE);
            query.setParameter(":nombre_cliente", nombreClienteBusqueda);
            listaResultado = query.list();
            tx.commit();
            
            
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return listaResultado;
    }
    
    public List buscarClientePorApellido(String apellidoClienteBusqueda){
        List listaResultado = null;
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        try{
            Query query = session.createQuery(QUERY_BUSCAR_CLIENTES_POR_APELLIDO);
            query.setParameter(":apellido_cliente", apellidoClienteBusqueda);
            listaResultado = query.list();
            tx.commit();
            
            
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return listaResultado;
    }
    
    public List buscarClientePorCUIL(String cuilClienteBusqueda){
        List listaResultado = null;
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        try{
            Query query = session.createQuery(QUERY_BUSCAR_CLIENTES_POR_CUIL);
            query.setParameter(":cuil_cliente", cuilClienteBusqueda);
            listaResultado = query.list();
            tx.commit();
            
            
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return listaResultado;
    }
}
