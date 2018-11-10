/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.app.Building;
import pl.put.poznan.transformer.app.Helper;
import pl.put.poznan.transformer.app.Level;
import pl.put.poznan.transformer.app.Location;
import pl.put.poznan.transformer.app.Room;
import pl.put.poznan.transformer.app.SetsOfLocations;
import static pl.put.poznan.transformer.logic.AreaCalculator.calculateArea;

/**
 *
 * @author wisni
 */
public final class LightingCalculator {

    public static Double calculateExposition(String str) {
        //Double calculateLighting(Location loc) {

        Location loc = Helper.getObjectById(SetsOfLocations.getHashSetLocations(), Integer.parseInt(str));

        Double exposition = 0.d;
        if (loc instanceof Building) {
            Building b = (Building) loc;
            for (Level l : b.getPoziomy()) {
                for (Room r : l.getRooms()) {
                    exposition += r.getLight();
                }
            }
        } else if (loc instanceof Level) {
            Level l = (Level) loc;
            for (Room r : l.getRooms()) {
                exposition = r.getLight();
            }
        } else if (loc instanceof Room) {
            Room r = (Room) loc;
            exposition = r.getLight();
        }
        return exposition/calculateArea(str);
    }
}
