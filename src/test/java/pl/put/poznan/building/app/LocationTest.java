/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.app;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;


/**
 *
 * @author wisni
 */
public class LocationTest {
    
    public LocationTest() {
    }

    public Location loc;
    
    @Before
    public void setUp()
    {
        loc = new Location("TestowaLokacja");
    }
    
    /**
     * Test of getId method, of class Location.
     */
    @Test
    public void testGetId() {
        //Location mock = mock(Location.class); 
        System.out.println("getId");
        
        int expResult = 0;
        int result = loc.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Location.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        
        String expResult = "TestowaLokacja";
        String result = loc.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
