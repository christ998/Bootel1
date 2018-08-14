
package bootel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class ValidadorTest {
    
    public ValidadorTest() {
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
     * Test of validarRut method, of class Validador.
     */
    @Ignore
    public void testValidarRut() {
        
    }

    /**
     * Test of validarNombre method, of class Validador.
     */
    @Test
    public void testValidarNombre() {
       String nombre = "Christian";
       Validador test = new Validador();
       assertEquals(test.validarNombre(nombre), true);
       
    }

    /**
     * Test of validarTexto method, of class Validador.
     */
    @Ignore
    public void testValidarTexto() {
       
    }

    /**
     * Test of validarPass method, of class Validador.
     */
    @Ignore
    public void testValidarPass() {
        String pass ="passejemplo12";
        Validador test = new Validador();
        assertEquals(test.validarPass(pass), true);
        
    }
    
}
