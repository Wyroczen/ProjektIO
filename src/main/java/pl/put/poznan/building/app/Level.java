/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.app;

import java.util.ArrayList;

/**
 * <h1>Klasa Poziom</h1>
 *
 * @author Amarantowy
 * @version 1.0
 */
public class Level extends Location{
    ArrayList<Room> rooms = new ArrayList();
    
    /**
     * Konstruktor
     *
     * @param nazwa Pierwszy parametr konstruktora
     */
    //konstruktory
    public Level(String nazwa) {
        super(nazwa);
    }
    public Level() {}

    /**
     * Getter Rooms
     *
     * @return zwraca ArrayList rooms - pokoje w danym budynku
     */
    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
