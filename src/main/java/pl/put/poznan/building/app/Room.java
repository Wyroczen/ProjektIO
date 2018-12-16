/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.put.poznan.building.app;

/**
 * <h1>Klasa Pokoj</h1>
 *
 * @author Amarantowy
 * @version 1.0
 */
public class Room extends Location {

    Double area;
    Double cube;
    Double heating;
    Double light;

    //kosntruktory
    /**
     * Konstruktor
     *
     * @param nazwa Pierwszy parametr konstruktora - nazwa danej lokalizacji
     */
    public Room(String nazwa) {
        super(nazwa);
    }

    /**
     * Konstruktor bezparametrowy
     *
     */
    public Room() {
    }

    /**
     * Getter Area
     *
     * @return zwraca powierzchnię danego pokoju
     */
    public Double getArea() {
        return area;
    }

    /**
     * Getter Cube
     *
     * @return zwraca kubaturę danejlokacji
     */
    public Double getCube() {
        return cube;
    }

    /**
     * Getter Heating
     *
     * @return zwraca zużycie energii na ogrzewanie danego pokoju
     */
    public Double getHeating() {
        return heating;
    }

    /**
     * Getter Light
     *
     * @return zwraca moc oświetlenia w danym pokoju
     */
    public Double getLight() {
        return light;
    }

}
