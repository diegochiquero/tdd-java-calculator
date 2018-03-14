/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd_java_calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class Tdd_java_calculatorTest {
    
    public Tdd_java_calculatorTest() {
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
     * Test of main method, of class Tdd_java_calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Tdd_java_calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Tdd_java_calculator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 12;
        int b = 4;
        int expResult = 16;
        int result = Tdd_java_calculator.sum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class Tdd_java_calculator.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 12;
        int b = 4;
        int expResult = 8;
        int result = Tdd_java_calculator.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of product method, of class Tdd_java_calculator.
     */
    @Test
    public void testProduct() {
        System.out.println("product");
        int a = 12;
        int b = 4;
        int expResult = 48;
        int result = Tdd_java_calculator.product(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of divide method, of class Tdd_java_calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Tdd_java_calculator.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
}