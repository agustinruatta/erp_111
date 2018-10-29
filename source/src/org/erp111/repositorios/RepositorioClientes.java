/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.repositorios;

import java.util.ArrayList;
import org.erp111.modelos.Cliente;
import org.erp111.servicios.ServicioHibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Laboratorio
 */
public class RepositorioClientes {

    private ArrayList<Cliente> listaClientes;

    public void guardar(Cliente cliente) {
        Session session = ServicioHibernate.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            session.save(cliente);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        this.listaClientes.add(cliente);
    }

    public RepositorioClientes() {
        this.listaClientes = new ArrayList<>();
    }
}
