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
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author brzig
 */
public class ServicioProveedoresTest {

    private ServicioProveedores servicioProveedores;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        this.servicioProveedores = new ServicioProveedores();
    }

    /**
     * ********** TEST NOMBRE ***************
     */
    @Test
    public void testNombreVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Nombre vacio");
        
        this.servicioProveedores.guardarProveedor("", "asd", "125", "125", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testNombreNumeros() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos");
        
        this.servicioProveedores.guardarProveedor("123", "asd", "125", "125", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testNombreSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos");
        
        this.servicioProveedores.guardarProveedor("asd$", "asd", "125", "125", "asdsad", "asdsa","asdsa");
    }

    /**
     * ********** TEST APELLIDO ***************
     */
    @Test
    public void testApellidoVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Apellido vacio");
        
        this.servicioProveedores.guardarProveedor("aasd", "", "125", "125", "asdsad", "asdsa","asdsa");
        
    }

    @Test
    public void testApellidoNumeros() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos");
        
        this.servicioProveedores.guardarProveedor("asds", "1231", "125", "125", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testApellidoSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos");
        
        this.servicioProveedores.guardarProveedor("asd", "asd%", "125", "125", "asdsad", "asdsa","asdsa");
    }

    /**
     * *********** TEST CUIT **************
     */
    @Test
    public void testCuitVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Cuit vacio");
        
        this.servicioProveedores.guardarProveedor("aasd", "asds", "", "125", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testCuitLetras() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos");
        
        this.servicioProveedores.guardarProveedor("asds", "1231", "asdas", "125", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testCuitSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos");
        
        this.servicioProveedores.guardarProveedor("asd", "asd", "125%", "125", "asdsad", "asdsa","asdsa");
    }

    /**
     * *********** TEST TELEFONO **************
     */
    @Test
    public void testTelefonoVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Telefono vacio");
        
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testTelefonoLetras() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos");
        this.servicioProveedores.guardarProveedor("asds", "1231", "asdas", "asdasd", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testTelefonoSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos");
        this.servicioProveedores.guardarProveedor("asd", "asd", "125", "$", "asdsad", "asdsa","asdsa");
    }

    /**
     * *********** TEST DIRECCION **************
     */
    @Test
    public void testDireccionVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Direccion vacio");
        
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "12321", "", "asdsa","asdsa");
    }

    /**
     * *********** TEST CIUDAD **************
     */
    @Test
    public void testCiudadVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Ciudad vacio");
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "123456", "asdsad", "","asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCiudadNumeros() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "12312","asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCiudadSimbolos() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "@","asdsa");
    }
    
        /**
     * *********** TEST CIUDAD **************
     */
    @Test
    public void testProvinciaVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Ciudad vacio");
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "123456", "asdsad", "","asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProvinciaNumeros() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "12312","asdsa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProvinciaSimbolos() {
        this.servicioProveedores.guardarProveedor("aasd", "asdas", "125", "", "asdsad", "@","asdsa");
    }
}
