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
    
    public List getListaProductos(){
        List listaResultado = null;
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        try{
            Query query = session.createQuery(QUERY_TODOS_LOS_PRODUCTOS);
            listaResultado = query.list();
            mostrarLista(listaResultado);
            tx.commit();
            
            
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return listaResultado;
    }
    
    
    public void mostrarLista(List lista){
        for(Object o : lista){
            Producto producto = (Producto) o;
            System.out.println(producto.getNombre());
        }
    }
}
