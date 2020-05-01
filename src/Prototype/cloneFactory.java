/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Tayyab Raza
 */
public class cloneFactory {
    
     
    
    public Animal getClone(Animal animal) {
        return animal.makeCopy();
    }


}
