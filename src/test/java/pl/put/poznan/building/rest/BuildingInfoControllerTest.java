/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.rest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wisni
 */
public class BuildingInfoControllerTest {
    
    public BuildingInfoControllerTest() {
    }

    /**
     * Test of getLokacje method, of class BuildingInfoController.
     */
    @Test
    public void testGetLokacje() {
    }

    /**
     * Test of getBudynki method, of class BuildingInfoController.
     */
    @Test
    public void testGetBudynki() {
    }

    /**
     * Test of post method, of class BuildingInfoController.
     */
    @Test
    public void testPost() {
    }

    /**
     * Test of getPoziomy method, of class BuildingInfoController.
     */
    @Test
    public void testGetPoziomy() {
    }

    /**
     * Test of getPomieszczenia method, of class BuildingInfoController.
     */
    @Test
    public void testGetPomieszczenia() {
    }

    /**
     * Test of getArea method, of class BuildingInfoController.
     */
    @Test
    public void testGetArea() {
        BuildingInfoController bic = new BuildingInfoController();
        double expected = 0;
        double actual = bic.getArea("5");
        assertEquals(expected,actual,1e-15);
    }

    /**
     * Test of getCubature method, of class BuildingInfoController.
     */
    @Test
    public void testGetCubature() {
        BuildingInfoController bic = new BuildingInfoController();
        double expected = 0;
        double actual = bic.getCubature("5");
        assertEquals(expected,actual,1e-15);
    }

    /**
     * Test of getExposition method, of class BuildingInfoController.
     */
    @Test
    public void testGetExposition() {
        BuildingInfoController bic = new BuildingInfoController();
        String str = "5";
        double expected = 0;
        double actual = bic.getExposition(str);
        boolean isNan = Double.isNaN(bic.getExposition(str));
        assertTrue(isNan);
    }
    
}
