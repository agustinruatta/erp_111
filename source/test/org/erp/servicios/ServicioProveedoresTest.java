/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp.servicios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.erp111.modelos.Proveedores;
import org.erp111.servicios.ServicioProveedores;

/**
 *
 * @author brzig
 */
public class ServicioProveedoresTest {

    private ServicioProveedores servicioProveedores;

    @Before
    public void setUp() {
        this.servicioProveedores = new ServicioProveedores();
    }

    /**
     * ********** TEST NOMBRE ***************
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNombreVacio() {
        this.servicioProveedores.guardarProveedor("", "asd", "125", "125", "asdsad", "asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNombreNumeros() {
        this.servicioProveedores.guardarProveedor("123", "asd", "125", "125", "asdsad", "asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNombreSimbolos() {
        this.servicioProveedores.guardarProveedor("asd$", "asd", "125", "125", "asdsad", "asdsa");
    }

    /**
     * ********** TEST APELLIDO ***************
     */
    @Test(expected = IllegalArgumentException.class)
    public void testApellidoVacio() {
        this.servicioProveedores.guardarProveedor("aasd", "", "125", "125", "asdsad", "asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApellidoNumeros() {
        this.servicioProveedores.guardarProveedor("asds", "1231", "125", "125", "asdsad", "asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApellidoSimbolos() {
        this.servicioProveedores.guardarProveedor("asd", "asd%", "125", "125", "asdsad", "asdsa");
    }

    /**
     * *********** TEST CUIT **************
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCuitVacio() {
        this.servicioProveedores.guardarProveedor("aasd", "", "125", "125", "asdsad", "asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCuitLetras() {
        this.servicioProveedores.guardarProveedor("asds", "1231", "asdas", "125", "asdsad", "asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCuitSimbolos() {
        this.servicioProveedores.guardarProveedor("asd", "asd", "125%", "125", "asdsad", "asdsa");
    }

    /**
     * *********** TEST TELEFONO **************
     */
    @Test(expected = IllegalArgumentException.class)
    public void testTelefonoVacio() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTelefonoLetras() {
        this.servicioProveedores.guardarProveedor("asds", "1231", "asdas", "asdasd", "asdsad", "asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTelefonoSimbolos() {
        this.servicioProveedores.guardarProveedor("asd", "asd", "125", "$", "asdsad", "asdsa");
    }

    /**
     * *********** TEST TELEFONO **************
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDireccionVacio() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "12321", "", "asdsa");
    }

    /**
     * *********** TEST TELEFONO **************
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCiudadVacio() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCiudadNumeros() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "12312");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCiudadSimbolos() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "@");
    }
}
