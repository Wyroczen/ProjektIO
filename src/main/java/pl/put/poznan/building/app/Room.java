/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.app;

/**
 *
 * @author wisni
 */
public class Room extends Location {

    Double area;
    Double cube;
    Double heating;
    Double light;

    //kosntruktory
    public Room(String nazwa) {
        super(nazwa);
    }

    public Room() {
    }

    public Double getArea() {
        return area;
    }

    public Double getCube() {
        return cube;
    }

    public Double getHeating() {
        return heating;
    }

    public Double getLight() {
        return light;
    }

}
