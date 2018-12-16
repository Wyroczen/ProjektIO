/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.app;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wisni
 */
public class SetsOfLocationsTest {
    
    public SetsOfLocationsTest() {
    }

    /**
     * Test of getHashSetLocations method, of class SetsOfLocations.
     */
    @Test
    public void testGetHashSetLocations() {
        System.out.println("getHashSetLocations");
        HashSet<Location> expResult = null;
        HashSet<Location> result = SetsOfLocations.getHashSetLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHashSetBuildings method, of class SetsOfLocations.
     */
    @Test
    public void testGetHashSetBuildings() {
        System.out.println("getHashSetBuildings");
        HashSet<Building> expResult = null;
        HashSet<Building> result = SetsOfLocations.getHashSetBuildings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHashSetLevels method, of class SetsOfLocations.
     */
    @Test
    public void testGetHashSetLevels() {
        System.out.println("getHashSetLevels");
        HashSet<Level> expResult = null;
        HashSet<Level> result = SetsOfLocations.getHashSetLevels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHashSetRooms method, of class SetsOfLocations.
     */
    @Test
    public void testGetHashSetRooms() {
        System.out.println("getHashSetRooms");
        HashSet<Room> expResult = null;
        HashSet<Room> result = SetsOfLocations.getHashSetRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListaLokacji method, of class SetsOfLocations.
     */
    @Test
    public void testAddListaLokacji() {
        System.out.println("addListaLokacji");
        Location lokacja = null;
        SetsOfLocations.addListaLokacji(lokacja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListaBudynkow method, of class SetsOfLocations.
     */
    @Test
    public void testAddListaBudynkow() {
        System.out.println("addListaBudynkow");
        Building budynek = null;
        SetsOfLocations.addListaBudynkow(budynek);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListaPoziomow method, of class SetsOfLocations.
     */
    @Test
    public void testAddListaPoziomow() {
        System.out.println("addListaPoziomow");
        Level poziom = null;
        SetsOfLocations.addListaPoziomow(poziom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListaPomieszczen method, of class SetsOfLocations.
     */
    @Test
    public void testAddListaPomieszczen() {
        System.out.println("addListaPomieszczen");
        Room pomieszczenie = null;
        SetsOfLocations.addListaPomieszczen(pomieszczenie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
