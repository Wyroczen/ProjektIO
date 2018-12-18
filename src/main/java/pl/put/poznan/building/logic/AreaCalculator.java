/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.logic;

import pl.put.poznan.building.app.Building;
import pl.put.poznan.building.app.Helper;
import pl.put.poznan.building.app.Level;
import pl.put.poznan.building.app.Location;
import pl.put.poznan.building.app.Room;
import pl.put.poznan.building.app.SetsOfLocations;

/**
 * <h1>Klasa AreaCalculator</h1>
 *
 * @author Amarantowy
 * @version 1.0
 */
public final class AreaCalculator {
    
    /**
     * Caclulate area
     * @param str id obiektu
     * @return powierzchnia 
     */
    public static Double calculateArea(String str){
        
        Location loc = Helper.getObjectById(SetsOfLocations.getHashSetLocations(), Integer.parseInt(str));
        
        Double area = 0.d;
        if(loc instanceof Building){
            Building b = (Building)loc;
            for(Level f : b.getPoziomy()){
                for(Room r : f.getRooms()){
                    area+=r.getArea();
                }
            }
        }
        else if(loc instanceof Level){
            Level l = (Level)loc;
            for(Room r : l.getRooms()){
                    area+=r.getArea();
                }
        }
        else if(loc instanceof  Room){
            Room r = (Room)loc;
            area = r.getArea();
        }
        return area;
    }
    
}
