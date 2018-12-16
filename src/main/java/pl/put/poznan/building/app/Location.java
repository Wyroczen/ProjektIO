/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.app;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <h1>Klasa Lokacja</h1>
 *
 * @author Amarantowy
 * @version 1.0
 */
public class Location {

    static final AtomicInteger counter = new AtomicInteger();
    private int id;
    private String name;

    //konstruktory
    /**
     * Konstruktor
     *
     * @param nazwa Pierwszy parametr konstruktora - nazwa danej lokacji
     */
    public Location(String nazwa) {
        this.id = counter.getAndIncrement();
        this.name = nazwa;
    }

    /**
     * Konstruktor bezparametrowy
     *
     */
    public Location() {
    }

    //gettery
    /**
     * Getter Id
     *
     * @return zwraca id lokacji
     */
    public int getId() {
        return id;
    }

    /**
     * Getter Name
     *
     * @return zwraca nazwę danej lokacji
     */
    public String getName() {
        return name;
    }

}
