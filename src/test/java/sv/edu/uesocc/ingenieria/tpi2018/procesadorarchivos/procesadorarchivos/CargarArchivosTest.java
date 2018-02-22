/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.procesadorarchivos.procesadorarchivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fernando
 */
public class CargarArchivosTest {
    
    public CargarArchivosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validarPath method, of class CargarArchivos.
     */
    @Test
    public void testValidarPath() {
        System.out.println("validarPath");
        URL path = null;
        path = ClassLoader.getSystemResource("tpi2018.csv");
        System.out.println(""+path);
        CargarArchivos instance = new CargarArchivos();
        boolean expResult = true;
        boolean result = instance.validarPath(path.toString());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarArchivo method, of class CargarArchivos.
     */
    @Test
    public void testCargarArchivo() {
        System.out.println("cargarArchivo");
        String path = "/home/fernando/Documentos/tpi2018.csv";
        CargarArchivos instance = new CargarArchivos();
        instance.cargarArchivo(path);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    

   
    
}
