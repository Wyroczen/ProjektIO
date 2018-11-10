package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import pl.put.poznan.transformer.app.Building;
import pl.put.poznan.transformer.app.SetsOfLocations;
import pl.put.poznan.transformer.app.Location;
import pl.put.poznan.transformer.app.Room;
import pl.put.poznan.transformer.app.Level;
import pl.put.poznan.transformer.logic.AreaCalculator;
import pl.put.poznan.transformer.logic.CubatureCalculator;


@RestController
public class TextTransformerController {
    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);
        
        // GET LOKACJE
    @RequestMapping(value = "/locations", method = RequestMethod.GET, produces = "application/json")
    
    public HashSet<Location> getLokacje() {
        return SetsOfLocations.getHashSetLocations();
    }
    
        // GET, POST buildings
    @RequestMapping(value = "/buildings", method = RequestMethod.GET, produces = "application/json")
    
    public HashSet<Building> getBudynki() {
        return SetsOfLocations.getHashSetBuildings();
    }

    @RequestMapping(value = "/buildings", method = RequestMethod.POST)
    public Building post(@RequestBody Building budynek) {
        // log the parameters
        logger.debug(budynek.toString());
        // dodanie nowych elementów do odpowiednich zbiorów
        for(Level poz : budynek.getPoziomy()){
            for(Room pom : poz.getRooms()){
                SetsOfLocations.addListaLokacji(pom);
                SetsOfLocations.addListaPomieszczen(pom);
            }
            SetsOfLocations.addListaLokacji(poz);
            SetsOfLocations.addListaPoziomow(poz);
        }        
        SetsOfLocations.addListaLokacji(budynek);
        SetsOfLocations.addListaBudynkow(budynek);
        return budynek;
    }
    
        // GET poziomy
    @RequestMapping(value = "/floors", method = RequestMethod.GET, produces = "application/json")
    
    public HashSet<Level> getPoziomy() {
        return SetsOfLocations.getHashSetLevels();
    }
    
        // GET pomieszczenia
    @RequestMapping(value = "/rooms", method = RequestMethod.GET, produces = "application/json")
    
    public HashSet<Room> getPomieszczenia() {
        return SetsOfLocations.getHashSetRooms();
    }
    
        // GET area
    @RequestMapping(value = "/calculate-area/{id}", method = RequestMethod.GET)
    public Double getArea(@PathVariable("id") String id) {
        //return AreaCalculator.calculateArea(id);
        return AreaCalculator.calculateArea(id);
    }
    
        // GET area
    @RequestMapping(value = "/calculate-cubature/{id}", method = RequestMethod.GET)
    public Double getCubature(@PathVariable("id") String id) {
        //return AreaCalculator.calculateArea(id);
        return CubatureCalculator.calculateCubature(id);
    }
}




