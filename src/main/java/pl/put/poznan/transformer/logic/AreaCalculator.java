/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.app.Building;
import pl.put.poznan.transformer.app.Level;
import pl.put.poznan.transformer.app.Location;
import pl.put.poznan.transformer.app.Room;

/**
 *
 * @author corpt
 */
public final class AreaCalculator {
    Double calculateArea(Location loc){
        Double area = 0.d;
        if(loc instanceof Building){
            Building b = (Building)loc;
            for(Level f : b.getPoziomy()){
                for(Room r : f.getRooms()){
                    area+=r.getArea();
                }
            }
        }
        return area;
    }
}
