/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brandonmichaelwebb
 */
public class httpurlconnectionTest {
    
    public httpurlconnectionTest() {
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
     * Test of main method, of class httpurlconnection.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = { "Bald Eagle Jan 21,2016" };
        httpurlconnection.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connection method, of class httpurlconnection.
     */
    @Test
    public void testConnection() throws Exception {
        System.out.println("connection");
        String theURL = "www.google.com";
        httpurlconnection.connection(theURL);
        httpurlconnection instance = new httpurlconnection();
        int expResult = 200;
        int result = 200;
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
