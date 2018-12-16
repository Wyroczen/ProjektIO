/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.app;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wisni
 */
public class LevelTest {
    
    public LevelTest() {
    }

    /**
     * Test of getRooms method, of class Level.
     */
    @Test
    public void testGetRooms() {
        System.out.println("getRooms");
        Level instance = new Level();
        ArrayList<Room> expResult = null;
        ArrayList<Room> result = instance.getRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
