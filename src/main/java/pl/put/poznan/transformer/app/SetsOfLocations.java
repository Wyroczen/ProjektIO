/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.transformer.app;

import java.util.HashSet;

/**
 *
 * @author corpt
 */
public final class SetsOfLocations {
    static HashSet<Location> hashSetLocations = new HashSet();
    static HashSet<Building> hashSetBuildings = new HashSet();
    static HashSet<Level> hashSetLevels = new HashSet();
    static HashSet<Room> hashSetRooms = new HashSet();
    
    //gettery
    public static HashSet<Location> getHashSetLocations() {
        return hashSetLocations;
    }
    public static HashSet<Building> getHashSetBuildings() {
        return hashSetBuildings;
    }
    public static HashSet<Level> getHashSetLevels() {
        return hashSetLevels;
    }
    public static HashSet<Room> getHashSetRooms() {
        return hashSetRooms;
    }
    
    //addery
    public static void addListaLokacji(Location lokacja){
        hashSetLocations.add(lokacja);
    }
    public static void addListaBudynkow(Building budynek){
        hashSetBuildings.add(budynek);
    }
    public static void addListaPoziomow(Level poziom){
        hashSetLevels.add(poziom);
    }
    public static void addListaPomieszczen(Room pomieszczenie){
        hashSetRooms.add(pomieszczenie);
    }
    
}
