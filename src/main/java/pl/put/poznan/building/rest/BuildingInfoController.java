package pl.put.poznan.building.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import pl.put.poznan.building.app.Building;
import pl.put.poznan.building.app.SetsOfLocations;
import pl.put.poznan.building.app.Location;
import pl.put.poznan.building.app.Room;
import pl.put.poznan.building.app.Level;
import pl.put.poznan.building.logic.AreaCalculator;
import pl.put.poznan.building.logic.CubatureCalculator;
import pl.put.poznan.building.logic.LightingCalculator;

@RestController
public class BuildingInfoController {

    private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);

    // GET LOKACJE
    @RequestMapping(value = "/locations", method = RequestMethod.GET, produces = "application/json")

    public HashSet<Location> getLokacje() {
        logger.info("Sending JSON containing locations info");
        return SetsOfLocations.getHashSetLocations();
    }

    // GET, POST buildings
    @RequestMapping(value = "/buildings", method = RequestMethod.GET, produces = "application/json")

    public HashSet<Building> getBudynki() {
        // log
        logger.info("Sending JSON containing buildings info");
        
        return SetsOfLocations.getHashSetBuildings();
    }

    @RequestMapping(value = "/buildings", method = RequestMethod.POST)
    public Building post(@RequestBody Building budynek) {
        // log
        logger.info("Receiving JSON containing building info");
        logger.debug("id: {}, name: {}, floorList: {}", budynek.getId(), budynek.getName(), budynek.getPoziomy().toString());
        
        // dodanie nowych elementów do odpowiednich zbiorów
        for (Level poz : budynek.getPoziomy()) {
            for (Room pom : poz.getRooms()) {
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
        // log
        logger.info("Sending JSON containing floors info");
        
        return SetsOfLocations.getHashSetLevels();
    }

    // GET pomieszczenia
    @RequestMapping(value = "/rooms", method = RequestMethod.GET, produces = "application/json")

    public HashSet<Room> getPomieszczenia() {
        // log
        logger.info("Sending JSON containing rooms info");
        
        return SetsOfLocations.getHashSetRooms();
    }

    // GET area
    @RequestMapping(value = "/calculate-area/{id}", method = RequestMethod.GET)
    public Double getArea(@PathVariable("id") String id) {
        // log
        logger.info("Sending calculated area for requested location");
        logger.debug("Requested object's id: {}", id);
        
        return AreaCalculator.calculateArea(id);
    }

    // GET cubature
    @RequestMapping(value = "/calculate-cubature/{id}", method = RequestMethod.GET)
    public Double getCubature(@PathVariable("id") String id) {
        // log
        logger.info("Sending calculated cubature dor requested location");
        logger.debug("Requested object's id: {}", id);
        
        return CubatureCalculator.calculateCubature(id);
    }

    // GET exposition
    @RequestMapping(value = "/calculate-exposition/{id}", method = RequestMethod.GET)
    public Double getExposition(@PathVariable("id") String id) {
        // log
        logger.info("Sending calculated exposition for requested location");
        logger.debug("Requested object's id: {}", id);
        
        return LightingCalculator.calculateExposition(id);
    }
}
