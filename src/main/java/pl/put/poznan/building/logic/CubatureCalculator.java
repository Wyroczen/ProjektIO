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
 *
 * @author corpt
 */
public class CubatureCalculator {
    
        public static Double calculateCubature(String str){
        
        Location loc = Helper.getObjectById(SetsOfLocations.getHashSetLocations(), Integer.parseInt(str));
        
        Double cubature = 0.d;
        if(loc instanceof Building){
            Building b = (Building)loc;
            for(Level f : b.getPoziomy()){
                for(Room r : f.getRooms()){
                    cubature+=r.getCube();
                }
            }
        }
        else if(loc instanceof Level){
            Level l = (Level)loc;
            for(Room r : l.getRooms()){
                    cubature+=r.getCube();
                }
        }
        else if(loc instanceof  Room){
            Room r = (Room)loc;
            cubature = r.getCube();
        }
        return cubature;
    }

    
}
