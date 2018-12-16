/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author wisni
 */
public class HeatingCalculatorTest {
    
    public HeatingCalculatorTest() {
    }

    
    public HeatingCalculator hc;
    
    @Before
    public void setUp()
    {hc = new HeatingCalculator();}
    /**
     * Test of calculateHeating method, of class HeatingCalculator.
     */
    @org.junit.Test
    public void testCalculateHeating() {
        System.out.println("calculateHeating");
        String str = "1";
        Double expResult = null;
        //Double result = hc.calculateHeating(str);
        //assertEquals(expResult, result);
        boolean isNan = Double.isNaN(hc.calculateHeating(str));
        assertTrue(isNan);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
