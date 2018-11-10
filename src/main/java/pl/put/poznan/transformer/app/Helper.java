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
public final class Helper {
    
    public static <T extends Location> T getObjectById(HashSet<T> set, int id){
        T loc = null;
        for (T t : set) {
            if (t.getId() == id) {
                loc = t;
            }
        }
        return loc;
    }
   
}
