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
public class LightingCalculatorTest {
    
    public LightingCalculatorTest() {
    }

    public LightingCalculator lc;
    
    @Before
    public void setUp()
    {lc = new LightingCalculator();}
    
    /**
     * Test of calculateExposition method, of class LightingCalculator.
     */
    @Test
    public void testCalculateExposition() {
        System.out.println("calculateExposition");
        String str = "1";
        Double expResult = 0.0;
        Double expResult2 = null;
        
        //Double result = lc.calculateExposition(str);
        //assertEquals(expResult, result);
        boolean isNan = Double.isNaN(lc.calculateExposition(str));
        Double result = lc.calculateExposition(str);
        assertTrue(isNan || result == expResult2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
