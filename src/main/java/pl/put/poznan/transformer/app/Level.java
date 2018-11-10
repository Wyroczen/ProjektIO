/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.transformer.app;

import java.util.ArrayList;

/**
 *
 * @author wisni
 */
public class Level extends Location{
    ArrayList<Room> rooms = new ArrayList();
    
    //konstruktory
    public Level(String nazwa) {
        super(nazwa);
    }
    public Level() {}

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
