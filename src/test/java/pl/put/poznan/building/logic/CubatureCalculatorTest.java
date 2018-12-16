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
public class CubatureCalculatorTest {
    
    public CubatureCalculatorTest() {
    }

    public CubatureCalculator cc;
    
    @Before
    public void setUp()
    {cc = new CubatureCalculator();}
    
    /**
     * Test of calculateCubature method, of class CubatureCalculator.
     */
    @Test
    public void testCalculateCubature() {
        System.out.println("calculateCubature");
        String str = "1";
        Double expResult = 0.0;
        Double result = cc.calculateCubature(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
