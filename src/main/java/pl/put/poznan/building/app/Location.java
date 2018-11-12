/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.app;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author wisni
 */
public class Location {
    static final AtomicInteger counter = new AtomicInteger();
    private int id;
    private String name;
    
    //konstruktory
    public Location(String nazwa)
    {
        this.id = counter.getAndIncrement();
        this.name = nazwa;
    }
    public Location() {
    }
    
    //gettery
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }    
    
}
