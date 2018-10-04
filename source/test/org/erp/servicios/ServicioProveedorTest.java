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
import org.erp111.modelos.Proveedor;
import org.erp111.servicios.ServicioProveedor;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author brzig
 */
public class ServicioProveedorTest {

    private ServicioProveedor servicioProveedores;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        this.servicioProveedores = new ServicioProveedor();
    }

    /**
     * ********** TEST NOMBRE ***************
     */
    @Test
    public void testNombreVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Nombre vacio");
        
        this.servicioProveedores.guardarProveedorRepositorio("", "asd", "125", "125","asdsad", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testNombreNumeros() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Nombre");
        
        this.servicioProveedores.guardarProveedorRepositorio("123", "asd", "125", "125","asdsad", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testNombreSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Nombre");
        
        this.servicioProveedores.guardarProveedorRepositorio("asd$", "asd", "125", "125","asdsad", "asdsad", "asdsa","asdsa");
    }

    /**
     * ********** TEST APELLIDO ***************
     */
    @Test
    public void testApellidoVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Apellido vacio");
        
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "", "125", "125","asdsad", "asdsad", "asdsa","asdsa");
        
    }

    @Test
    public void testApellidoNumeros() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Apellido");
        
        this.servicioProveedores.guardarProveedorRepositorio("asds", "1231", "125", "125","asdsad", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testApellidoSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Apellido");
        
        this.servicioProveedores.guardarProveedorRepositorio("asd", "asd%", "125", "125","asdsad", "asdsad", "asdsa","asdsa");
    }

    /**
     * *********** TEST CUIT **************
     */
    @Test
    public void testCuitVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Cuit vacio");
        
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asds", "", "125","asdsad", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testCuitLetras() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Cuit");       
        this.servicioProveedores.guardarProveedorRepositorio("asds", "asdasda", "asdas", "125","asdsad", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testCuitSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Cuit");
        
        this.servicioProveedores.guardarProveedorRepositorio("asd", "asd", "125%", "125","asdsad", "asdsad", "asdsa","asdsa");
    }

    /**
     * *********** TEST TELEFONO **************
     */
    @Test
    public void testTelefonoVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Telefono vacio");
        
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asdas", "125", "","asdsad", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testTelefonoLetras() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Telefono");
        this.servicioProveedores.guardarProveedorRepositorio("asds", "asdsad", "12314", "asdasd","asdsad", "asdsad", "asdsa","asdsa");
    }

    @Test
    public void testTelefonoSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Telefono");
        this.servicioProveedores.guardarProveedorRepositorio("asd", "asd", "125", "$","asdsad", "asdsad", "asdsa","asdsa");
    }

    /**
     * *********** TEST DIRECCION **************
     */
    @Test
    public void testDireccionVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Direccion vacio");
        
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asdas", "125", "12321","asdsad", "", "asdsa","asdsa");
    }

    /**
     * *********** TEST CIUDAD **************
     */
    @Test
    public void testCiudadVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Ciudad vacio");       
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asdas", "125", "123456","asdsad", "asdsad", "","asdsa");
    }

    @Test
    public void testCiudadNumeros() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Ciudad");
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asdas", "125", "12324","asdsad", "asdsad", "12312","asdsa");
    }

    @Test
    public void testCiudadSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Ciudad");
        
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asdas", "125", "12321","asdsad", "asdsad", "@","asdsa");
    }
    
        /**
     * *********** TEST PROVINCIA **************
     */
    @Test
    public void testProvinciaVacio() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Provincia vacio");
        
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asdas", "125", "123456","asdsad", "asdsad", "asdasd","");
    }

    @Test
    public void testProvinciaNumeros() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Provincia");
        
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asdas", "125", "1231","asdsad", "asdsad","asdsa", "12312");
    }

    @Test
    public void testProvinciaSimbolos() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Caracteres invalidos Provincia");
        
        this.servicioProveedores.guardarProveedorRepositorio("aasd", "asdas", "125", "123123","asdsad", "asdsad", "asd","@");
    }
}
