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
public class AreaCalculatorTest {
    
    public AreaCalculatorTest() {
    }

    public AreaCalculator ac;
    
    @Before
    public void setUp()
    {
        ac = new AreaCalculator();
    }
    /**
     * Test of calculateArea method, of class AreaCalculator.
     */
    @Test
    public void testCalculateArea() {
        String str = "1";
        Double expResult = 0.0;
        Double result = ac.calculateArea(str);
        assertEquals(expResult,result);
    }
    
}
