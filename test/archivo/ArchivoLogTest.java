
package archivo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class ArchivoLogTest {
    
    public ArchivoLogTest() {
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
     * Test of existeCliente method, of class ArchivoLog.
     */
    @Ignore
    public void testExisteCliente() {
        String nombre="Christian";
        String pass ="holahola123";
        ArchivoLog test = new ArchivoLog();
        boolean expected=test.existeCliente(nombre, pass);       
        assertEquals(expected, true);
    }

    /**
     * Test of existeAdmin method, of class ArchivoLog.
     */
    @Test
    public void testExisteAdmin() {
        String nombre="Admin";
        String pass ="4321";
        ArchivoLog test = new ArchivoLog();
        boolean expected=test.existeAdmin(nombre, pass,"010203");       
        assertEquals(expected, true); 
    }
    
}
