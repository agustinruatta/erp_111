/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111.servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.erp111.modelos.EstadosProveedor;
import org.erp111.modelos.Proveedor;
import org.erp111.repositorios.ProveedorRepositorio;

/**
 *
 * @author brzig
 */
public class ServicioProveedor {

    ProveedorRepositorio proveedorRepositorio;

    public ServicioProveedor() {
        this.proveedorRepositorio = new ProveedorRepositorio();
    }

    /**
     * **********************************************************************
     */
    /**
     * ************* VALIDACION DE CAMPOS *********************
     */
    /**
     * **********************************************************************
     */
    private void validarNombre(String nombre) {
        if (nombre.isEmpty() || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre vacio");
        }
        if (!nombre.matches("([a-z]|[A-Z]|\\s)+")) {
            throw new IllegalArgumentException("Caracteres invalidos Nombre");
        }
    }

    private void validarApellido(String apellido) {
        if (apellido.isEmpty() || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("Apellido vacio");
        }
        if (!apellido.matches("([a-z]|[A-Z]|\\s)+")) {
            throw new IllegalArgumentException("Caracteres invalidos Apellido");
        }
    }

    private void validarCuit(String cuit) {
        if (cuit.isEmpty() || cuit.trim().isEmpty()) {
            throw new IllegalArgumentException("Cuit vacio");
        }
        if (!cuit.matches("[0-9]+")) {
            throw new IllegalArgumentException("Caracteres invalidos Cuit");
        }
    }

    private void validarTelefono(String telefono) {
        if (telefono.isEmpty() || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefono vacio");
        }
        if (!telefono.matches("[0-9]+")) {
            throw new IllegalArgumentException("Caracteres invalidos Telefono");
        }
    }

    private void validarDireccion(String direccion) {
        if (direccion.isEmpty() || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("Direccion vacio");
        }
    }

    private void validarCiudad(String ciudad) {
        if (ciudad.isEmpty() || ciudad.trim().isEmpty()) {
            throw new IllegalArgumentException("Ciudad vacio");
        }
        if (!ciudad.matches("([a-z]|[A-Z]|\\s)+")) {
            throw new IllegalArgumentException("Caracteres invalidos Ciudad");
        }
    }

    private void validarProvincia(String provincia) {
        if (provincia.isEmpty() || provincia.trim().isEmpty()) {
            throw new IllegalArgumentException("Provincia vacio");
        }
        if (!provincia.matches("([a-z]|[A-Z]|\\s)+")) {
            throw new IllegalArgumentException("Caracteres invalidos Provincia");
        }
    }

    /**
     * **********************************************************************
     */
    /**
     * ************* METODOS *********************
     */
    /**
     * **********************************************************************
     */
    public void guardarProveedorRepositorio(String idString, String nombre, String apellido, String cuit, String telefono, String email, String direccion, String ciudad, String provincia) {
        Integer id = null;
        //Validacion de los datos
        validarNombre(nombre);
        validarApellido(apellido);
        validarCuit(cuit);
        validarTelefono(telefono);
        validarDireccion(direccion);
        validarCiudad(ciudad);
        validarProvincia(provincia);

        //El Email no se valida!!!
        try {
            id = Integer.parseInt(idString);
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            Proveedor proveedor = new Proveedor(nombre, apellido, cuit, telefono, email, direccion, ciudad, provincia);
            this.proveedorRepositorio.guardar(proveedor);
        } else {
            Proveedor proveedor = proveedorRepositorio.obtenerProveedor(idString);
            proveedor.setNombre(nombre);
            proveedor.setApellido(apellido);
            proveedor.setCuit(cuit);
            proveedor.setTelefono(telefono);
            proveedor.setEmail(email);
            proveedor.setDireccion(direccion);
            proveedor.setLocalidad(ciudad);
            proveedor.setProvincia(provincia);
            this.proveedorRepositorio.actualizar(proveedor);
        }

    }

    public ArrayList<Proveedor> getProveedores(String filtro, String consulta) {
        return this.proveedorRepositorio.obtenerProveedores(filtro, consulta);
    }

    public void darBaja(Proveedor proveedor) {
        proveedor.setEstado(EstadosProveedor.BAJA);
        
        this.proveedorRepositorio.darBaja(proveedor);
    }
}


