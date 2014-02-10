/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import sample.Utils;

/**
 *
 * @author nabazan
 */
public class UtilsJUnit4Test {
    
    public UtilsJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception{
        System.out.println("* UtilsJUnit4Test: @BeforeClass method");    
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception{
        System.out.println("*UtilsJUnit4Test: @AfterClass method");
    }
    
    public void setUp() {
        System.out.println("*UtilsJUnit4Test: @Before method");
    }
    

    public void tearDown(){
        System.out.println("*UtilsJUnit4Test: @After method");
    }
    
    @Test
    public void helloWorldCheck(){
        System.out.println("*UtilsJUnit4Test: test method 1 - helloWorldCheck()");
        assertEquals("Hello, world!",Utils.concatWords("Hello", ", ", "world", "!"));      
    }   

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test(timeout=1000)
    public void testWithTimeout() {
        System.out.println("* UtilsJUnit4Test: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    /**
     * Test of normalizeWord method, of class Utils.
     */
    
    @Ignore
    @Test
    public void temporarilyDisabledTest() throws Exception {
        System.out.println("* UtilsJUnit4Test: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }
    
    
    @Test(expected=IllegalArgumentException.class)
    public void checkExpectedException() {
         System.out.println("* UtilsJUnit4Test: test method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
}