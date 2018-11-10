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
public class Building extends Location{
    ArrayList<Level> poziomy = new ArrayList();
    
    //konstruktory
    public Building(String nazwa) {
        super(nazwa);
    }
 
    public Building(){
    }

    public ArrayList<Level> getPoziomy() {
        return poziomy;
    }
}
