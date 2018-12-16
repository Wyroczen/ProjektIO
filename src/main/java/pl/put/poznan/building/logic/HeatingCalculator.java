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
import static pl.put.poznan.building.logic.CubatureCalculator.calculateCubature;

/**
 *
 * @author wisni
 */
public final class HeatingCalculator {

    /**
     *
     * @param str id obiektu
     * @return Zużycie energii w przeliczeniu na kubaturę Lokacji
     */
    public static Double calculateHeating(String str) {
        //Double calculateLighting(Location loc) {

        Location loc = Helper.getObjectById(SetsOfLocations.getHashSetLocations(), Integer.parseInt(str));

        Double exposition = 0.d;
        if (loc instanceof Building) {
            Building b = (Building) loc;
            for (Level l : b.getPoziomy()) {
                for (Room r : l.getRooms()) {
                    exposition += r.getHeating();
                }
            }
        } else if (loc instanceof Level) {
            Level l = (Level) loc;
            for (Room r : l.getRooms()) {
                exposition = r.getHeating();
            }
        } else if (loc instanceof Room) {
            Room r = (Room) loc;
            exposition = r.getHeating();
        }
        return exposition/calculateCubature(str);
    }
    
}
